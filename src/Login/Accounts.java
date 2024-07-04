package Login;
import Graph.GraphEdgeMatrix;
import Graph.GraphException;


public class Accounts {
  // Attributes / Atributos
    private int id;
    private String name;
    private String lastName;    
    private String mail;
    private String region;
    private String password;
    private String birthdate;
    public GraphEdgeMatrix gem;
    public Profiles profile;
      public boolean admin;
    
    
 /**
     * Constructor to initialize an account with the given details.
     * Constructor para inicializar una cuenta con los detalles dados.
     *
     * @param id        The ID of the account / El ID de la cuenta
     * @param name      The name of the account holder / El nombre del titular de la cuenta
     * @param lastName  The last name of the account holder / El apellido del titular de la cuenta
     * @param birthdate The birthdate of the account holder / La fecha de nacimiento del titular de la cuenta
     * @param mail      The email of the account holder / El correo electrónico del titular de la cuenta
     * @param region    The region of the account holder / La región del titular de la cuenta
     * @param password  The password for the account / La contraseña de la cuenta
     */
    public Accounts(int id,
            String name,
            String lastName,
            String birthdate,
            String mail,
            String region,
            String password, boolean admin){
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.birthdate = birthdate;
        this.mail = mail;
        this.region = region;
        this.password=password;
          this.admin=admin;
            try {
         gem = new GraphEdgeMatrix(5);
         } catch (GraphException e) {
            e.printStackTrace();
        }
    }
     /**
     * Method to add a profile to the account.
     * Método para agregar un perfil a la cuenta.
     *
     * @param profile The profile to add / El perfil a agregar
     */ 
    public void addProfile(Profiles profile){
        try {   gem.addVertex(profile);
    } catch (GraphException e) {
            e.printStackTrace();
        }
    }

    
    public boolean isAdmin(){    
        return admin;
    }

    /**
     * Method to get the graph associated with the account.
     * Método para obtener el grafo asociado con la cuenta.
     *
     * @return The graph / El grafo
     */
    public void setAdmin(boolean admin) {
        this.admin = admin;    
    }

    public GraphEdgeMatrix getGraph() {
        return gem;
    }
     // Getter and Setter methods / Métodos Getter y Setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
  
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

      public String getBirhtdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }
    public void setPassword(String password){
        this.password=password;
    }
    public String getPassword(){
        return password;
    }

    @Override
    public String toString(){        
        return "Accounts{" +
                "id=" + id +
                ",name=" + name +
                ",lastName=" + lastName +
                ",birthDate=" + birthdate+
                ",mail=" + mail+
                ",region=" + region +
                ",password=" + password +
                "}";
    
    }
    
}

