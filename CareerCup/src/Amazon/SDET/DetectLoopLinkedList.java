package Amazon.SDET;

public class DetectLoopLinkedList {
	class Node {
		int data;
		Node next;
		Node(int d)
		{
			this.data = d;
			this.next = null;
		}
	}
	
	public static boolean checkLoop(Node node)
	{
		Node slow = node;
		Node fast = node;
		do{
			slow = slow.next;
			fast = fast.next.next;
		}
		while(fast.next!=null && fast!=slow);
		
		if(fast==slow)
			return true;
		else
			return false;
	}
	
	public static void main(String[] args) {
		DetectLoopLinkedList d = new DetectLoopLinkedList();
		Node head = d.new Node(3);
		head.next = d.new Node(4);
		head.next.next = d.new Node(9);
		//head.next.next = head;
		System.out.println("Check is the linked list has loops : "+checkLoop(head));

	}

}
