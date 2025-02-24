package all_practice_problems.LineComparison;

import java.util.Scanner;

public class LineComparison {
    static void calculateLength(int x1,int y1,int x2,int y2){
        double tempVal = Math.pow(x2-x1,2)+Math.pow(y2-y1,2);
        double length = Math.sqrt(tempVal);
        System.out.println("Lenght of line is "+length+" units");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //use case 1
        System.out.println("Enter x and y co-ordinates of point 1");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        System.out.println("Enter x and y co-ordinates of point 2");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        calculateLength(x1,y1,x2,y2);
    }
}
