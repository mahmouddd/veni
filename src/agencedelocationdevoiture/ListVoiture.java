/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package agencedelocationdevoiture;

/**
 *
 * @author AhmedAsus
 */
import java.util.ArrayList;


public class ListVoiture {

ArrayList tab = new ArrayList();

public void AjouterVoiture(Voiture V)
    {
        tab.add(V);
    }
    public void SupprimerVoiture (Voiture V)
    {
        tab.remove(V);
    }

    public void afficherVoitures ()
    {
        for(int i=0; i<tab.size();i++)
        {
            System.out.print("la voiture numero:"+i+" est une "+tab.get(i));
        }
    }
}
