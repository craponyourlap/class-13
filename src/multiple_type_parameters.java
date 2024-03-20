
public class multiple_type_parameters {
	static class Test<T, U>{
		T obj1;
		U obj2;
		public Test(T obj1, U obj2) {
			this.obj1 = obj1;
			this.obj2 = obj2;
		}
		public void print() {
			System.out.println(obj1);
			System.out.println(obj2);
		}
	}
	/*
	 * i just made the class static so it belongs to this class only
	 * if i dont put it inside, i would have to make another name for 
	 * this shit and i have to make it static cuz the eclipse will cry
	 * if i dont
	 * 
	 * this configuration literally changes nothing on how the code works
	 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test<String, Integer> obj = new Test<String, Integer>("MTL", 15);
		obj.print();
	}

}

