/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TowerOfHanoi;

/**
 *
 * @author User
 */
public class TowerOfHanoi {

       // Recursive function to solve Tower of Hanoi
    public static void hanoi(int n, char from, char to, char auxilary) {

        // Base condition
        if (n == 1) {
            System.out.println("Move disk 1 from " + from + " to " + to);
            return;
        }

        // Move n-1 disks to auxiliary rod
        hanoi(n - 1, from, auxilary, to);

        // Move largest disk
        System.out.println("Move disk " + n + " from " + from + " to " + to);

        // Move n-1 disks to destination rod
        hanoi(n - 1, auxilary, to, from);
    }
    public static void main(String[] args) {
        // TODO code application logic here
          int n = 3;

        System.out.println("Tower of Hanoi\n");
        hanoi(n, 'A', 'C', 'B');
    }
    
}
