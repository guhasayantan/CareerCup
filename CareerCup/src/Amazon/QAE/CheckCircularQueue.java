package Amazon.QAE;

class Node1
{
	int data;
	Node1 next;
	Node1(int d)
	{
		this.data=d;
		this.next=null;
	}
}
public class CheckCircularQueue {
	static Node1 head;
	public static void main(String[] args) {
		Node1 n1= new Node1(1);
		Node1 n2= new Node1(4);
		Node1 n3= new Node1(3);
		Node1 n4= new Node1(5);
		n1.next=n2;
		n2.next=n3;
		n3.next=n4;
		n4.next=n1;
		head=n1;
		checkCircularQueue(head);
	}
	public static void checkCircularQueue(Node1 head)
	{
		Node1 slow=head, fast=head;
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
