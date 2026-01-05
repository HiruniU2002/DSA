/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package RabbitProblem;

/**
 *
 * @author User
 */
public class RabbitProblem {

    /**
     * @param args the command line arguments
     */
     public static void rabbit(int n){
         int a = 0, b = 1, c;
         
         System.out.println("Rabbit Problem ");
         
         for(int i = 1; i <= n; i++){
             System.out.println(b +" ");
            
             c = a+b;
              a = b;
             b = c;
         }
         System.out.println();
     }

    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Rabbit Problem\n");
        
        rabbit(12);
    }
    
}
