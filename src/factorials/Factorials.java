/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorials;

/**
 *
 * @author bulba
 */
public class Factorials {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i1;
        int i2;
        for (i1 = 1; i1 <= 10; i1++) {
            int i3 = 1;
            for (i2 = 2; i2 <= i1; i2++) {
                i3 = i3 * i2;
            };
            System.out.println(i1 + " factorial is " + i3);
        };
    }

}
