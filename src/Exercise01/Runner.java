package Exercise01;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList list = new LinkedList();
		list.insert(19);
		list.insert(2);
		list.insert(47);
		list.insert(14);
		list.show();
		
		System.out.println();
		list.swapNodes(47, 14);
		list.show();
		
	}

}
