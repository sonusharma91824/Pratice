package com.array;
//public class UserBO {
//      public void addUser(User[] userArrray ,User userIns)
//      {
//    	// the method accepts an array of user objects and the new user object to be added as the argument this method adds the new user objects to the array   
//      }
//
//      public void sortUsers(User[] userArrray)
//      {
//    	 // the method accepts an array of user  objects as an argument this method sort the array of user objects based on the name 
//      }
//      public Boolean deleteUse(User[] userArrray , String name)
//      {
//		return null;
//    	  //the method accepts 2 arguements . the first argument is an array of user objects and the name of 
//      }
//      public void displayAll(User[] userArray)
//      {
//    	  // the method accepts an array 
//      }
//}



import java.util.Scanner;

public class BirthRateCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine(); // Move to next line

        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }    

        int totalCount = calculateTotalBirthRates(matrix, n);

        System.out.println(totalCount);

        scanner.close();
    }

    public static int calculateTotalBirthRates(int[][] matrix, int n) {
        int total = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                total += matrix[i][j];
            }
        }

        return total;
    }
}
