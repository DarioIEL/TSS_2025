package lezione10_AnimaliGeometrici;

public class Uccellino extends Animale{

	protected String verso = "cip cip";
	
	@Override
	public String versoAlt() {
		String versoSuper = super.versoAlt();
		return this.verso + " " + versoSuper;
	}
	
}
