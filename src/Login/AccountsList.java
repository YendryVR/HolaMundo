/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Login;

import javax.swing.JOptionPane;

/**
 * Class representing a list of accounts.
 * Clase que representa una lista de cuentas.
 */
public class AccountsList {

   public Accounts[] ac; // Array to store accounts / Arreglo para almacenar cuentas
    public int pointer = 0; // Pointer to keep track of the current position / Puntero para llevar un seguimiento de la posición actual
    public int max; // Maximum number of accounts that can be stored / Número máximo de cuentas que se pueden almacenar
    public Accounts temp; // Temporary variable to store account during operations / Variable temporal para almacenar la cuenta durante las operaciones

    /**
     * Constructor to initialize an empty list of accounts with a maximum capacity.
     * Constructor para inicializar una lista vacía de cuentas con una capacidad máxima.
     *
     * @param max Maximum number of accounts / Número máximo de cuentas
     */
    public AccountsList(int max){
        this.max = max;
        ac = new Accounts[max];
        create();
    }
    
     /**
     * Copies accounts from another AccountsList object to this one.
     * Copia las cuentas desde otro objeto AccountsList a este.
     *
     * @param al Another AccountsList object / Otro objeto AccountsList
     */
    public void duplicate(AccountsList al){
        this.ac = al.getAc();
    }
    
    /**
     * Initializes the accounts array with null values.
     * Inicializa el arreglo de cuentas con valores nulos.
     */
    public void create(){
        for(int i = 0; i < ac.length; i++){
            ac[i] = null;
        }
    }
     /**
     * Adds an account to the list.
     * Agrega una cuenta a la lista.
     *
     * @param a The account to add / La cuenta a agregar
     */
    public void addAccount(Accounts a){
        ac[pointer] = a;
        pointer++;
    }
    
     /**
     * Searches for an account based on email and password.
     * Busca una cuenta basada en el correo electrónico y la contraseña.
     *
     * @param email    The email of the account to search for / El correo electrónico de la cuenta a buscar
     * @param password The password of the account to search for / La contraseña de la cuenta a buscar
     * @return The found account if credentials match, otherwise null / La cuenta encontrada si las credenciales coinciden, de lo contrario null
     */
    public Accounts searchAccount(String email, String password){
        for(int i = 0; i < ac.length; i++){
            if(ac[i].getMail().equals(email)){
                if(ac[i].getPassword().equals(password)){
                    temp = ac[i];
                    System.out.println(temp);
                } else {
                    JOptionPane.showMessageDialog(null, "Incorrect password");
                }
            } else {
                JOptionPane.showMessageDialog(null, "There is no account associated with that email");
            }  
        }        
        return temp;
    }
     /**
     * Retrieves the array of accounts.
     * Obtiene el arreglo de cuentas.
     *
     * @return The array of accounts / El arreglo de cuentas
     */
    
    public Accounts[] getAc(){
        return ac;
    }
    /**
     * Sets the array of accounts.
     * Establece el arreglo de cuentas.
     *
     * @param ac The array of accounts / El arreglo de cuentas
     */
    public void setAc(Accounts ac[]){
        this.ac = ac;
    }
     /**
     * Returns a string representation of the list of accounts.
     * Devuelve una representación en cadena de la lista de cuentas.
     *
     * @return A string representation of the list of accounts / Una representación en cadena de la lista de cuentas
     */
    public String toString(){
        String result = "List of users\n";
        for(int i = 0; i < pointer; i++){
            result += "" + ac[i] + "\n";
        }
        return result;
    }
}
