import java.util.ArrayList;
import java.util.Iterator;

public class TestGenerics1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<>();
		list.add("rahui");
		list.add("jai");
//		list.add(32);//compile time error
		
		String s = list.get(1);//type casting is not required
		System.out.println("element is "+s);
		Iterator<String> itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
