/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Login;

/**
 *
 * @author samir
 */
public class VerificarInicioSesion {

    private final String nombreUsuario = "jonxvi"; // Nombre de usuario predefinido
    private final String contrasenna = "Octanechikito26"; // Contraseña predefinida
    public int verificar; // Variable de verificación

    /**
     * Constructor de la clase IniciarSesion que recibe un valor de
     * verificación.
     *
     * @param verificar El valor de verificación.
     */
    public VerificarInicioSesion() {
        this.verificar = verificar;
    }

    /**
     * Verifica si un usuario y una contraseña coinciden con los predefinidos.
     *
     * @param usuario El nombre de usuario a verificar.
     * @param contrasena La contraseña a verificar.
     * @return true si el usuario y la contraseña coinciden, false en caso
     * contrario.
     */
    public boolean verificar(String usuario, String contrasena) {
        return nombreUsuario.equalsIgnoreCase(usuario) && contrasenna.equals(contrasena);
    }
}
