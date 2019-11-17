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
public class Paralelepipedo implements Objetos3D {
    private double base;
    private double altura;
    private double faces;

    public Paralelepipedo(double base, double altura, double faces) {
        this.base = base;
        this.altura = altura;
        this.faces = faces;
    }
    

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getFaces() {
        return faces;
    }

    public void setFaces(double faces) {
        this.faces = faces;
    }
    
    
    @Override
    public double volume() {
        return this.getAltura() * this.getBase();
}

    /**
     *
     * @return
     */
    @Override
    public double areaDaSuperficie() {
            return this.getFaces() *  this.getFaces();
    
    }
}