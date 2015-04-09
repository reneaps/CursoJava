import java.util.Calendar;

class Argumentos2 {
	
	public static void main(String[] args){
		Calendar c = Calendar.getInstance();
        int ano = c.get(Calendar.YEAR);
		System.out.println ("Ola Mundo! -> " + args[0]);
		System.out.println("Ano: " + ano);
	}
}