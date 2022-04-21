package ds;
import java.util.*;
public class Queue {
	private int size;
	private int arr[];
	private int rear;
	private int front;
	Queue(int size)
	{
		this.size = size;
		arr = new int[size];
		rear = -1;
		front = 0;
		
		}
	public void enqueue(int value)
	{
		if(full())
		{
			System.out.println("queue is overflow");
			System.exit(1);			
		}
		arr[++rear] = value;
	}
	public int dequeue()
	{
		int x;
		if(empty())
		{
			System.out.println("queue is empty");
			return(-1);
		}
		else {
			x=arr[front];
			if(front >= rear)
			{
				front = -1;
				rear = -1;
			}
			else
				{
					front++;
				}
		return(x);
		}
	}
	public boolean empty()
	{
		if(rear==-1)
			return true;
		return false;
	}
	public boolean full()
	{
		if(size == rear+1)
			return true;
		return false;
	
		
	}
	public void display()
	{
		int i;
		for(i=front;i<=rear;i++)
		{
		System.out.println(arr[i]);
		}
	}
public static void main(String[] args)
{
	char ch;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the size of the queue");
	int size = sc.nextInt();
	Queue queue = new Queue(size);
	do {
	System.out.println("1.enqueue");
	System.out.println("2.dequeue");
	System.out.println("3.display");
	int op = sc.nextInt();
	if(op == 1)
	{
		System.out.println("Enter the value :");
		int value = sc.nextInt();
		queue.enqueue(value);
	}
	else if(op == 2)
	{
		queue.dequeue();
	}
	else if(op == 3)
	{
		queue.display();
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
