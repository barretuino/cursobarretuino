package pjAula2;

public class SejaBemVindo {
	public static void main(String[] args) {
		for(int i=0; i<=10; i++) {
//			if(i%2 == 0) {
//				System.out.println(i + " Par");
//			}else {
//				System.out.println(i + " Impar");
//			}
			
			System.out.println(i + (i%2 == 0 ? " Par" : " Impar"));
			//<comando de avaliação> ? <true> : <false>
		}
		
		int valor = 10;
		int [] precos = new int[10]; //N --> 10, començando em 0, o ultimo indice n-1
		
		precos[0] = 100;
		precos[1] = 976;
		//
		precos[9] = 100; 
	}	
}
