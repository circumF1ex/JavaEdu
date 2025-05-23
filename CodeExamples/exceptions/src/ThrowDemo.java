class ThrowDemo {
	static void demoproc() {
		try {
			throw new NullPointerException("Demo");
		} catch (NullPointerException e) {
			System.out.println("Exception catched in demoproc() method.");
			throw e;
		}

	}
	
	public static void main(String args[]) {
		
		try {
			demoproc();
		}
		catch(NullPointerException e) {
			System.out.println("Second catch: " + e);
		}
	}
}