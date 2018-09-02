/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trianguloapp;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class TelaTriangulo {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Triangulo triangulo1 = new Triangulo();
        
        System.out.println("Informa o tipo do triangulo");

        System.out.println("Informa o valor do lado a");
        triangulo1.setA(sc.nextDouble());

        System.out.println("Informa o valor do lado b");
        triangulo1.setB(sc.nextDouble());

        System.out.println("Informa o valor do lado c");
        triangulo1.setC(sc.nextDouble());

        System.out.println("Propriedades do triangulo ->");

        for (String valor : triangulo1.GetProperties()) {
            System.out.println(valor);
        }
    }
}
