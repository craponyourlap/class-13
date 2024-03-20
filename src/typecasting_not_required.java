import java.util.ArrayList;
import java.util.List;

public class typecasting_not_required {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List list = new ArrayList();
		list.add("hello");
		String s = (String) list.get(0);//typecasting
		//After generics, we don't need to typecast the object
		List<String> list2 = new ArrayList<>();
		list2.add("hello");
	}

}
