package Login;
import Graph.GraphEdgeMatrix;
import Graph.GraphException;
public class Accounts {
 
    public int idAccount;
    public String name;
    public String lastName;
    public String birthdate;
    public String mail;
    public String region;
    public GraphEdgeMatrix gem;
    public Profiles profile;
    

    public Accounts(String name, String lastName, String birthdate, String mail, String region) {
        this.name = name;
        this.lastName = lastName;
        this.birthdate = birthdate;
        this.mail = mail;
        this.region = region;
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
    public int getIdAccount() {
        return idAccount;
    }

    public void setIdAccount(int idAccount) {
        this.idAccount = idAccount;
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

   

    @Override
    public String toString() {
        return idAccount + "," + name + "," + lastName + "," +  "," + birthdate + "," + mail + "," + region;
    }

    
    
    
}
