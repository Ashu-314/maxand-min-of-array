// import java.util.*;

// public class Arrays {
//     public static void main(String[] args){
//     // int [] marks = new int[3];
//     // int marks[] = {18,80,86};
//     // marks[0] = 18;
//     // marks[1] = 80;
//     // marks[2] = 86;
//     // System.out.println(marks[0]);
//     // System.out.println(marks[1]);
//     // System.out.println(marks[2]);

//     // for(int i=0;i<3;i++){
//     //     System.out.println(marks[i]);
//     // }

//     // Scanner sc = new Scanner(System.in);
//     // int size = sc.nextInt();
//     // int number[] = new int[size];

//     // for(int i=0;i<size;i++){
//     //     number[i] = sc.nextInt();
//     // }
     
//     // for(int i=0;i<=size;i++){
//     //     System.out.println(number[i]); 
//     // }

//     //(Q) Take an array as input from the user and search for a given number x and print thier INDEX value
     
//     // Scanner sc = new Scanner(System.in);
//     //  int  size = sc.nextInt();
//     //  int numbers[] = new int[size];

//     //  for(int i=0;i<size;i++){
//     //     numbers[i]= sc.nextInt();
//     //   }
//     //   int x = sc.nextInt();

//     //  for(int i=0;i<numbers.length;i++){
//     //     if(numbers[i]==x){
//     //         System.out.println("x found at index: "+i);
//     //     }
//     //  }
//     //   take a name as a input in a array and print
    
//     // Scanner sc = new Scanner(System.in);
//     // int size = sc.nextInt();
//     // String names[] = new String[size];


//     // //input
//     // for(int i=0; i<size; i++) {
//     //     names[i] = sc.next();
//     // }
   
//     // //output
//     //  for(int i=0; i<names.length; i++) {
//     //      System.out.println("name " + (i+1) +" is : " + names[i]);
//     //  }
    
//     //practice the very important concept that is linear search algoritm
    
//     Scanner sc = new Scanner(System.in);
//     int size = sc.nextInt();

//     int numbers[]  = new int[size];
    
//     for(int i=0;i<size;i++){
//         numbers[i] =sc.nextInt();
//     }
//     int x = sc.nextInt();

//     for(int i=0;i<numbers.length;i++){
//         if(numbers[i]==x){
//             System.out.println("x found at index: "+i);
           
// }
//     }
// }
// }

//     // }
//     // int number [] = new int [5];
//     // for(int i=1;i<=10;i++){
//     //      System.out.println(number[1]);
//     // }

//     // int number[] = {1,2,3,4,5,6,7,8,9,10};
//     // for(int i=0;i<=10;i++){
//     //     System.out.println(number[i]);
//     // }
//     // Scanner sc = new Scanner(System.in);
//     //  int  size = sc.nextInt();
//     //  int numbers[] = new int[size];

//     //  for(int i=0;i<size;i++){
//     //     numbers[i]= sc.nextInt();
//     //   }
//     //   int x = sc.nextInt();

//     //  for(int i=0;i<numbers.length;i++){
//     //     if(numbers[i]==x){
//     //         System.out.println("x found at index: "+numbers.hashCode());
//     //     }
//     //  }
//     // int[] score = {3,1,5,7,2}; 
// // int min = score[0];

// // for(int i = 1; i < score.length; i++) {
// //    if(min > score[i])
// //       min = score[i];
// // }
// // System.out.println(min);

// // int max = score[0];
// // for(int i=1;i<score.length;i++){
// //     if(max<score[i])
// //     max = score[i];
// // }
// // System.out.println(max);

// // for(int i=0;i<score.length;i++){
// //     if(score[i]>max){
// //         if(score[i]>max & score[i]!=max){
         
// //         }
// //         System.out.println(max);
// //     }
// //     System.out.println();
    
// // }

// // int arr[] = new int [] {4,2,3,7};

// //      int n=arr.length;
// //      for(int i=n-1; i>=0; i--)
// //        System.out.print(arr[i]+" "); 
       
// // int a [] = {5,1,15,20,25};
// // int i,j,m;
// // i= ++a[1];
// // j=a[1]++;
// // m=a[i++];
// // System.out.print(i+" ");
// // System.out.print(j+" ");
// // System.out.print(m+" ");

// // Scanner sc = new Scanner(System.in);
// //     int size = sc.nextInt();
// //     int number[] = new int[size];

// //     for(int i=0;i<size;i++){
// //         number[i] = sc.nextInt();
// //     }
     
// //     for(int i=0;i<=size;i++){
// //         System.out.println(number[i]); 
// //     }


import java.util.*;

public class MaxMinArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] numbers = new int[size];
        System.out.println("Enter " + size + " elements of the array:");
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }
        int max = numbers[0];
        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i]; 
            }
            if (numbers[i] < min) {
                min = numbers[i]; 
            }
        }
         int dif = max - min;

        // Output the results
        System.out.println("Maximum value: " + max);
        System.out.println("Minimum value: " + min);
        System.out.println("Difference between max and min: " + dif);
    }
}





