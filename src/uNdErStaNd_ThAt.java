
public class uNdErStaNd_ThAt {
	static class Test<T> {
		//an object of type T is declared
		T obj;
		Test(T obj){
			this.obj = obj;//constructor
		}
		public T getObj() {
			return obj;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//instance of integer type
		Test<Integer> iObj = new Test<Integer>(15);
		System.out.println(iObj.getObj());
		
		//instance of string type
		Test<String> sObj = new Test<String>("GG");
		System.out.println(sObj.getObj());
	}

}

