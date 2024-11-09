import java.util.Scanner;
/**
 * @author Yehuda Rothstein - 329671333
 * @version 11.7.2024
 * This is a Class For Getting the Longest Distance between Three points on a Plain.
 * @apiNote Submition Coresponding Code -  8062225-20441
 */
public class MaxLine {
    public static void main (String [] args) {
        //initate Scannerג
        Scanner scanner = new Scanner(System.in);
        //get First set of Coordinates
        System.out.println("Enter first point coordinates:");
        int xA = scanner.nextInt();
        int yA = scanner.nextInt();
        //get Second set of Coordinates
        System.out.println ("Enter second point coordinates:");
        int xB = scanner.nextInt();
        int yB = scanner.nextInt();
        //get Third set of Coordinates
        System.out.println ("Enter third point coordinates:");
        int xC = scanner.nextInt();
        int yC = scanner.nextInt();

        // Distance Calculations to get the distance between every two points, accourding to the Distance Fromula
         double firstDist = Math.sqrt(Math.pow(xA - xB , 2) + Math.pow(yA - yB , 2));
         double secondDist = Math.sqrt(Math.pow(xB - xC , 2) + Math.pow(yB - yC , 2));
         double thirdDist = Math.sqrt(Math.pow(xA - xC , 2) + Math.pow(yA - yC , 2));

        // Check if one of the Distnces if Bigger than one another
        if (firstDist > secondDist && firstDist > thirdDist)
            System.out.println("Max line created by the following points:" + "(" + xA +"," + yA+ "), ("+ xB +"," + yB+ ")");
             else if (secondDist > firstDist && secondDist > thirdDist)
                System.out.println("Max line created by the following points:" + "(" + xB +"," + yB+ "), ("+ xC +"," + yC+ ")");
                 else if (thirdDist > secondDist && thirdDist > firstDist)
                    System.out.println("Max line created by the following points:" + "(" + xA +"," + yA+ "), ("+ xC +"," + yC+ ")");
                 // if there isint a distance that's bigger than other check accourding to the requseted Order.
                     else if (firstDist == secondDist)
                         System.out.println("(" + xA +"," + yA+ "), ("+ xB +"," + yB+ ")");
                         else if (thirdDist == secondDist)
                            System.out.println("(" + xC + "," + yC + "), (" + xB + "," + yB + ")");
                             else
                                 System.out.println("(" + xC + "," + yC + "), (" + xA + "," + yA + ")");
        }
    }

