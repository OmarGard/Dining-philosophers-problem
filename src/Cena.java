
public class Cena {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = 5;
		Lugares p=new Lugares(N - 1);
		Tenedor[] tenedores=new Tenedor[N];
		for(int i=0;i<tenedores.length;i++)
		{
			tenedores[i]=new Tenedor(i);
			
		}
		Filosofo[] filosofos=new Filosofo[5];
		for(int i=0;i<filosofos.length;i++)
		{
			filosofos[i]=new Filosofo(i,tenedores[i],tenedores[(i+1)%5],p);
			
		}
		for(int i=0;i<filosofos.length;i++)
		{
			filosofos[i].start();
		}
	}

}
