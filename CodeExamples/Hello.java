class Hello {
	
	public static void main(String args[]) {
		System.out.println("Hello!");
		multiplyTable();
	}
	
	public static void multiplyTable() {
		
		String MultiplyTable = " ";
		
		
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				MultiplyTable += i * j + " ";
			}
			
			System.out.println(MultiplyTable);
			MultiplyTable = " ";
		}
	}

}