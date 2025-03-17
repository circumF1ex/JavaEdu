//Простой обобщённый класс

class Gen<T> {
	T ob;
	
	Gen(T o) {
		ob = o;
	}
	
	T getOb() {
		return ob;
	}
	
	void showType() {
		System.out.println("Type of T is " + ob.getClass().getName());
	}
}

//Демонстрация применения обобщённого класса

class GenericsTest1 {
	public static void main(String args[]) {
		Gen<Integer> iOb;
		
		iOb = new Gen<Integer>(88 + 10);
		
		iOb.showType();
		
		int v = iOb.getOb();
		
		System.out.println("Value: " + v);
		System.out.println();
		
		Gen<String> strOb = new Gen<String>("Test");
		
		strOb.showType();
		
		String str = strOb.getOb();
		System.out.println("Value: " + str);
		
	}
}