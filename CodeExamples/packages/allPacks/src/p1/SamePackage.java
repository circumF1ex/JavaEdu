package p1;

class SamePackage {
	SamePackage() {
		Protection p = new Protection();
		System.out.println("Конструктор из того же самого пакета");
		System.out.println("n = " + p.n);
		
		//Доступно только внутри тела класса
		//System.out.println("n_pri = " + p.n_pri);
		
		System.out.println("n_pro = " + p.n_pro);
		System.out.println("n_pub = " + p.n_pub);
	}
}