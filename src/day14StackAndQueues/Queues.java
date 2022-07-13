package day14StackAndQueues;

public class Queues {

	public static void main(String[] args) {
		Linkedlist list = new Linkedlist();
		 list.push(70);
	        list.push(30);
	        list.push(56);
	        list.display();
	        System.out.println("Node size is " +list.size());
	        while(list.size() != 0){
	            list.pop();
	        }
	        list.display();
	        System.out.println("\nThe Stack is empty....");

	    }
}