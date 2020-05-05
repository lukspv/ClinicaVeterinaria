/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import conexao.FabricaConexao;
import entidade.*;
import javax.swing.JOptionPane;

/**
 *
 * @author lucas
 */
public class AnimalDao {

    private String Comando;//comando sql
    private PreparedStatement ps;//preparando o ambiente para o comando sql (intermediario)
    private ResultSet rs;// armazenar os dados do banco da aplicação (apenas nas consultas)
    private Connection Conecta;

    //metodos
    public void Cadastrar(Animal animal) throws SQLException {

        Conecta = FabricaConexao.Conectar();
        Comando = "insert into animal(Aninome,Aniraca,Aniclass,Anicpf,Aninomedono,Anitelefone,Aniendereco) values (?,?,?,?,?,?,?)";
        ps = Conecta.prepareStatement(Comando);

        ps.setString(1, animal.getAninome());
        ps.setString(2, animal.getAniraca());
        ps.setString(3, animal.getAniclass());
        ps.setString(4, animal.getAnicpf());
        ps.setString(5, animal.getAninomedono());
        ps.setString(6, animal.getAnitelefone());
        ps.setString(7, animal.getAniendereco());

        ps.execute();

        FabricaConexao.FecharConexao();

    }

    /*public void Alterar(Modelo modelo) throws SQLException{
        
        Conecta=FabricaConexao.Conectar();
        Comando="update modelo set Modesc = ?, Mofacnpj = ? where Moid= ?;";
        ps=Conecta.prepareStatement(Comando);
        ps.setString(1, modelo.getmodesc());
        ps.setString(2, modelo.getfabricante().getfacnpj());
        ps.setInt(3,modelo.getmoid());
        
        ps.execute();
        
        FabricaConexao.FecharConexao();
        
        
        
        
    }*/
 /*   public void Excluir(int id) throws SQLException{
        
        Conecta=FabricaConexao.Conectar();
        Comando="delete from Modelo where Moid=?;";
        ps=Conecta.prepareStatement(Comando);
        ps.setInt(1,id);
        ps.execute();
        
        FabricaConexao.FecharConexao();
        }*/
 /* public List<Modelo> ListarTodos(String nome) throws SQLException{
            
        Conecta=FabricaConexao.Conectar();
        Comando="select * from Modelo\n" +
                 "join Fabricante on Facnpj=Mofacnpj where Modesc like ? \n" +
                 "limit 5";
        ps=Conecta.prepareStatement(Comando);
        ps.setString(1,nome+"%"); 
        rs=ps.executeQuery();
        List<Modelo> Lista = new ArrayList<>();
        while(rs.next()){
            Modelo modelo = new Modelo();
            
            modelo.setmoid(rs.getInt("Moid"));
            modelo.setmodesc(rs.getString("Modesc"));
            
            Fabricante fabricante = new Fabricante();
            
            fabricante.setfacnpj(rs.getString("Facnpj"));
            fabricante.setfanome(rs.getString("Fanome"));
            
            modelo.setfabricante(fabricante);
            
            Lista.add(modelo);
        }
        FabricaConexao.FecharConexao();
        return Lista;

            
        }*/
    public void Buscar(Animal animal) throws SQLException {
        int i = 0;
        int resposta = 10;
        Conecta = FabricaConexao.Conectar();
        System.out.println("CPF: " +animal.getAnicpf());
        String pesq = animal.getAnicpf();
        Comando = "select * from animal where Anicpf ='"+pesq+"';";
        ps = Conecta.prepareStatement(Comando);
        //ps.setString(1, animal.getAnicpf());
        rs = ps.executeQuery();

        if (rs.next()) {

            resposta = JOptionPane.showConfirmDialog(null, "Cadastro existente para o CPF informado\n Deseja prosseguir?", "Aviso", JOptionPane.YES_NO_OPTION);

            if (resposta == 0) {

                Cadastrar(animal);
                JOptionPane.showMessageDialog(null, "Dados Salvos Com Sucesso!");

            } else {
                JOptionPane.showMessageDialog(null, "Operação Cancelada", "Atenção", 0);
            }

// animal = new Funcionario();
            // animal.setFuncpf(rs.getString(""));
            //animal.setFunnome(rs.getString(""));
            //animal.setFuncargo(rs.getString(""));
        }

        if (resposta == 10) {
            Cadastrar(animal);
            JOptionPane.showMessageDialog(null, "Dados Salvos Com Sucesso!");
        }
        FabricaConexao.FecharConexao();
        //System.out.println("iDao" + i);

    }

}
