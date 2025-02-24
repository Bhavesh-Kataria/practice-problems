package all_practice_problems.LineComparison;

import java.util.Scanner;

class Point{
    int x;
    int y;
    Point(int x , int y){
        this.x = x;
        this.y =y;
    }
}

class Line implements Comparable{
    Point p1;
    Point p2;
    Double length;
    Line(Point p1,Point p2){
        this.p1=p1;
        this.p2=p2;
    }
    double calculateLength(){
        double tempVal = Math.pow(p2.x-p1.x,2)+Math.pow(p2.y-p1.y,2);
        double length = Math.sqrt(tempVal);
        return  length;
    }

    @Override
    public int compareTo(Object o) {
        Double length2 = (Double) o;
        if(this.length<length2){
            return -1;
        } else if (this.length>length2) {
            return +1;
        }else{
            return 0;
        }
    }
}

public class LineComparison {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //use case 3 and 4
        System.out.println("Enter x and y co-ordinates of point 1");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        Point p1 = new Point(x1,y1);
        System.out.println("Enter x and y co-ordinates of point 2");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        Point p2 = new Point(x2,y2);
        Line l1 = new Line(p1,p2);
        Double length1 = l1.calculateLength();
        l1.length = length1;

        System.out.println("Enter x and y co-ordinates of point 3");
        int x3 = sc.nextInt();
        int y3 = sc.nextInt();
        Point p3 = new Point(x3,y3);
        System.out.println("Enter x and y co-ordinates of point 4");
        int x4 = sc.nextInt();
        int y4 = sc.nextInt();
        Point p4 = new Point(x4,y4);
        Line l2 = new Line(p3,p4);
        Double length2 = l2.calculateLength();
        l2.length = length2;

        int result = length1.compareTo(length2);
        if(result == 1){
            System.out.println("Line 1 is longer than line 2");
        }else if(result == -1){
            System.out.println("Line 1 is shorter than line 2");
        }else{
            System.out.println("Line 1 and Line 2 are equal in length");
        }


    }
}
