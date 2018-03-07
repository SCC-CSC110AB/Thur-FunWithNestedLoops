package thur.funwithnestedloops;

/**
 *
 * @author john
 */
public class ThurFunWithNestedLoops {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final int LENGTH = 4;
        for (int i = 0; i <= LENGTH; i++) {
            for (int j = 0; j <= i; j++) {
                if (i == 0 || i == LENGTH || j == 0 || j == i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                
            }
            System.out.println();
        }
    }
    
    /*
    
    *****   *       *           *****       *****     *       *     
    *   *   **      **         *****       *   *     ***     * *    
    *   *   ***     * *       *****       *   *     *****   *   *   
    *   *   ****    *  *     *****       *   *       ***     * *    
    *****   *****   *****   *****       *****         *       *     
    
    
    */

}
