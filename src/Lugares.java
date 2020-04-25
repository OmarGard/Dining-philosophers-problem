
public class Lugares {
	private int lugares=4;
	public Lugares(int lugares) {
		this.lugares=lugares;
	}
	public synchronized void tomaSilla(int i){ //metodos de ingreso
		while(lugares==0) //Condicion de sincronizacion
			Util.myWait(this); //Variables de condición
		System.out.println("Filosofo "+i+" toma un lugar");
		lugares--;
		
	}
	public synchronized void dejaSilla(int i) { //metodos de ingreso
		lugares++; 
		System.out.println("Filosofo "+i+" libera un lugar");
		notify(); //Variables de condición
	}
}
