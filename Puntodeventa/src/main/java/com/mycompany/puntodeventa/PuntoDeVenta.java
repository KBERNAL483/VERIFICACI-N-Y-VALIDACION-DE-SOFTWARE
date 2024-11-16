
package com.mycompany.puntodeventa;

import java.sql.Connection;
import java.util.List;




public class PuntoDeVenta {

    public static void main(String[] args) {
        ConexionSQLite.conectar();
        Connection conexion = ConexioSQLite.conectar();
        
        UsuarioDAO usuarioDao = new UsuarioDAO();
        
        List<Usuario> usuarios;
        usuarios = usuarioDao.leerTodosLosUsuarios();
        imprimirUsuarios(usuarios);
        
        usuarioDao.crearUsuario(new Usuario(0, "Jose", "jose@mail.com", "12345", "admin"));
        usuarioDao.crearUsuario(new Usuario(0, "Alicia", "alicia@mail.com", "12345", "vendedor"));
        usuarioDao.crearUsuario(new Usuario(0, "Juan", "juan@mail.com", "12345", "inventarios"));
        
        
        usuarios = usuarioDao.leerTodosLosUsuarios();
        imprimirUsuarios(usuarios);
        
        Usuario pedro = usuarioDao.leerUsuarioPorCorreo("pedro@mail.com");
        
        if(pedro != null){
            pedro.setNombre("Pedro Valenzuela");
            
            usuarioDao.actualizarUsuario(pedro);
            usuarios = usuarioDao.leerTodosLosUsuarios();
            imprimirUsuarios(usuarios);
            
            usuarioDao.eliminarUsuario(pedro.getId());            
            usuarios = usuarioDao.leerTodosLosUsuarios();
            imprimirUsuarios(usuarios);
        }
        
        
        ConexionSQLite.cerrarConexion();
    }
    
    public static void imprimirUsuarios(List<Usuario> usuarios){
        
        if(!usuarios.isEmpty()){
            System.out.println("=============== USUARIOS ===============");
        
            for(Usuario usuario : usuarios){
                System.out.println(usuario);
            }
        }else{
            System.err.println("No hay usuarios registrados");
        }
    }
}