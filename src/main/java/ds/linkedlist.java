package ds;
import java.io.*;
import java.util.Scanner;
public class linkedlist {


		Node head; 
		static class Node {

			int data;
			Node next;
			public Node nextNode;
			Node(int d)
			{
				data = d;
				next = null;
			}
		}
		public static linkedlist  insert(linkedlist  list,
										int data)
		{
			Node new_node = new Node(data);
			new_node.next = null;
			if (list.head == null) {
				list.head = new_node;
			}
			else {
				Node last = list.head;
				while (last.next != null) {
					last = last.next;
				}
				last.next = new_node;
			}
			return list;
		}
		public static void printList(linkedlist  list)
		{
			Node currNode = list.head;

			System.out.print("\nLinkedList: ");
			while (currNode != null) {
				System.out.print(currNode.data + " ");
				currNode = currNode.next;
			}
			System.out.println("\n");
		}

		public static linkedlist 
		deleteAtPosition(linkedlist  list, int index)
		{
			
			Node currNode = list.head, prev = null;

			if (index == 0 && currNode != null) {
				list.head = currNode.next; 
				System.out.println(
					index + " position element deleted");
				return list;
			}
			int counter = 0;
			while (currNode != null) {

				if (counter == index) {
					prev.next = currNode.next;
					System.out.println(
						index + " position element deleted");
					break;
				}
				else {
					prev = currNode;
					currNode = currNode.next;
					counter++;
				}
			}
			if (currNode == null) {
				System.out.println(
					index + " position element not found");
			}

			return list;
		}
		public static void main(String[] args)
		{
			Scanner sc=new Scanner(System.in);
			linkedlist  list = new linkedlist ();
			char a;
			do {
				System.out.println("1.insert");
				System.out.println("2.deletposition");
				System.out.println("3.display");
				int op=sc.nextInt();
				if(op==1) {
					System.out.println("enter a value");
					int value=sc.nextInt();
					list=list.insert(list, value);
				}
				else if(op==2) {
					System.out.println("enter a position");
					int pos=sc.nextInt();
					list=list.deleteAtPosition(list, pos);
				}
				else if(op==3)
				{
                    printList(list);
				}
				else
				{
				System.out.println("invalid input");
				}
				System.out.println("do u want to continiue:y/n");
				a=sc.next().charAt(0);
			}	while(a=='y');
}
}
		
