import java.util.Arrays;
import java.util.Scanner;

public class Stack {
	private static int[] stackArray;

	private static int stackSize;

	private static int top = -1;
	static Boolean running = true;

	private static Scanner in;

	Stack(int size) {
		stackSize = size;

		stackArray = new int[size];
		Arrays.fill(stackArray, -1);

	}

	public void push(int input) {
		if (top + 1 < stackSize) {
			top++;
			stackArray[top] = input;
			System.out.println("push :" + input + "\twas pushed to the stack\n");
		}
		else {
			System.out.println("Stack Overflow");
		}
	}

	public void pop() {
		try {
			if (top != -1) {
				int val = stackArray[top];
				System.out.println("deleted value form the stack is " + val);
				top = top - 1;
			} else {
				System.out.println("Cannot pop items,the stack is empty");
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Cannot pop items,the stack is empty");
		}
	}

	public void peek() throws NullPointerException {
		System.out.println("Peek the top of the stack is " + stackArray[top]);
	}

	public void display() {
		try {
			for (int i = top; i < stackArray[top]; i--) {

				System.out.println(stackArray[i]);

			}
		} catch (ArrayIndexOutOfBoundsException e) {
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		in = new Scanner(System.in);
		System.out.println("Enter the size of the Stack");
		int size = in.nextInt();
		Stack stack = new Stack(size);

		while (running) {

			System.out.println("\t\tSTACK OPERATIONS\n______________________________________________________\n");
			System.out.println("1. For pushing an element to the stack " + "\n2. For popping an item"
					+ "\n3. For displaying the elements in the stack" + "\n4. For peeking operation in the stack");
			System.out.println("______________________________________________________\n");
			int answer = in.nextInt();

			switch (answer) {
			case 1:
				System.out.println("Enter the item to push");
				int input = in.nextInt();
				stack.push(input);
				
				break;
			case 2:
				stack.pop();
				stack.display();
				break;
			case 3:
				stack.display();
				break;
			case 4:
				stack.peek();
				break;
			default:
				System.out.println("Invalid choice");
				break;
			}

		}

	}
}