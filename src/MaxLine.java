import java.util.Scanner;
public class MaxLine {
    public static void main (String [] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first point coordinates:");
        int xA = scanner.nextInt();
        int yA = scanner.nextInt();
        System.out.println ("Enter second point coordinates:");
        int xB = scanner.nextInt();
        int yB = scanner.nextInt();
        System.out.println ("Enter third point coordinates:");
        int xC = scanner.nextInt();
        int yC = scanner.nextInt();

        double firstDist = Math.sqrt(Math.pow(xA - xB , 2) + Math.pow(yA - yB , 2));
        double secondDist = Math.sqrt(Math.pow(xB - xC , 2) + Math.pow(yB - yC , 2));
        double thirdDist = Math.sqrt(Math.pow(xA - xC , 2) + Math.pow(yA - yC , 2));

        if (firstDist > secondDist && firstDist > thirdDist){
            System.out.println("Max line created by the following points:" + "(" + xA +"," + yA+ "), ("+ xB +"," + yB+ ")");
        } else if (secondDist > firstDist && secondDist > thirdDist) {
            System.out.println("Max line created by the following points:" + "(" + xB +"," + yB+ "), ("+ xC +"," + yC+ ")");
        } else if (thirdDist > secondDist && thirdDist > firstDist){
            System.out.println("Max line created by the following points:" + "(" + xA +"," + yA+ "), ("+ xC +"," + yC+ ")");
        } else if (firstDist == secondDist) {
            System.out.println("(" + xA +"," + yA+ "), ("+ xB +"," + yB+ ")");
        } else if (thirdDist == secondDist) {
            System.out.println("(" + xC + "," + yC + "), (" + xB + "," + yB + ")");
        } else {
            System.out.println("(" + xC + "," + yC + "), (" + xA + "," + yA + ")");
            }
    }
}
