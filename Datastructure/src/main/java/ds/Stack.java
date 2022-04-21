package ds;

import java.util.Scanner;

public class Stack {
	private int size;
	private int arr[];
	private int top;
	Stack(int size)
	{
		this.size = size;
		arr = new int[size];
		top= -1;
		}
	public void push(int value)
	{
		if(full())
		{
			System.out.println("stack is overflow");
			System.exit(1);			
		}
		arr[++top] = value;
	}
	
	public int pop()
	{
		int x;
		if(empty())
		{
			System.out.println("stack is empty");
			System.exit(1);
		}
		return arr[top--];
	}
	public boolean empty()
	{
		if(top==-1)
			return true;
		return false;
	}
	public boolean full()
	{
		if(size == top+1)
			return true;
		return false;
	
		
	}
	public void display()
	{
		int i;
		for(i=0;i<=top;i++)
		{
		System.out.println(arr[i]);
		}
	}
public static void main(String[] args)
{
	char ch;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the size of the stack");
	int size = sc.nextInt();
	Stack stack = new Stack(size);
	do {
		System.out.println("1.push");
		System.out.println("2.pop");
		System.out.println("3.display");
		int op = sc.nextInt();
		if(op == 1)
		{
			System.out.println("Enter the value :");
			int value = sc.nextInt();
			stack.push(value);
		}
		else if(op == 2)
		{
			stack.pop();
		}
		else if(op == 3)
		{
			stack.display();
		}
		else
		{
			System.out.println("Invalid input");
			break;
		}
		System.out.println("Do you want to continue: Y/N ");
		  ch = sc.next().charAt(0);
		}while( ch == 'y');
}
}
