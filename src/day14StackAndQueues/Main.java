package day14StackAndQueues;

/**
 * 
 * @author LENOVO
 *
 */
public class Main {
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * pushing values to stack
		 * calculating node size
		 * deleting data till size =0
		 * stack is empty now
		 */
		Linkedlist list = new Linkedlist();
		list.push(70);
		list.push(30);
		list.push(56);
		System.out.println("Node size is  " + list.size());
		System.out.println("Before pop ");
		list.display();
		while (list.size() != 0) {
			list.pop();
		}
		System.out.println("After pop ");
		list.display();
		System.out.println("\n<<<<<empty>>>>>");
	}
}