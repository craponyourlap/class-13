import java.util.ArrayList;

//class Container<T extends Number>
class Container<T>{
	//Integer value;
		//Object value;
	T value;

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}
	
	public void show() {
		System.out.println(value.getClass().getName());
	}
	//public void demo(ArrayList<Integer> obj){
	public void demo(ArrayList<? extends Number> obj) {
		//ngl im betting that <? extends Number> means that it's of
		//unknown type that extends a class called number
		//so it could be ArrayList<Float> or ArrayList<Integer>
		//bro it's empty
	}
}
public class bro_i_cant_find_where_he_copied_this_one{
	
}