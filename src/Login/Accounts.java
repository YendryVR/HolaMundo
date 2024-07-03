package Login;
import Graph.GraphEdgeMatrix;
import Graph.GraphException;
//import com.fasterxml.jackson.annotation.JsonCreator;
//import com.fasterxml.jackson.annotation.JsonProperty;

public class Accounts {
 
    private int id;
    private String name;
    private String lastName;    
    private String mail;
    private String region;
    private String password;
    private String birthdate;
    public GraphEdgeMatrix gem;
    public Profiles profile;
    
    

    //@JsonCreator
    public Accounts(int id,
            String name,
            String lastName,
            String birthdate,
            String mail,
            String region,
            String password){
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.birthdate = birthdate;
        this.mail = mail;
        this.region = region;
        this.password=password;
            try {
         gem = new GraphEdgeMatrix(5);
         } catch (GraphException e) {
            e.printStackTrace();
        }
    }
    public void addProfile(Profiles profile){
        try {   gem.addVertex(profile);
    } catch (GraphException e) {
            e.printStackTrace();
        }
    }
    public GraphEdgeMatrix getGraph(){    
        return gem;
    }
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

