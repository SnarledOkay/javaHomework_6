package Homework;

import java.util.Scanner;

public class employeeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        System.out.println("Enter the number of employees: ");
        int n = Integer.parseInt(scanner.nextLine()) ;
        Employee employee [] = new Employee[n] ;
        for(int i = 0 ; i < n ; i++){
            if(i > 0){
                System.out.println();
            }
            System.out.println("Enter the information of employee (in the order of ID, name, age, experience: ");
            int id = Integer.parseInt(scanner.nextLine()) ;
            String name = scanner.nextLine() ;
            int age = Integer.parseInt(scanner.nextLine()) ;
            double experience = Double.parseDouble(scanner.nextLine()) ;
            employee[i] = new Employee(id,name,age,experience) ;
        }
        for(int i = 0; i < n ; i++){
            System.out.println("Employee " + (i+1) + ":");
            System.out.println(employee[i]);
            System.out.println();
        }
    }
}
