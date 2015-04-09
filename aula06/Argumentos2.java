import java.util.Calendar;

class Argumentos2 {
	
	public static void main(String[] args){
		Calendar c = Calendar.getInstance();
		int dia = c.get(Calendar.DAY_OF_MONTH);
		int mes = (c.get(Calendar.MONTH)+1);
        	int ano = c.get(Calendar.YEAR);
		System.out.println ("Ola Mundo! -> " + args[0]);
		System.out.println("Ano: " + dia + "/" + mes + "/" + ano);
		System.out.print("Date And Time Is: " + c.getTime());
	}
}