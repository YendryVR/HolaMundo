/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Login;

/**
 *
 * @author samir
 */
public class VerifyLogin  {

    private final String username = "jonxvi"; // Predefined username
    private final String password = "123"; // Predefined password
    public int verification; // Verification variable

    /**
     * Constructor of the VerifyLogin class that receives a verification value.
     *
     * @param verification The verification value.
     */
    public VerifyLogin() {
        this.verification = verification;
    }

    /**
     * Verifies if a username and password match the predefined ones.
     *
     * @param user The username to verify.
     * @param password The password to verify.
     * @return true if the username and password match, false otherwise.
     */
    public boolean verify(String user, String password) {
        return username.equalsIgnoreCase(user) && this.password.equals(password);
    }
}