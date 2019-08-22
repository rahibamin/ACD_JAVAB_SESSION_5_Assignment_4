package Session5.Assignment4;

public class FixedStack implements Stack {
	int stackSize;
	int[] stack;
	int count = 0;

	FixedStack(int stackSize) {
		this.stackSize = stackSize;
		stack = new int[stackSize];
	}

	@Override
	public void push(int i) {
		if (count < stackSize) {
			stack[count] = i;
			count++;
		} else
			System.out.println("Stack overflow");
	}

	@Override
	public int pop() {
		if (count == 0) {
			System.out.println("Stack is empty");
			return 0;
		} else
			return stack[--count];
	}

	public void display() {
		for (int i = 0; i < count; i++) {
			System.out.print(stack[i] + " ");
		}
	}

}
