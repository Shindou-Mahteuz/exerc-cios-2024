/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package milexercicios;

/**
 *
 * @author 962900
 */
public class Milexercicios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //exercício 1 
        
        System.out.println("Hello World");
        
        //exercício 2
        //This is a single-line comment
        /*This is a multi-line comment*/
        
        //exercício 3
        String carname = "Volvo";
        
        //exercício 4 
        int maxSpeed = 120;
        
        //exercício 5 
        int x = 5;
        int y = 10;
        System.out.println(x+y);
        
        //exercício 6
        int a = 5;
        int b = 10;
        int c = x + y;
        System.out.println(z);
        
        //exercício 7
        int x = 5,y = 6,z = 50;
        System.out.println(x + y + z);
        
        //exercício 8
        int myNum = 9;
        myFloatNum = 8.99f;
        String myLetter = 'A';
        myBool = false;
        String myText = "Hello world";
        
        //exercícios 9
        data types;
        
        //exercícios 10
        double myDouble = 9.78d;
        int myInt = int myDouble;
        
        //exercícios 11 
        System.out.println(10 * 5);
        
        //exercício 12
        System.out.println(10 / 5);
        
        //exercício 13
        int x = 10;
        +x;
        
        //exercício 14
        int x = 10;
        x + 5;
        
        //exercício 15
        String greeting = "hello";
        
        //exercício 16
        String txt = "hello";
        System.out.println(myString.toUpperCase);
        
       //exercício 17
       String firstName = "John ";
       String lastName = "Doe";
       System.out.println(firstName == lastName);
       
       //exercício 18
       String txt = "Hello Everybody";
       System.out.println(txt.());
       
       //exercício 19
       int x = 5;
       int y = 10;
       Math.max(x,y);
       
       //exercício 20
       int x = 16;
       Math.sqrt(x);
       
       //exercício 21
       Math.random();
       
       //exercício 22
       isJavaFun = true;
       isFishTasty = false;
       System.out.println(isJavafun);
       System.out.println(isFishTasty);
       
       //exercício 23
       int x = 10;
       int y = 9;
       System.out.println();
       
       //exercício 24
       int x = 50;
       int y = 10;
       if (x > y){
           System.out.println("hello world");
       }
        
       //exercício 25
       x = 50;
       y = 10;
       if (x == y){
           System.out.println("hello world");
       }
      
       //exercício 26
        x = 50;
        y = 10;
       if (x == y){
           System.out.println("yes");
       }else{
       System.out.println("no");
       }
       
       //exercício 27
       
        x = 50;
        y = 10;
       if (x == y){
           System.out.println("1");
       }else (x > y){
    System.out.println("2");
    }else{
            System.out.println("3");
            }
       
    //exercício 28
    int time = 20;
    String result = if time < 18 "good day." "good evening.";
    System.out.println(result);
    
       //exercício 29
       int day = 2;
       switch ( ){
          if 1:
               System.out.println("saturday");
               break;
              if 2:
               System.out.println("sunday");
               switch;
       }
       
       //exercício 30
       int day = 4;
       switch () {
           if 1:
               System.out.println("saturday");
               break;
               if 2:
               System.out.println("sunday");
               break;
               if 4:
               System.out.println("weekend");
       }
       
       //exercísio 31
       int i = 1;
       for (i < 6){
       System.out.println(i);
       break;
    }
    
       //exercício 32
       int i = 1;
       do {
        System.out.prinln(i);
        i++;
       }
       while (i < 6);
       
       //exercício 33
       for (int i = 0; i < 5; i++){
        System.out.println("sim");
       }
       
       //exercício 34
      String[] cars = {"volvo","bmw","ford"};
      (String i : ){
    System.out.println(i);
    }
      
      //exercício 35
      for (int i = 0; i < 10; i++){
       if (i == 5){
           break;
       }
      System.out.println(i);
      }   
      
      //exercício 36
      for (int i = 0; i < 10; i++){
       if (i == 4){
        continue;   
       }   
       System.out.println(i);
      }
     
      //exercício 37
       String[] cars = {"volvo","bmw","ford"};
       
    }
    
    //exercícios 38
     String[] cars = {"volvo","bmw","ford"};
     System.out.println(cars[2]);
     
     //exercício 39
     String[] cars = {"volvo","bmw","ford"};
     cars[0] = "opel";
     System.out.println(cars[0]);
     
     //exercício 40
     String[] cars = {"volvo","bmw","ford"};
     System.out.println(cars.lenght);
     
     //exercício 41
     String[] cars = {"volvo","bmw","ford"};
     for (int i = 0; i < cars.length;i++){
System.out.println(cars[i]);
}
  
     //exercício 42
     int [][] myNumbers = {{1,2,3,4}, {5,6,7}};
     
     //exercício 43
     /*static void myMethod(){
     System.out.println("i just got executed!");
     }
     
     public static void main(String[] args){
     myMethod();
     }
     
     //exercício 44
     static void myMethod(){
     System.out.println("i just got executed!");
     }
     public static void main(String[] args){
     myMethod();
     myMethod();
     }
     
     //exercícios 45
     static void myMethod(fname){
     system.out.println(fname+"doe");
     }
     public static void main(String[] args){
     myMethod("john");
     }
     
     //exercício 46
     static int my myMethod(int x){
     return 5 + x;
     }
     public static vois main(String[] args){
     System.out.println(myMethod(3));
     }
     
     //exercício 47
     public class myClass;
     
     //exercício 48
     myClass myObj = new myClass();
     
     //exercício 50
     public class myClass {
     int x = 5;
     public static void main(String[] args){
     myClass myObj = new myClass();
     System.out.println(  );
     }
     }
     
     //exercício 51
     public class MyClass {
     public void myMethod(){
     System.out.println("hello world");
     }
     public static void main(String[] args){
     MyClass myObj = new MyClass();
     
     }
     }
     
     //exercício 52
     public class MyClass{
     int x;
     public static void(){
     x = 5;
     }
     public static void main(String[] args){
     MyClass myObj = new MyClass();
     System.out.println(myObj.MyClass);
      }
     }
     //exercício 53
      class MyClass*/

    }
    


