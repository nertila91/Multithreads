/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*viti 3_JAVA2_Viktor Shkrivani,Samida Isufaj,Dorina Dishi,Nertila Ciliku*/
/*projekt nr.4 me MultiThreads*/


package multithreading;

import static java.lang.Thread.sleep;
import java.math.BigInteger;

/**
 *
 * @author User
 */
public class ThreadLabel2 implements Runnable {
    private javax.swing.JLabel lb;
    private boolean ndalo = false;
    Integer count = 1;
    
    public void setlb(javax.swing.JLabel jLabel1){
        lb = jLabel1;
    }
    
    public void stop(){
        ndalo = true;
    }
    //bejme count te = me 1
      public void reset(){
        count=1;
         lb.setText("1");
      }
    @Override
    public void run() {
        
        Integer res = 1;
        ndalo = false;
         //To change body of generated methods, choose Tools | Templates.
         //cikli while pret deri sa te klikojme stop per te mbatuar exe
         //per te kontrolluar ndalimin e ciklit perdorim variablin boolean ndalo
         while(ndalo == false){
             count++;
             res = 2*count + 150; // 2*x + 150
             lb.setText(res.toString());
             try {
                 //Mund te ndodh InterruptedException,
                 //qe mund te ndalojne ekzekutimin e funksionit sleep
                sleep(1);                  
             } 
             catch(Exception e){
                 e.printStackTrace();
                 break; //
             }
         }
    }

    /**
     * @param args the command line arguments
     */
    
    
}
