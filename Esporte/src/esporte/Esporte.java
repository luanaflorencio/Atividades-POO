/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esporte;

/**
 *
 * @author luana
 */
public class Esporte {

    private String descricao;
    private String regras;

    public Esporte(String descricao, String regras) {
        this.descricao = descricao;
        this.regras = regras;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getRegras() {
        return regras;
    }

    public void setRegras(String regras) {
        this.regras = regras;
    }

    public void comparando(Esporte obj2) throws NaoSaoIguaisException {
        if (!this.equals(obj2)) {
            throw new NaoSaoIguaisException();
        }
    }

    public static void main(String[] args) throws NaoSaoIguaisException {
        Esporte e = new Esporte("É pra usar a mão", "Usar a mão");
        Esporte e2 = new Esporte("Natação", "Futebol");
        try {
            e.comparando(e2);
        } catch (NaoSaoIguaisException ex) {
            System.out.println("Objetos diferentes");
        } finally {
            System.out.println("try-catch acabou");
        }
        System.out.println("É o fim?...");
    }
}
