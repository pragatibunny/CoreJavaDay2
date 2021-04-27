# CoreJavaDay2
 

+ 

Day 2 Java

 

1.Write a Java method to find the smallest number among three numbers. 

2.Write a Java method to display the middle character of a string.  

 a) If the length of the string is odd there will be two middle characters. 

 b) If the length of the string is even there will be one middle character. 

  Input a string: 367  

 Expected Output:                                                                     

The middle character in the string: 6 

3. Write a Java method to count all vowels in a string.  

Input the string: Hcl Technologies  

 Expected Output: 

Number of  Vowels in the string: 5 

4. Write a program to create a room class, the attributes of this class is roomno, roomtype, roomarea and ACmachine. In this class the member functions are setdata and displaydata. 

5. Create class named as ‘A’ and create a sub class ‘B’. Which is extends from class ‘A’. And use these classes in ‘inherit’ class. 

6. Your task is to create the class Addition and the required methods so that the code prints the sum of the numbers passed to the function addition. 

Note: Your addition method in the Addition class must print the sum as given in the Sample Output 

Sample Input 

1 

2 

3 

4 

5 

6 

Sample Output 

1+2=3 

1+2+3=6 

1+2+3+4+5=15 

1+2+3+4+5+6=21 

 

7. You are given a partially completed code in the editor. Modify the code so that the code prints the following text: 

Hello I am a motorcycle, I am a cycle with an engine. 

My ancestor is a cycle who is a vehicle with pedals. 

class Cycle{ 

    String define_me(){ 

        return "a vehicle with pedals."; 

    } 

} 

 

class Bike extends Cycle{ 

    String define_me(){ 

        return "a cycle with an engine."; 

    } 

     

    Bike(){ 

        System.out.println("Hello I am a Bike I am "+ define_me()); 

        String temp=Cycle.define_me(); 

        System.out.println("My ancestor is a cycle who is "+ temp ); 

    } 

     

} 

class InheritenceExample{ 

    public static void main(String []args){ 

        Bike M=new Bike(); 

    } 

} 

 

8. Consider the below code and you must add a ‘bark method to the Dog class, then modify the main method accordingly so that the code prints the following lines: 

I am walking 

I am eating 

I am barking 

 

class Animal{ 

void walk(){ 

System.out.println("I am walking"); 

} 

} 

class Dog extends Animal{ 

void eat(){ 

System.out.println("I am eating"); 

} 

} 

public class InheritenceExample{ 

   public static void main(String[] args){ 

      Dog dog = new Dog(); 

      dog.walk(); 

      dog.eat(); 

   } 

} 

9.Find the output of the following code snippet: 

class Child1 extends Parent{} 

class Child2 extends Parent{} 

class Test 

{ 

  public static void main(String[] args) 

  { 

      Parent p =new Parent(); 

      Child1 c1 = new Child1(); 

      Child2 c2 = new Child2(); 

      System.out.println(c1 instanceof Parent);		 

      System.out.println(c2 instanceof Parent);		 

      System.out.println(p instanceof Child1);		 

      System.out.println(p instanceof Child2);		 

      p = c1; 

      System.out.println(p instanceof Child1);		 

      System.out.println(p instanceof Child2);		 

      p = c2; 

      System.out.println(p instanceof Child1);		 

      System.out.println(p instanceof Child2);		 

   } 

} 
