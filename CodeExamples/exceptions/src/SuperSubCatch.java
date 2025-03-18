class SuperSubCatch {
	public static void main(String args[]) {
		try {
			int a = 0;
			int b = 42 / a;
		}
		
		//Неверный порядок
		/* catch (Exception e) {
			System.out.println("Catching Exception class exceptsions");
		}
		catch (ArithmeticException e) {
			System.out.println("Unreachable code");
		} */
		
		catch (ArithmeticException e) {
			System.out.println("Reachable catch block now");
		}
		catch (Exception e) {
			System.out.println("Reachable for other exceptions");
		}
		
	}
}