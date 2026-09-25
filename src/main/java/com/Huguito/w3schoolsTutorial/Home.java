package com.Huguito.w3schoolsTutorial;

public class Home {
    public static void main(String[] args) {

        int myNum = 5;
        float myFloatNum = 5.99f;
        char myLetter = 'D';
        boolean myBool = true;
        String myText = "Hello";


        int x, y, z;
        x = y = z = 50;
        System.out.println(x + y + z);


        String studentName = "Huguito";
        int studentID = 15;
        int studentAge = 20;
        float studentFee = 75.25f;
        char studentGrade = 'B';

        System.out.println("Student name: " + studentName);
        System.out.println("Student id: " + studentID);
        System.out.println("Student age: " + studentAge);
        System.out.println("Student fee: " + studentFee);
        System.out.println("Student grade: " + studentGrade);

        int length = 4;
        int width = 6;
        int area;

        int items = 50;
        float costPerItem = 9.99f;
        float totalCost = items * costPerItem;
        char currency = '$';

        System.out.println("Number of items: " + items);
        System.out.println("Cost per item: " + costPerItem + currency);
        System.out.println("Total cost: " + totalCost + currency);


       int myInt = 9;
       double myDouble = myInt;

       double mydouble = 9.78;
       int myint = (int) mydouble;

       int maxScore = 500;
       int userScore = 423;

       double percentage = (double) userScore / maxScore * 100.0d;
       System.out.println("User percentaje is " + percentage);

       String a = "java ";
       String b = "is";
       String c = " fun";
       String resul = a.concat(b).concat(c);
       System.out.println(resul);

       String k = "ajsdlñkfjas";
       int j = 20;
       String d = k + j;
       System.out.println(d);

       String txt = "We are the so-called \"Vikingos\" from de north";
       String txtt = "It\'s alright";
       String txxt = "The character \\ is called backslash";
       System.out.println(txxt);





        area = length * width;
        System.out.println("Length is: " + length);
        System.out.println("Width is: " + width);
        System.out.println("Area of the rectangle is: " + area);




        System.out.println("Hello World");


    String name = "John";
    System.out.println("Hello "+name);
    System.out.println("Java es fun!");
        System.out.println("Hello world");
        System.out.println("Have a good day!");
        System.out.println("Learning Java is fun!");
        System.out.println("This sentence will work!");
//      System.out.println(This sentence will produce an error);
        System.out.print("Hello world");
        System.out.print("I will print to the same line.");
        System.out.println();
        System.out.println(3);
        System.out.println(358);
        System.out.println(5000);
        System.out.println(3 + 3);
        System.out.println(2 * 5);





        double m = 2.5;
        double o = 9.1;

        System.out.println(Math.round(Math.random()* 100));

        int time = 20;
        String result = (time < 18) ? "Good day" : "Good night";
        System.out.println(result);


        int tyme = 22;
        String message = (tyme < 12) ? "Good morning"
                        : (tyme < 18) ? "Good afternoon"
                        : "Good evening";
        System.out.println(message);



    }
}
