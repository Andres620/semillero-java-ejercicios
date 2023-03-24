package taller3.ejercicio3;

public class Wav extends FormatoAudio{

	public Wav(int duracionSegundos, long tamanoBytes, String artista, String compositor, String generoMusical) {
		super(duracionSegundos, tamanoBytes, artista, compositor, generoMusical);
	}

	@Override
	public void reproducir() {
		System.out.println("Reproduciendo WAV");
	}

}
