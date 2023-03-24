package taller3.ejercicio3;

public class Mp4 extends FormatoVideo{

	public Mp4(int duracionSegundos, long tamanoBytes, String creador, String tipoVideo) {
		super(duracionSegundos, tamanoBytes, creador, tipoVideo);
	}

	@Override
	public void reproducir() {
		System.out.println("Reproduciendo Mp4");
	}

}
