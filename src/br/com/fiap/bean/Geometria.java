package br.com.fiap.bean;

import javax.swing.*;

public class Geometria {
    // Atributos
    private float lado;
    private float altura;
    private double raio;

    // Construtores
    public Geometria(){
    }

    // métodos getters e setters
    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    // Métodos da classe
    // Sobrecarga de métodos são métodos com o mesmo nome, porém com passagem de parametros diferentes
    public void calcularArea(float lado){
        setLado(lado);
        float area = this.lado * this.lado;
        JOptionPane.showMessageDialog(null, String.format("Area do Quadrado: %.2f", area));
    }
    public void calcularArea(float lado, float altura) {
        setLado(lado);
        setAltura(altura);
        float area = this.lado * this.altura;
        JOptionPane.showMessageDialog(null, String.format("Area do Retangulo: %.2f", area));
    }
    public void calcularArea(double raio){
        setRaio(raio);
        double area = Math.PI * Math.pow(raio, 2); //importa o math lib e usa para descobrir a área do circulo
        JOptionPane.showMessageDialog(null, String.format("Area do Circulo: %.2f", area));
    }
}
