package it.epicode.be;

public class esercizio4 {

	public static void main(String[] args) {
		
		perimetroRettangolo(53.2, 30.8);
		pariDispari(4);

	}

	static void perimetroRettangolo(double lato1, double lato2) {
		double perimetro = (lato1 + lato2) * 2;
		System.out.println(perimetro);
	}
	
	static void pariDispari(int numero) {
		if(numero % 2 == 0) {
			System.out.println(0);
		} else {
			System.out.println(1);
		}
		
		System.out.println("-------------");
	}
	
	static void areaTriangolo(double a, double b) {
		double area = (a*b)/2;
		System.out.println("L'area del triangolo è: " + area);
	}
}
