package myPack;

class AccountBalance {
	public static void main(String args[]) {
		Balance current[] = new Balance[3];
		
		current[0] = new Balance("D.E. Sizov", 0.01);
		current[1] = new Balance("Will Tell", 172.52);
		current[2] = new Balance("Tom Jackson", -12.33);
		
		for (int i = 0; i < 3; i++){
			current[i].show();
		}
	}
}