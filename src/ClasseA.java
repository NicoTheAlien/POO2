
public class ClasseA {
	private int valorPrimari;
	private int valorSecondari;
	public ClasseA () {
		this.valorPrimari = 5;
		this.valorSecondari = 10;
	}
	public ClasseA(int vp) {
		this.valorPrimari = vp;
		this.valorSecondari = 10;
	}
	public ClasseA(int vp, int vs) {
		this.valorPrimari = vp;
		this.valorSecondari = vs;
	}
	public int getValorPrimari() {
		return valorPrimari;
	}
	public int getValorSecondari() {
		return valorSecondari;
	}

}
