package homework2;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
    	
    	// Завдання №1
    	byte b = 1;
    	short s = 13;
    	int i = 130;
    	long l = 1300;

    	float f = 5.25F;
    	double d = 12.75;
    	
    	char c = '2';
    	boolean action = true;
    	
    	
         // Завдання №2
         System.out.println();
         //Byte
         System.out.println("Byte Min = " + Byte.MIN_VALUE);
         System.out.println("Byte Max = " + Byte.MAX_VALUE + "\n");
         //Short
         System.out.println("Short Min = " + Short.MIN_VALUE);
         System.out.println("Short Max = " + Short.MAX_VALUE + "\n");
         //Integer
         System.out.println("Integer Min = " + Integer.MIN_VALUE);
         System.out.println("Integer Max = " + Integer.MAX_VALUE + "\n");
         //Long
         System.out.println("Long Min = " + Long.MIN_VALUE);
         System.out.println("Long Max = " + Long.MAX_VALUE + "\n");
         //Float
         System.out.println("Float Min = " + Float.MIN_VALUE);
         System.out.println("Float Max = " + Float.MAX_VALUE + "\n");    
         //Double
         System.out.println("Double Min = " + Double.MIN_VALUE);
         System.out.println("Double MAx = " + Double.MAX_VALUE + "\n");
         
         // Завдання №3
         System.out.println();
         Scanner sc = new Scanner (System.in);

         System.out.print("Введіть к-ть чисел: ");

         int a = sc.nextInt();

         int[] mas = new int[a];
         int max = mas[0], min = mas[0];

         System.out.print("Введіть числа в масив: ");
         for(int i1 = 0; i1 < mas.length; i1++) {
             mas[i1] = sc.nextInt();
         }           

         for(int i1 = 0; i1 < mas.length; i1++) {
             if(mas[i1] > max) 
                 max = mas[i1];

             if(mas[i1] < min) 
                 min = mas[i1];
         }
         System.out.println("Максимальне число: " + max);
         System.out.println("Мінімальне число: " + min); 
         
         
    }
}
