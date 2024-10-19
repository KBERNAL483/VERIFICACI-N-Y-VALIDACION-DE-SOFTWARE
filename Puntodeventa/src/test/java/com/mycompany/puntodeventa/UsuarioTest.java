/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.mycompany.puntodeventa;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author kaleb
 */
public class UsuarioTest {
    
    public UsuarioTest() {
    }

    @Test
    public void testGetId() {
        System.out.println("getId");
        Usuario instance = new Usuario(9, "Keyla", "Bernal" ,"", "");
        int expResult = 9;
        int result = instance.getId();
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }

    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 100;
        Usuario instance = new Usuario (9, "Keyla", "Bernal" ,"", "");
        instance.setId(id);
        int result = instance.getId();
        
        assertEquals(id, result);
        //fail("The test case is a prototype.");
    }

    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Usuario instance = new Usuario (9, "Keyla", "Bernal" ,"", "");
        String expResult = "Keyla";
        String result = instance.getNombre();
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }

    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "Keyla";
        Usuario instance = new Usuario (9, "Keyla", "Bernal" ,"", "");
        instance.setNombre(nombre);
        //fail("The test case is a prototype.");
    }

    @Test
    public void testGetCorreo() {
        System.out.println("getCorreo");
        Usuario instance = new Usuario (9, "Keyla", "Bernal" ,"", "");
        String expResult = "Bernal";
        String result = instance.getCorreo();
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }

    @Test
    public void testSetCorreo() {
        System.out.println("setCorreo");
        String correo = "Bernal";
        Usuario instance = new Usuario (9, "Keyla", "Bernal" ,"", "");
        instance.setCorreo(correo);
        //fail("The test case is a prototype.");
    }

    @Test
    public void testGetContra() {
        System.out.println("getContra");
        Usuario instance = new Usuario (9, "Keyla", "Bernal" ,"", "");
        String expResult = "";
        String result = instance.getContra();
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }

    @Test
    public void testSetContra() {
        System.out.println("setContra");
        String contra = "";
        Usuario instance = new Usuario (9, "Keyla", "Bernal" ,"", "");
        instance.setContra(contra);
        //fail("The test case is a prototype.");
    }

    @Test
    public void testGetRol() {
        System.out.println("getRol");
        Usuario instance = new Usuario (9, "Keyla", "Bernal" ,"", "");
        String expResult = "";
        String result = instance.getRol();
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }

    @Test
    public void testSetRol() {
        System.out.println("setRol");
        String rol = "";
        Usuario instance = new Usuario (9, "Keyla", "Bernal" ,"", "");
        instance.setRol(rol);
       // fail("The test case is a prototype.");
    }

    @Test
    public void testToString() {
        System.out.println("toString");
        Usuario instance = new Usuario (9, "Keyla", "Bernal" ,"", "");
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
       // fail("The test case is a prototype.");
    }
    
}
