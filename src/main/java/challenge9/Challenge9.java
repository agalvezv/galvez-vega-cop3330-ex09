package challenge9;
//AGV
//6-5-2021
import java.util.Scanner;

public class Challenge9 {

    static final double CONV = 350;

    public static void main(String[] args) {

        Scanner inputs = new Scanner(System.in);

        System.out.println("What is the length of your room in feet?");
        String valOne = inputs.nextLine();
        int valOneUp = Integer.parseInt(valOne);

        System.out.println("What is the width of the room in feet?");
        String valTwo = inputs.nextLine();
        int valTwoUp = Integer.parseInt(valTwo);

        String responseOne = "You entered dimensions of " + valOne + " by " + valTwo + " feet.";

        System.out.println(responseOne);

        int valArea = (valOneUp*valTwoUp);
        //System.out.println(valArea);
        String valAreaUp = String.valueOf(valArea);

        String responseTwo = "The area is " + valAreaUp + " square feet";
        System.out.println(responseTwo);

        double reqPaint = Math.round(valArea/CONV);
        String reqPaintUp = String.valueOf(reqPaint);

        System.out.println("You will need to purchase " + reqPaintUp + " gallons to cover " + valAreaUp + " square feet.");


    }




}
