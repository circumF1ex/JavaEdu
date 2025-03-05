//класс NonGen - функциональный эквивалент класса Gen без обобщений

class NonGen {
	Object obj;
	
	NonGen(Object obj) {
		this.obj = obj;
	}
	
	Object getObj(){
		return this.obj;
	}
	
	void showType() {
		System.out.println("Object type is " + this.obj.getClass().getName());
		
	}
	
}

class NonGenDemo {
	

	public static void main(String args[]) {
		
		NonGen iOb;
		iOb = new NonGen(88);
		iOb.showType();
		
		int v = (Integer) iOb.getObj();
		System.out.println("Value: " + v);
		System.out.println();
		
		NonGen strOb = new NonGen("Test without generics");
		strOb.showType();
		

		String str = (String) strOb.getObj();
		System.out.println("Value: " + str);
		
		iOb = strOb;
		
		try {
			v = (Integer) iOb.getObj();
		}
		catch (java.lang.ClassCastException e){
			System.out.println("\nClass Cast Exception!");
		}
		
	}
}