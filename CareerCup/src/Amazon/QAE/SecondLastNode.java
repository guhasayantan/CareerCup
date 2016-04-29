//Print the second last node of the Linked List

package Amazon.QAE;

class Node
{
	int data;
	Node next;
	Node(int d)
	{
		this.data=d;
		this.next=null;
	}
	public void display()
	{
		System.out.print(data+ " ");
	}
}
class LinkedList
{
	Node head, tail;
	void insert(int data)
	{
		Node newnode=new Node(data);
		if(head==null)
		{
			head = newnode;
			tail = newnode;
		}
		else
		{
			tail.next = newnode;
			tail = newnode;
		}
	}
	void print()
	{
		Node temp =head;
		while(temp!=null)
		{
			temp.display();
			temp = temp.next;
		}
	}
	void printsecondlastnode()
	{
		Node prev = head;
		Node next = prev.next;
		while(next.next!=null)
		{
			prev = prev.next;
			next = next.next;
		}
		prev.display();
	}
}
public class SecondLastNode {

	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.insert(2);
		ll.insert(3);
		ll.insert(5);
		ll.insert(4);
		ll.insert(9);
		ll.insert(8);
		System.out.println("The linked list : ");
		ll.print();
		System.out.println();
		System.out.println("The second last element of linked list");
		ll.printsecondlastnode();
	}

}
