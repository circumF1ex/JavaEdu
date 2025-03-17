package p2;

class OtherPackage {
	
	OtherPackage() {
	
		p1.Protection p = new p1.Protection();
		System.out.println("Конструктор из другого пакета");
		
		//Доступно только для данного класса или пакета
		//System.out.println("n = " + p.n);
			
		//Доступно только для данного класса
		//System.out.println("n_pri = " + n_pri);
			
		//Доступно только для данного класса, подкласса или пакета
		//System.out.println("n_pro = " + n_pro);
		
		System.out.println("n_pub = " + p.n_pub);
		}
}
