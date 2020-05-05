/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidade;

/**
 *
 * @author lucas
 */
public class Produto {
    
    private int Proid;
    private String Pronome;
    private String Prodval;
    private int qtd;
    private double Prodvalor;

    /**
     * @return the Proid
     */
    public int getProid() {
        return Proid;
    }

    /**
     * @param Proid the Proid to set
     */
    public void setProid(int Proid) {
        this.Proid = Proid;
    }

    /**
     * @return the Pronome
     */
    public String getPronome() {
        return Pronome;
    }

    /**
     * @param Pronome the Pronome to set
     */
    public void setPronome(String Pronome) {
        this.Pronome = Pronome;
    }

    /**
     * @return the Prodval
     */
    public String getProdval() {
        return Prodval;
    }

    /**
     * @param Prodval the Prodval to set
     */
    public void setProdval(String Prodval) {
        this.Prodval = Prodval;
    }

    /**
     * @return the qtd
     */
    public int getQtd() {
        return qtd;
    }

    /**
     * @param qtd the qtd to set
     */
    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    /**
     * @return the Prodvalor
     */
    public double getProdvalor() {
        return Prodvalor;
    }

    /**
     * @param Prodvalor the Prodvalor to set
     */
    public void setProdvalor(double Prodvalor) {
        this.Prodvalor = Prodvalor;
    }
    
}
