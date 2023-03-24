package taller3.ejercicio3;

public class Mp3 extends FormatoAudio{

	public Mp3(int duracionSegundos, long tamanoBytes, String artista, String compositor, String generoMusical) {
		super(duracionSegundos, tamanoBytes, artista, compositor, generoMusical);
	}

	@Override
	public void reproducir() {
		System.out.println("Reproduciendo Mp3");
	}

}
