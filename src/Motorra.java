
public class Motorra extends Ibilgailua {
protected int zilindrada;

	
	
	public Motorra(String matricula, int gurpil_zb, int potentzia, String kolorea, int zilindrada) {
		super(matricula, gurpil_zb, potentzia, kolorea);
		this.zilindrada = zilindrada;
	}



	@Override
	public String toString() {
		return "Motorra [zilindrada=" + zilindrada + ", matricula=" + matricula + ", gurpil_zb=" + gurpil_zb
				+ ", potentzia=" + potentzia + ", kolorea=" + kolorea + "]";
	}
	
	
	public void kk () {
		super.kk();
		System.out.println("eta gaur astelehena da");
	}
	

}
