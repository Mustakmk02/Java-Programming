
public class SuperExample1 
{
	
	

}
class Animal
{
	String color="white";
			
	
}
 class Dog extends Animal 
 {
	 String color="black";
	 void printColor()
	 {
		 System.out.println(color);
		 System.out.println(super.color);
	 }
	 
 }
 class test
 {
	 public static void main(String[] args) 
	 {
		 Dog d1=new Dog();
			d1.printColor();
		
	}
 }
 