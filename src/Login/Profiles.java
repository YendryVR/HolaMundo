/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Login;

//import com.fasterxml.jackson.annotation.JsonCreator;
//import com.fasterxml.jackson.annotation.JsonProperty;

public class Profiles {
    private String name;
    private int id;
    private int age;
    private String image;
    public Profiles(String name,int age){
    this.name=name;
    this.age=age;    
    }
    
    public Profiles(int id,String name,int age,String image){
    this.id=id;
    this.name=name;
    this.age=age;    
    this.image=image;
    }
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
