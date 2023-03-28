/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package DAO;

/**
 *
 * @author juan cuatindioy
 * guarda y verifica el usuario y contraseña para mayor seguridad.
 */
public interface DAOLogin {
    
    public boolean VerificarUsuarios(String usuario, String contrasenia);
    public String getUsuario();
    public boolean CambiarContrasenia(String contrasenia);
    
}
