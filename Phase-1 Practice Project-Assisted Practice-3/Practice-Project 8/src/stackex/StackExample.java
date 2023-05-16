package stackex;
import java.util.Stack;

public class StackExample {

	    public static void main(String[] args) {
	        Stack<Integer> stack = new Stack<>();

	       
	        stack.push(10);
	        stack.push(20);
	        stack.push(30);
	        stack.push(40);

	        System.out.println("Stack elements: " + stack);

	      
	        int removedElement = stack.pop();
	        System.out.println("Removed element: " + removedElement);

	    
	        int topElement = stack.peek();
	        System.out.println("Top element: " + topElement);

	       
	        boolean isEmpty = stack.isEmpty();
	        System.out.println("Is stack empty? " + isEmpty);
	    }
	

}
