import java.util.Scanner;

public class LawnMowing {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Grass grass = new Grass();

        System.out.println("Grass grows at approx. 0.8cm a day. Let's predict when you should mow your lawn");
        System.out.print("Input your grass height in cm: ");
        grass.setGrassHeightCurrent(sc.nextDouble());
        System.out.print("Input your grass height limit: ");
        grass.setGrassHeightLimit(sc.nextDouble());

        System.out.println("\nDays until next lawn mowing: " + lawnMowPrediction(grass.getGrassGrowth(), grass.getGrassHeightCurrent(), grass.getGrassHeightLimit()));
    }

    public static int lawnMowPrediction(double growth, double heightCurrent, double heightLimit){
        //heightLimit = heightCurrent + x * growth, solve for x

        int count = 0;
        while (heightCurrent < heightLimit){
            heightCurrent = heightCurrent + growth;
            count++;
        }
        return count;
    }
}
