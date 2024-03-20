import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class generics_using_maps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "raiven");
		map.put(4, "natacha");
		map.put(2, "ianna");
		
		//now use map entry for set and iterator
		Set<Map.Entry<Integer, String>> set = map.entrySet();
		
		Iterator<Map.Entry<Integer, String>> itr = set.iterator();
		while(itr.hasNext()) {
			Map.Entry<Integer, String> e = itr.next();//no need to typecast he says
			System.out.println(e.getKey()+" "+e.getValue());
		}
	}

}
