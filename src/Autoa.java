<<<<<<< HEAD

public class Autoa extends Ibilgailua {
	private String marka;
	private String modelo;
	private int ateak;
	
	public Autoa(String matricula, int gurpil_zb, int potentzia, String kolorea,String marka,String modelo, int ateak) {
		super(matricula, gurpil_zb, potentzia, kolorea);
		this.marka = marka;
		this.modelo = modelo;
		this.ateak = ateak;
	}
	
	public String getMatrikula () {
		return this.matricula;
	}
	
	public int getGurpilak () {
		return this.gurpil_zb+1000;
	}

	@Override
	public String toString() {
		return "Autoa [marka=" + marka + ", modelo=" + modelo + ", ateak=" + ateak + ", matricula=" + matricula
				+ ", gurpil_zb=" + gurpil_zb + ", potentzia=" + potentzia + ", kolorea=" + kolorea + "]";
	}

	public String getMarka() {
		return marka;
	}

	public void setMarka(String marka) {
		this.marka = marka;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAteak() {
		return ateak;
	}

	public void setAteak(int ateak) {
		this.ateak = ateak;
	}
	




}
=======

public class Autoa extends Ibilgailua {
	private String marka;
	private String modelo;
	private int ateak;
	
	
	public Autoa(String matricula, int gurpil_zb, int potentzia, String kolorea,String marka,String modelo, int ateak) {
		super(matricula, gurpil_zb, potentzia, kolorea);
		this.marka = marka;
		this.modelo = modelo;
		this.ateak = ateak;
	}
	
	public String getMatrikula () {
		return this.matricula;
	}
	
	public int getGurpilak () {
		return this.gurpil_zb+1000;
	}

	@Override
	public String toString() {
		return "Autoa [marka=" + marka + ", modelo=" + modelo + ", ateak=" + ateak + ", matricula=" + matricula
				+ ", gurpil_zb=" + gurpil_zb + ", potentzia=" + potentzia + ", kolorea=" + kolorea + "]";
	}
	uyksetykwye5ey
	ukdtsyiksw
	




}
>>>>>>> branch 'master' of https://github.com/oier-elorrieta/Kontsesionario.git
