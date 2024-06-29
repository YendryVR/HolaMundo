
package Presentation;

import Archive.Movies;
import Login.Accounts;
import Login.Profiles;
import TDAQueues.QueuesArray;


public class Prueba {
    public static void main(String args[]){
    Accounts a=new Accounts("Elvis","Rodrigues","1992","elvis97@gmail.com","costarica");
    Profiles p=new Profiles("papa",18,"//image2.jpeg");
    Profiles p2=new Profiles("mama",20,"//image2.jpeg");
    Profiles p3=new Profiles("hermano",11,"//image2.jpeg");
    Profiles p4=new Profiles("hermana",19,"//image2.jpeg");
    Profiles p5=new Profiles("tio",40,"//image2.jpeg");
    a.addProfile(p);
    a.addProfile(p2);
    a.addProfile(p3);
    a.addProfile(p4);
    a.addProfile(p5);
    System.out.println(a.getGraph());
    
    String s[]=new String[3];
    s[1]="stalone";
    Movies m=new Movies("antonio","stalone", "accion", "10",s,"usa",60,1,60,2001);
    Movies m2=new Movies("rambo","stalone", "accion", "10",s,"usa",60,1,60,2001);
    Movies m3=new Movies("karen","stalone", "accion", "10",s,"usa",60,1,60,2001);
    QueuesArray qa=new QueuesArray(10);
    qa.insert(m2);
    qa.insert(m);
    qa.insert(m3);
    System.out.println(qa.firstElement());
    System.out.println(qa.getSize());
    }
}
