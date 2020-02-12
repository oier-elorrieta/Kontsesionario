
public class Ibilgailua {
	protected String matricula;
	protected int gurpil_zb;
	protected int potentzia;
	protected String kolorea;
	
	public Ibilgailua(String matricula, int gurpil_zb, int potentzia, String kolorea) {
		
		this.matricula = matricula;
		this.gurpil_zb = gurpil_zb;
		this.potentzia = potentzia;
		this.kolorea = kolorea;
	}
	
	public Ibilgailua(String matricula) {
		this.matricula = matricula;
	}
	
	public int getGurpilak () {
		return this.gurpil_zb;
	}

	@Override
	public String toString() {
		return "Ibilgailua [matricula=" + matricula + ", gurpil_zb=" + gurpil_zb + ", potentzia=" + potentzia
				+ ", kolorea=" + kolorea + "]";
	}
	
	public void kk () {
		System.out.println("Kaixo kk aita naiz");
	}
}
