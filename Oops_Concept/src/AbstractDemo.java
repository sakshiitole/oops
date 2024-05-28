
abstract class Bike
{
	abstract void run();
}
 class Honda extends Bike{
	 public void run()
	 {
		 System.out.println("Bike class gets Extended");
	 }
 }
 
 public class AbstractDemo
 {
	 public static void main(String args[]) {
		 Honda h =new Honda();
		 h.run();
	 }
 }
		

