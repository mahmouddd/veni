/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package agencedelocationdevoiture;

/**
 *
 * @author AhmedAsus
 */
public class Voiture {

    private String immatriculation ;
    private String marque ;
    private float prix ;


    //methode
    Voiture ()
    {
        immatriculation ="";
        marque ="";
        prix=0;
    }

   Voiture (String immatric, String marque , float prix)
    {
        this.immatriculation =immatric  ;
        this.marque=marque;
        this.prix =prix;

    }
    @Override
   public String toString ()
    {return "De Immatriculation:"+immatriculation +"/n Marque:"+marque+"/n Prix:"+prix ;}

    public String getImmatriculation() {
        return immatriculation;
    }

    public String getMarque() {
        return marque;
    }

    public float getPrix() {
        return prix;
    }

    public void setImmatriculation(String immatriculation) {
        this.immatriculation = immatriculation;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    public boolean equals (Voiture V)
    {
        if (this.marque.equals(V.marque)==true && this.prix==V.prix)
        {
            return true;
        }
        return false;
    }
}
