
public class Filosofo extends Thread{
	private int id;
	private Tenedor izquierda,derecha;
	private Lugares p;
	public Filosofo(int id,Tenedor izq,Tenedor der,Lugares p) {
		this.id=id;
		this.izquierda=izq;
		this.derecha=der;
		this.p=p;
	}
	public void run() {
		while(true) {
			p.tomaSilla(id);
			izquierda.tomaTenedor(id);
			derecha.tomaTenedor(id);
			System.out.println("Filosofo "+id+" comiendo");
			Util.mySleep(100);
			derecha.dejaTenedor(id);
			izquierda.dejaTenedor(id);
			p.dejaSilla(id);
		}
	}
}
