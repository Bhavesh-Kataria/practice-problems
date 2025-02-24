package all_practice_problems.LineComparison;

import java.util.Scanner;

public class LineComparison {
    static double calculateLength(int x1,int y1,int x2,int y2){
        double tempVal = Math.pow(x2-x1,2)+Math.pow(y2-y1,2);
        double length = Math.sqrt(tempVal);
        return  length;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //use case 2
        System.out.println("Enter x and y co-ordinates of point 1");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        System.out.println("Enter x and y co-ordinates of point 2");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        double length1 = calculateLength(x1,y1,x2,y2);

        System.out.println("Enter x and y co-ordinates of point 3");
        int x3 = sc.nextInt();
        int y3 = sc.nextInt();
        System.out.println("Enter x and y co-ordinates of point 4");
        int x4 = sc.nextInt();
        int y4 = sc.nextInt();
        double length2 = calculateLength(x3,y3,x4,y4);

        if( length1 == length2){
            System.out.println("Both lines are equal in length");
        }else{
            System.out.println("Lines are unequal in length");
        }
    }
}
