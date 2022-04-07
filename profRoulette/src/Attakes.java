 /*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.LinkedList;
import java.util.List;
import java.util.Random;




/**
 *
 * @author Panos
 */
public class Attakes {
    
    public static String lost(){
         List<String> l1 = new LinkedList<>();
         l1.add ("Δεν πειράζει ,\nδοκίμασε ξανά!\n");
         l1.add("Mην το βάζεις κάτω!!!\n");
         l1.add("Η τύχη δεν είναι\nμε το μέρος σου!\n");
         l1.add("Δεν πειράζει, όποιος χάνει\nστη ρουλέτα κερδίζει στην αγάπη!!!\n");
         l1.add("Η ζωή θέλει ρίσκο!\nΣυνέχισε...\n");
         l1.add("Κουνήσου λίγο από τη\nθέση σου μήπως και\nαλλάξει η τύχη σου!\n");
         l1.add("Σκέψου θετικά,\nκαι κάτι μπορεί να γίνει\n");
         l1.add("Προσπάθησε λίγο ακόμα!\nΜη σε παίρνει από κάτω\n");
        
      
        
    
       Random random = new Random(); //Create random class object
       int randomNumber = random.nextInt(l1.size()); //Generate a random number (index) with the size of the list being the maximum
       return l1.get(randomNumber) ;
        
    }
    public static String win(){
         List<String> l2 = new LinkedList<>();
         l2.add ("Σήμερα είναι\nη τυχερή σου μέρα!!!\n ");
         l2.add("Που τη βρήκες τόση τύχη!\n");
         l2.add("Βλέπω ετοιμότητα\nγια το καζίνο!!!\n    ");
         l2.add("Η τύχη είναι με το μέρος σου!!!\n");
         l2.add("Φύγαμε για Las Vegas!!!!!!\n");
         l2.add("Τι θα γίνει σήμερα;\nΘα μας αδειάσεις τα ταμεία;\n  ");
         
        
      
        
    
       Random random = new Random(); //Create random class object
       int randomNumber = random.nextInt(l2.size()); //Generate a random number (index) with the size of the list being the maximum
       return l2.get(randomNumber) ;
        
    
    
    }
    
}
