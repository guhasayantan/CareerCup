package Amazon;

class Node
{
	int data;
	Node next;
	Node(int d)
	{
		this.data=d;
		this.next=null;
	}
}
public class CheckCircularQueue {
	static Node head;
	public static void main(String[] args) {
		Node n1= new Node(1);
		Node n2= new Node(4);
		Node n3= new Node(3);
		Node n4= new Node(5);
		n1.next=n2;
		n2.next=n3;
		n3.next=n4;
		n4.next=n1;
		head=n1;
		checkCircularQueue(head);
	}
	public static void checkCircularQueue(Node head)
	{
		Node slow=head, fast=head;
		do{
			slow = slow.next;
			if(fast.next != null)
				fast = fast.next.next;
			else
				fast = null;
		}while(fast != slow && fast != null);
		if(slow==fast)
		{
			System.out.println("This is a circular queue");
		}
		else
		{
			System.out.println("This is not a circular queue");
		}
	}

}
