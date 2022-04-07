
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Panos
 */
public class myPlayer implements Runnable{

    @Override
    public void run() {
        long start = System.currentTimeMillis();
       long now = System.currentTimeMillis();
  for(int i=0;i<7;i++)
{     
     //open the sound file as a Java input stream
    String gongFile = "src/orig.wav";
    InputStream in = null;
            try {
                in = new FileInputStream(gongFile);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(myPlayer.class.getName()).log(Level.SEVERE, null, ex);
            }

    // create an audiostream from the inputstream
    AudioStream audioStream = null;
            try {
                audioStream = new AudioStream(in);
            } catch (IOException ex) {
                Logger.getLogger(myPlayer.class.getName()).log(Level.SEVERE, null, ex);
            }

    // play the audio clip with the audioplayer class
    AudioPlayer.player.start(audioStream);
        try{
            //do what you want to do before sleeping
            Thread.currentThread().sleep(715);//sleep for 1000 ms
            System.out.println("mpla");
            //do what you want to do after sleeptig
        }
        catch(InterruptedException ie){
        //If this thread was intrrupted by nother thread 
            ie.printStackTrace();
        }

    
    
}
 
    }
     public static void main(String[] args) {
     Thread t10 = new Thread(new myPlayer(), "t10");

         t10.start();

     


         
     
     
     }
    
}
