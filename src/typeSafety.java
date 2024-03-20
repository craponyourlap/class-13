import java.util.ArrayList;
import java.util.List;

public class typeSafety {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List list = new ArrayList<>();
		list.add(10);
		list.add("10");
		//with generics, it is required to specify the type of object we need to store
		List<Integer> an_actual_list = new ArrayList<>();
		an_actual_list.add(10);
//		an_actual_list.add("10");//compile time error
	}

}
