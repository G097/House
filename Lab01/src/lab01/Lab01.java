/*
 * This Program does is printing out even numbers between 
 * 0- 100
 */
package lab01;

/**
 *
 * @author Gabriel L BSC345
 */
public class Lab01 {

    public static void main(String[] args) {

        /**
         * A for loop with a if statement determining the output
         */
        for (int i = 0; i <= 100; i++) {  // for loop that state i = 100 and continue until i <= 100

            if (i % 2 == 0) // if statement that takes i (with it current value) and divides by 2 and if remainder equal 0 
            {
                System.out.println("Num i = " + i); //this will prints outs "Num i = i "
            }

        }
    }

}
