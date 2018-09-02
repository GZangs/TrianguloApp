/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trianguloapp;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Gabriel
 */
public class Triangulo {

    private double a;
    private double b;
    private double c;
    private Set<String> propriedades;

    public Set<String> getPropriedades() {
        return propriedades;
    }

    public void setPropriedades(Set<String> propriedades) {
        this.propriedades = propriedades;
    }

    public Triangulo() {
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    private double getHipotenusa() {
        double hipotenusa = a;

        if (hipotenusa < b) {
            hipotenusa = b;
        }

        if (hipotenusa < c) {
            hipotenusa = c;
        }

        return hipotenusa;
    }

    public Set<String> GetProperties() {
        propriedades = new HashSet<>();
        
        if (setWhetherIsValidOrNot()) {
            setTipoTriangulo();
        }

        return propriedades;
    }

    private Boolean setWhetherIsValidOrNot() {
        double hipotenusa = getHipotenusa();

        if ((a + b + c - hipotenusa) > hipotenusa) {
            propriedades.add("Válido");
            return true;
        } else {
            propriedades.add("Inválido");
            return false;
        }
    }

    private void setTipoTriangulo() {
        SetIfEquilatero();
        SetIfIsosceles();
        SetIfEscaleno();
        SetIfRetangulo();
    }

    private void SetIfEquilatero() {
        if (a == b && b == c) {
            propriedades.add("Equilátero");
        }
    }

    private void SetIfIsosceles() {
        if (a == b || b == c || c == a) {
            if (a != b || b != c) {
                propriedades.add("Isósceles");
            }
        }
    }

    private void SetIfEscaleno() {
        if (a != b && b != c && c != a) {
            propriedades.add("Escaleno");
        }
    }

    private void SetIfRetangulo() {
        double hipotenusa = getHipotenusa();
        if (((a * a + b * b + c * c) - hipotenusa * hipotenusa) == hipotenusa * hipotenusa) {
            propriedades.add("Retângulo");
        }
    }
}
