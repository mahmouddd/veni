/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package agencedelocationdevoiture;

/**
 *
 * @author AhmedAsus
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Voiture V=new Voiture("160 tun 1111","VW Golf 7" , 37000);
        ListVoiture W = new ListVoiture();
            System.out.print("hello world");
        W.AjouterVoiture(V);
        W.afficherVoitures();
    }

}
