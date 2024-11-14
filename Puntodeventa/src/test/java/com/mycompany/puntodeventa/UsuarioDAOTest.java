/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.mycompany.puntodeventa;

import UsuarioDAO;
import java.sql.Connection;
import java.util.List;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author kaleb
 */
public class UsuarioDAOTest {
    
    public UsuarioDAOTest() {
    }

        
    private Connection conexion;
    private UsuarioDAOTest usuario;
    @Before
    void setUp()throws SQLException{
        conexion = ConexionSQLite.conectar();
        
        usuario =new UsuarioDAO (conexion);
        
    }
    
    @After
    void tearDown()throws SQLException {
        if (conexion !=null) ) {
        conexion.close 
    }
    }

    @Test
    public void testCrearUsuario() {
        System.out.println("crearUsuario");
        Usuario instance =new Usuario (9, "Keyla", "kalebs.0698@gmail.com");
              
        usuario.crearUsuario(instance);
        
        String correo = instance.getCorreo();
        Usuario lectura = usuario.leerUsuarioPorCorreo(correo);
        
        assertEquals (instance, lectura);
        
    
    }

    @Test
    public void testLeerTodosLosUsuarios() {
        System.out.println("leerTodosLosUsuarios");
        UsuarioDAO instance = new UsuarioDAOTest();
        List<Object> expResult = null;
        List<Object> result = instance.leerTodosLosUsuarios();
        assertEquals(expResult, result);
        
    }

    @Test
    public void testLeerUsuarioPorCorreo() {
        System.out.println("leerUsuarioPorCorreo");
        String correo = expResult.getCorreo();
        UsuarioDAO instance = new UsuarioDAO();
        Object expResult = null;
        Object result = instance.leerUsuarioPorCorreo(correo);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testActualizarUsuario() {
        System.out.println("actualizarUsuario");
        Object usuario = null;
        UsuarioDAO instance = new UsuarioDAO();
        instance.actualizarUsuario(usuario);
        fail("The test case is a prototype.");
    }

    @Test
    public void testEliminarUsuario() {
        System.out.println("eliminarUsuario");
        int id = 0;
        UsuarioDAO instance = new UsuarioDAO();
        instance.eliminarUsuario(id);
        fail("The test case is a prototype.");
    }
    
}
