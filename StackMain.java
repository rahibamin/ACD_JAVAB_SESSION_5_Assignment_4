package Session5.Assignment4;

import java.util.Scanner;

public class StackMain {

	public static void main(String[] args) {

		int size;
		int n;
		int flag = 0;

		Scanner scan = new Scanner(System.in);

		System.out.println("Welcome to Fixed/Variable stack creation!");
		System.out.println("We'll start with a Fixed Stack. Enter the Fixed Stack size.");
		size = scan.nextInt();
		FixedStack fStack = new FixedStack(size);
		System.out.println("Enter the initial Variable Stack size");
		size = scan.nextInt();
		VariableStack vStack = new VariableStack(size);
		do {
			System.out.println();
			System.out.println("What Stack will you use?");
			System.out.println("1. Fixed Stack");
			System.out.println("2. Variable Stack");
			n = scan.nextInt();
			switch (n) {
			case 1:
				System.out.println("What to do with the fixed stack?");
				System.out.println("1. Print Stack");
				System.out.println("2. Push to stack");
				System.out.println("3. Pop from stack");
				n = scan.nextInt();
				switch (n) {
				case 1:
					fStack.display();
					break;
				case 2:
					System.out.println("Enter a number to push to the stack");
					n = scan.nextInt();
					fStack.push(n);
					break;
				case 3:
					System.out.println("The returned value from the stack is " + fStack.pop());
					break;
				default:
					System.out.println("Please enter 1, 2, or 3.");
					break;
				}
				break;
			case 2:
				System.out.println("What to do with the variable stack?");
				System.out.println("1. Print Stack");
				System.out.println("2. Push to stack");
				System.out.println("3. Pop from stack");
				n = scan.nextInt();
				switch (n) {
				case 1:
					vStack.display();
					break;
				case 2:
					System.out.println("Enter a number to push to the stack");
					n = scan.nextInt();
					vStack.push(n);
					break;
				case 3:
					System.out.println("The returned value from the stack is " + vStack.pop());
					break;
				default:
					System.out.println("Please enter 1, 2, or 3.");
					break;
				}
				break;
			default:
				System.out.println("Please enter 1 or 2.");
			}
		} while (flag == 0);

	}

}