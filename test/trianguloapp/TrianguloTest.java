/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trianguloapp;

import java.util.HashSet;
import java.util.Set;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Gabriel
 */
public class TrianguloTest {
    /**
     * Test of GetProperties method, of class Triangulo.
     */
    @Test
    public void testGetProperties() {
        System.out.println("GetProperties");
        Triangulo instance = new Triangulo();
        instance.setA(2);        
        instance.setB(2);
        instance.setC(2);
        
        Set<String> expResult = new HashSet<>();
        expResult.add("Válido");
        expResult.add("Equilátero");
        
        Set<String> result = instance.GetProperties();
        
        assertEquals(expResult, result);
    }
    
}
