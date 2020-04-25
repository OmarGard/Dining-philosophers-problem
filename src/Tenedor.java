
public class Tenedor {
	private int id;
	private boolean libre=true;
	
	public Tenedor(int id) {
		this.id=id;
	}
	public synchronized void tomaTenedor(int i){ //metodo de ingreso
		while(!libre) //Condicion de sincronizacion
			Util.myWait(this); //Variables de condición
		System.out.println("Filosofo "+i+" toma el tenedor "+id);
		libre=false;
	}
	public synchronized void dejaTenedor(int i) { //metodo de ingreso
		libre=true; 
		System.out.println("Filosofo "+i+" suelta el tenedor "+id);
		notify(); //Variables de condición
	}
}
