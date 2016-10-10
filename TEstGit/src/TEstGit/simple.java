 
package TEstGit;

import java.util.Scanner;

/**
 *
 * @author iucosoft14
 */
public class simple {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // char ch = 'A';

//      System.out.println("ch=" + ch);
        //    System.out.println("ch=" + (int)ch);
//        
//    
//      for(char i=65; i<91; i++)
//      {
//      
//          
//           System.out.println("Litera " + i + " = " + (int)i);
//      }     
//           
        System.out.println("Alege [tot] sau [jumatate]");

        Scanner kes = new Scanner(System.in);

        String ales = kes.nextLine();

        if (ales.equals("tot")) {

            atataTot();
        } else if (ales.equals("jumatate")) {

            arataJumatate();

        }
        else{
         
            System.out.println("Alege doar [tot] sau [jumatate]");
        
        }
        
    } // main

    private static void atataTot() {

        for (char i = 65; i < 65000; i++) {

            System.out.print("Li" + i + " = " + (int) i);

            if (i % 8 == 0) {

                System.out.println(" ");

            }
        }

    }

    private static void arataJumatate() {

        for (char i = 65; i < 65000 / 2; i++) {

            System.out.print("Li" + i + " = " + (int) i + "\t");

            if (i % 8 == 0) {

                System.out.println(" ");

            }
        }

    } 

} // clasa
