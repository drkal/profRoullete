
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Panos
 */
public class writteMe implements Runnable{

    @Override
    public void run() {
         
        FileWriter f = null;
        PrintWriter p = null;
        try {
            f = new FileWriter("src/test.txt", true);
            p = new PrintWriter(f);
//            for(int i=0;i<10;i++)
            p.println(slot.money.getText() + slot.bet.getText() + slot.percent.getText() + slot.games.getText());
            
        } catch (IOException ex) {
            Logger.getLogger(Writer.class.getName()).log(Level.SEVERE, null, ex);
        }finally {
            p.close();
            try {
                f.close();
            } catch (IOException ex) {
                Logger.getLogger(Writer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    }
    

