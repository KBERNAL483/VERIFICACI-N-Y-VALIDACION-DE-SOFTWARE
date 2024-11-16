
package com.mycompany.puntodeventa;

import static org.junit.Assert.assertEquals;

/**
 *
 * @author kaleb
 */
public class UsuarioDAOMockTest {
    private UsuarioDAO usuarioDAOMock;
    
    private Usuario crearUsuario(){
        return new Usuario(9, "Keyla Bernal", "kbernal@ucgdl.edu.mx","12345", "admin");
    }
    
    
    @Test
    public void _001_1_testCrearUsuario() {
        // Crear usuario simulado
        usuarioDAOMock = Mockito.mock(UsuarioDAO.class);
        
        Usuario usuario = crearUsuario();
                
        // Simular respuesta de metodo crearUsuario
        Mockito.when(usuarioDAOMock.crearUsuario(usuario))
                .thenReturn(Boolean.TRUE);
        
        usuarioDAOMock.crearUsuario(usuario);
        
        // Simular respuesta de lectura
        Mockito.when(usuarioDAOMock.leerUsuarioPorCorreo("kbernal@ucgdl.edu.mx"))
                .thenReturn(usuario);
        
        Usuario lectura = usuarioDAOMock.leerUsuarioPorCorreo("kbernal@ucgdl.edu.mx");
        
        Mockito.verify(usuarioDAOMock).crearUsuario(usuario);
        
        assertEquals(lectura.getNombre(), usuario.getNombre());
        assertEquals(lectura.getCorreo(), usuario.getCorreo());
        assertEquals(lectura.getContra(), usuario.getContra());
        assertEquals(lectura.getRol(), usuario.getRol());
    }
        
    @Test
    public void _001_2_UsuarioExistente(){
        
        usuarioDAOMock = Mockito.mock(UsuarioDAO.class);
        
        Usuario usuario = crearUsuario();
        
        Mockito.when(usuarioDAOMock.crearUsuario(usuario))
                .thenReturn(Boolean.FALSE);
        
        boolean crear = usuarioDAOMock.crearUsuario(usuario);
        
        Mockito.verify(usuarioDAOMock).crearUsuario(usuario);
        
        assertFalse(crear);
    }
    
    @Test
    public void _002_1_testLeerUsuarioPorCorreo() {
        // Crear usuario simulado
        usuarioDAOMock = Mockito.mock(UsuarioDAO.class);
        
        Usuario usuario = crearUsuario();
        
        // Simular respuesta de lectura
        Mockito.when(usuarioDAOMock.leerUsuarioPorCorreo("kbernal@ucgdl.edu.mx"))
                .thenReturn(usuario);
        
        Usuario lectura = usuarioDAOMock.leerUsuarioPorCorreo("kbernal@ucgdl.edu.mx");
        
        Mockito.verify(usuarioDAOMock).leerUsuarioPorCorreo("kbernal@ucgdl.edu.mx");
        
        assertEquals(lectura.getNombre(), usuario.getNombre());
        assertEquals(lectura.getCorreo(), usuario.getCorreo());
        assertEquals(lectura.getContra(), usuario.getContra());
        assertEquals(lectura.getRol(), usuario.getRol());
    }
}


