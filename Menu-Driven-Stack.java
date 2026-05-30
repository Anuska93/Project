import java.util.Scanner;

class Stack {
	int[] stk= new int[10];
	int t=-1;

	void push(int d) {
		if(t==stk.length) {
			System.out.println("Stack overflow");
			return;
		} else {
			t++;
			stk[t]= d;
			System.out.println("Data pushed to stack: "+stk[t]);
		}
	}

	void pop() {
		if(t==-1) {
			System.out.println("Stack underflow");
			return;
		}
		else {
			System.out.println("Element popped: "+stk[t]);
			t--;
		}
	}

	void peek() {
		if(t==-1) {
			System.out.println("Stack is Empty");
			return;
		}
		else if(t==stk.length) {
			System.out.println("Stack is Full");
			return;
		} else {
			System.out.println("Value: "+stk[t]);
		}
	}
}

public class Main
{
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		Stack st= new Stack();
		while(true) {
			System.out.println("STACK OPERATIONS MENU\n1.Push\n2.Pop\n3.Peek\n4.Exit\n");
			int choice= s.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Enter element to push");
				int d= s.nextInt();
				st.push(d);
				break;
			case 2:
				st.pop();
				break;
			case 3:
				st.peek();
				break;
			case 4:
				return;
			default:
			System.out.println("Invalid Choice\n");
			
			}
		}
	}
}
