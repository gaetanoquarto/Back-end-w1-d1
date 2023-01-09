package it.epicode.be;

public class esercizio2 {

	public static void main(String[] args) {
		//Dichiara valore per la moltiplicazione
		moltiplica(5, 6);
		
		//Dichiara valori per la concatenazione
		concatena("Il numero estratto è: ", 8);
		
		//Crea un array da 5 stringhe
		String[] animali = new String[5];
		//popola l'array
		animali[0] = "Cane";
		animali[1] = "Gatto";
		animali[2] = "Pappagallo";
		animali[3] = "Zebra";
		animali[4] = "Cavallo";
		//Stampa l'array originale
		System.out.println("Array originale: " + java.util.Arrays.toString(animali));
		
		//ricava la lunghezza dell'array originale
		int orig_length = animali.length;
		//crea la nuova stringa da inserire nell'array originale
		String newAnimale = "Fagiano";
		//Crea un nuovo array che contiene la lunghezza dell'originale + 1
		String[] newAnimali = new String [orig_length + 1];
		//popola il nuovo array con i dati del vecchio
		for (int i = 0; i < animali.length; i++) {
			newAnimali[i] = animali [i];
		}
		
		//aggiunge la nuova stringa al nuovo array
		newAnimali[newAnimali.length -4] = newAnimale;
		newAnimali[newAnimali.length -1] = "";
		//sposta il nuovo array nell'originale
		animali = newAnimali;
		//stampa l'array modificato
		System.out.println("Array modificato: " + java.util.Arrays.toString(animali));
		}



//effettua moltiplicazione con i dati dichiarati nel main
public static void moltiplica (int a, int b) {
	int moltiplicazione = a*b;
	System.out.println(moltiplicazione);
}

//effettua concatenazione con i dati dichiarati nel main
public static void concatena (String preNumero, int c) {
	System.out.println(preNumero + c);
}




	}


