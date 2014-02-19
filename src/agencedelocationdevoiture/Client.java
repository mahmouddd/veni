/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package agencedelocationdevoiture;

/**
 *
 * @author AhmedAsus
 */
public class Client {

    private String nom;
    private String prenom ;
    private double code;
    //les methodes
    Client ()
    {
        nom="";
        prenom="";
        code=0;

    }
    Client (String nom,String prenom,double code)
    {
        this.nom=nom;
        this.prenom=prenom;
        this.code=code;
    }

    public double getCode() {
        return code;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setCode(double code) {
        this.code = code;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }


    @Override
    public String toString ()
    {
        return "nom prenom:"+nom+" "+prenom+"/n Code :"+code;
    }


    public boolean equals(Client C)
    {
        if (this.code==C.code)
            return true;
        return false;
    }
}
