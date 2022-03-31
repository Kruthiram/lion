
public class EduByReference {
	
	public void swapByReference(int num1, int num2)
 {

// Calling the function to swap
swapByReference(num1, num2);

}
	public static void main(String[] args) {
		int num1 = 55;
		int num2 = 85;
System.out.println("Before swapping in function locally, num1 = " + num1 + " num2 = " + num2);
// Swapping number1 and number2
int temp = num1;
num1 = num2;
num2 = temp;
System.out.println("After swapping in function locally, num1 = " + num1 + " num2 = " + num2);
}
}