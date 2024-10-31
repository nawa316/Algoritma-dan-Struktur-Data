package oop;

class Toko {

	public static void main(String[] args) {
		
		sapa();
		
		/*
		Pelanggan a = new Pelanggan("Aufaa", "Mbak");
		Pelanggan b = new Pelanggan("Bryan", "Mas");
		
		a.sapa();
		b.sapa();
		
		a.setPoints(100000);
		b.setPoints(85000);
		
		System.out.println("Jumlah point " 
		+ a.getSapaan() + " " + a.getNama() + ": " + a.getPoints());
		
		System.out.println("Jumlah point " 
		+ b.getSapaan() + " " + b.getNama() + ": " + b.getPoints());
		
		PelangganSilver d = new PelangganSilver("Darrell", "Mas");
		d.sapa();
		d.setPoints(200000);
		System.out.println("Jumlah point " 
		+ d.getSapaan() + " " + d.getNama() + ": " + d.getPoints());
		*/
		
		PelangganGold f = new PelangganGold("Frans", "Mas", "Oktober");
		f.sapa();
		f.setPoints(250000, "September");
		System.out.println("Jumlah point " 
		+ f.getSapaan() + " " + f.getNama() + ": " + f.getPoints());
		f.greetAtBirthMonth("Oktober");
		f.setPoints(250000, "Oktober");
		System.out.println("Jumlah point " 
		+ f.getSapaan() + " " + f.getNama() + ": " + f.getPoints());

	}
	
	static void sapa() {
		System.out.println("Selamat datang di toko kami....");
	}

}
