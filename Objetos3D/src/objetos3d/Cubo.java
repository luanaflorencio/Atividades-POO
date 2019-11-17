/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetos3d;

/**
 *
 * @author luana
 */
public class Cubo implements Objetos3D {
    private double lados;    
    private double largura;
    private double altura;
    private double comprimento;

    public Cubo(double lados, double largura, double altura, double comprimento) {
        this.lados = lados;
        this.largura = largura;
        this.altura = altura;
        this.comprimento = comprimento;
    }
  
    public double getLados() {
        return lados;
    }

    public void setLados(double lados) {
        this.lados = lados;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
      public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }
    
    @Override
    public double areaDaSuperficie(){
        return 6 * (this.getLados());
    }
    @Override
    public double volume(){
        return this.getComprimento() * this.getAltura() * this.getLargura();
    }
}

