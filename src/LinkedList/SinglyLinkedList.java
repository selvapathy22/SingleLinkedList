package LinkedList;
import java.util.Scanner;
//A class Node that holds the data and a link which is essentially a pointer
class Node {
	int data;
	Node link; // the link here holds the reference or link of the object that is to be passed i.e., a node
}
class Method {
	Node head; //a reference variable head that holds the reference of Node objects, i.e addresses of node objects
	public Node createNode(int data) {
		Node newNode = new Node();
		newNode.data=data;
		newNode.link=null;
		return newNode;
	}
	//traverse and return the last node of the list
	public Node traverseSinglyLinkedList() {
		if(head==null) return null;
		Node temp=head;
		while(temp.link!=null) {
			temp=temp.link;
		}
		return temp;
	}
	public int countElementsSll() {
		if(head==null) return 0;
		Node temp=head;
		int count=0;
		while(temp!=null) {
			temp=temp.link;
			count++;
		}
		return count;
	}
	public void insertAtBegin(int data) {
		Node newNode=createNode(data);
		if(head==null) {
			head=newNode;
		} else {
			newNode.link=head;
			head=newNode;
		}
	}
	public void insertAtMiddle(int data,int position) {
		int length=countElementsSll(); //to count the current length of list
		if(position>length+1 || position<=0) { //length+1 to insert at last
			System.out.println("Invalid position");
		} else {
			if(position==1) {
				insertAtBegin(data);
			} else if(length+1==position) {
				insertAtEnd(data);
			} else {
				Node newNode=createNode(data);
				Node temp1=head;
				position-=2; //-2 becoz, a position before the actual gn input, ex pos=2 in 1 2 3, insert in 2,pos-2=0 so before 2 is 1 of index 0 so pos=0
				while(position!=0) {
					temp1=temp1.link;
					position--;
				}
				Node temp2=temp1.link; //element to be moved is temp2 so temp.link
				temp1.link=newNode;
				newNode.link=temp2;
			}
		}
	}
	public void insertAtEnd(int data) {
		Node newNode=createNode(data);
		if(head==null) {
			head=newNode;
		} else {
			Node temp=head;
			while(temp.link!=null) {
				temp=temp.link;
			}
		temp.link=newNode;
		}
	}
	@SuppressWarnings("unused")
	public void deleteAtBegin() {
		Node temp=head;
		head=head.link;
		temp=null;
	}
	@SuppressWarnings("unused")
	public void deleteAtEnd() {
		if(head.link==null) {
			head.data=0;
			head=null;
		} else {
			Node temp=traverseSinglyLinkedList();
			Node temp1=head;//to make the link of node pointing to last node as null
			while(temp1.link.link!=null) {
				temp1=temp1.link;
			}
			temp1.link=null;
			temp=null;
		}
	}
	public void deleteAtMiddle(int position) { // same logic as insert at middle
		int length=countElementsSll();
		if (position<=0 || position>length){
			System.out.println("Invalid Position");
		} else if(position==1) {
			deleteAtBegin();
		} else if(position==length) {
			deleteAtEnd();
		} else {
			Node temp1=head;
			position-=2;
			while(position!=0) {
				temp1=temp1.link;
			}
			Node temp2=temp1.link;  //prev=temp1,curr=temp2,next=temp3
			Node temp3=temp2.link; //additional temp3 to link the prev and next
			temp1.link=temp3;
			temp2=null;
		}
	}
	public Node reverseSll(Node head) { //3 pointer approach
		Node prev=null;
		Node curr=head;
		Node next=head.link;
		while(next!=null) {
			curr.link=prev; 
			prev=curr;
			curr=next;
			next=next.link;
		}
		curr.link=prev; //becoz at last the while loop misses it as next becomes null
		return curr;
	}
	public Node cloneSll(Node head) {
		Node clone = createNode(0);
		Node maintemp=head;
		Node clonetemp=head;
		clonetemp=clone; //since clone acts as head and clonetemp to iterate throughout the clone list
		while(maintemp!=null) {
			clonetemp.data=maintemp.data;
			clonetemp.link=maintemp.link;
			maintemp=maintemp.link;
			clonetemp=createNode(0);
		}
		return clone;
	}
	public void printSinglyLinkedList(Node head) {
		if(head==null) {
			System.out.println("NULL");
		} else {
			Node temp=head;
			while(temp!=null) {
				System.out.print(temp.data+" ");
				temp=temp.link;
			}
			System.out.println();
		}
	}
}
public class SinglyLinkedList{
	public static void main(String args[]) {
		Method sll=new Method(); // since we didnt use extends
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		int choice=-1,data,position;
		while(choice!=0) { //to iterate the switch case until exit as 0
			System.out.println("Insert: 1,Delete: 2,Print: 3,Clone: 4,Reverse: 5,Exit: 6");
			System.out.print("Enter Your Choice: ");
			choice=sc.nextInt();
			if(choice==6) {
				System.out.println("Exited successfully");
				break; // break out of main while
			}
			switch(choice) {
				case 1:
					int ic=1;
					while(ic!=4) {
						System.out.println("Beginning: 1,Middle: 2,End: 3,Exit: 4");
						System.out.print("Enter Your Choice: ");
						ic=sc.nextInt();
						if(ic<1 || ic>4) {
							System.out.println("Enter valid number");
							continue; // to redirect flow to top of while again
						}
						if(ic==1) {
							System.out.print("Enter the data: ");
							data=sc.nextInt();
							sll.insertAtBegin(data);
							System.out.println("Entered "+data+" at beginning.");
						} else if(ic==2) {
							System.out.print("Enter the data and position: ");
							data=sc.nextInt();
							position=sc.nextInt();
							sll.insertAtMiddle(data,position);
							System.out.println(data+" is inserted at position: "+position);
						} else if(ic==3) {
							System.out.println("Enter the data: ");
							data=sc.nextInt();
							sll.insertAtEnd(data);
							System.out.println(data+" inserted at the end.");
						} else {
							break; // to exit while
						}
					}
					break;
				case 2:
					int dc=1;
					while(dc!=4) {
						System.out.println("Beginning: 1,Middle: 2,End: 3,Exit: 4");
						System.out.print("Enter Your Choice: ");
						ic=sc.nextInt();
						if(ic<1 || ic>4) {
							System.out.println("Enter valid number");
							continue; //ctrl flow to top
						}
						if(ic==1) {
							sll.deleteAtBegin();
							System.out.println("Deleted data at the beginning.");
						} else if(ic==2) {
							System.out.print("Enter the position: ");
							position=sc.nextInt();
							sll.deleteAtMiddle(position);
							System.out.println("Deleted data at the position: "+position);
						} else if(ic==3) {
							sll.deleteAtEnd();
							System.out.println("Deleted data at the end.");
						} else {
							break; // break out of while
						}
					}
					break;
				case 3:
					sll.printSinglyLinkedList(sll.head);
					break;
				case 4:
					Node clone=sll.cloneSll(sll.head);
					System.out.print("Cloned List is: ");
					sll.printSinglyLinkedList(clone);
					break;
				case 5:
					Node newhead=sll.reverseSll(sll.head);
					sll.printSinglyLinkedList(newhead);
				case 6:
					System.out.println("Exiting, tq for using");
					break;
				default:
					System.out.println("Enter a valid choice");
					break;
			}
		}
	}
}
//Single linked list using java
