/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operatorprecedence;

/**
 *
 * @author Asus
 */
public class OperatorPrecedence {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("1. a / b ^ c ^ d - e + f - g * h + i");
        System.out.println("NEW: 1. ((a / b ^ c) ^ ((d - (e + f))) - ((g * h) + i))");
        System.out.println("\n2. 3 * 10 * 2 / 15 - 2 + 4 ^ 2 ^ 2 ");
        System.out.println("NEW: 2. (((((((3 * 10) * 2) / 15) - (2 + 4)) ^ 2) ^ 2)");
        System.out.println("\n3. r ^ s * t / u - v + w ^ x - y++");
        System.out.println("NEW: (r ^ (((s * t) / u) - (v + w))) ^ (x - (y++))");
    }
    
}
