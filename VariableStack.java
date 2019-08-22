package Session5.Assignment4;

public class VariableStack implements Stack {
	int stackSize;
	int[] stack;
	int count = 0;

	VariableStack(int stackSize) {
		this.stackSize = stackSize;
		stack = new int[stackSize];
	}

	@Override
	public void push(int i) {
		if (count < stackSize) {
			stack[count] = i;
			count++;
		} else {
			int[] temp = stack;
			stackSize++;
			stack = new int[stackSize];
			for (int j = 0; j < temp.length; j++)
				stack[j] = temp[j];
			stack[count] = i;
			count++;
		}

	}

	@Override
	public int pop() {
		if (count == 0) {
			System.out.println("Stack is empty");
			return 0;
		} else {
			return stack[--count];
		}
	}

	public void display() {
		for (int i = 0; i < count; i++) {
			System.out.print(stack[i] + " ");
		}
	}



}
