package Geometry;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        System.out.println("Enter the size of rectangle: ");
        System.out.println("Enter the length: ");
        int length = Integer.parseInt(scanner.nextLine()) ;
        System.out.println("Enter the width: ");
        int width = Integer.parseInt(scanner.nextLine()) ;
        calculateRectangle(length,width);
        System.out.println();
        System.out.println("Enter the size of the square: ");
        System.out.println("Enter the length of side: ");
        int side = Integer.parseInt(scanner.nextLine()) ;
        calculateSquare(side);
    }

    public static void calculateRectangle(int length, int width){
        System.out.println("The area of the rectangle is: "+length*width);
        System.out.println("The perimeter of the rectangle is: " + (length+width)*2);
    }

    public static void calculateSquare(int side){
        System.out.println("The area of the square is: "+side*side);
        System.out.println("The perimeter of the square is: "+side*4);
    }
}
