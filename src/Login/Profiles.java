/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Login;

/**
 * Class representing user profiles.
 * Clase que representa perfiles de usuario.
 */
public class Profiles {
 private String name; // Profile name / Nombre del perfil
    private int id; // Profile ID / ID del perfil
    private int age; // Profile age / Edad del perfil
    private String image; // Profile image URL / URL de la imagen del perfil

    /**
     * Constructor for creating a profile without an image.
     * Constructor para crear un perfil sin imagen.
     *
     * @param name Name of the profile / Nombre del perfil
     * @param age Age of the profile / Edad del perfil
     */
    
    public Profiles(int id,String name,int age,String image){
    this.id=id;
    this.name=name;
    this.age=age;    
    this.image=image;
    }
    // Getter and Setter methods / Métodos Getter y Setter
    public void setId(int id){
        this.id=id;
    }
    public int getId(){
        return id;
    }
    public void setName(String name){
    this.name=name;
    }
    public String getName(){
        return name;
    } 
    public void setAge(int age){
    this.age=age;
    }
    public int getAge(){
        return age;
    }
     public void setImage(String image){
    this.image=image;
    }
    public String getImage(){
        return image;
    }
            
  /**
     * String representation of the profile object.
     * Representación en cadena del objeto perfil.
     *
     * @return A string representation of the profile object / Una representación en cadena del objeto perfil
     */
        @Override
    public String toString(){
        return "profiles{" +
                "Id=" + id +
                "Name=" + name +
                ",Age=" + age + '\'' +
                ",image='" + image + '\''+
                '}';
    }
}
