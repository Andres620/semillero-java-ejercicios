package taller3.ejercicio3;

public abstract class FormatoVideo implements Reproductor{
	protected int duracionSegundos;
	protected long tamanoBytes;
	protected String creador;
	protected String tipoVideo;
	
	public FormatoVideo(int duracionSegundos, long tamanoBytes, String creador, String tipoVideo) {
		super();
		this.duracionSegundos = duracionSegundos;
		this.tamanoBytes = tamanoBytes;
		this.creador = creador;
		this.tipoVideo = tipoVideo;
	}
}
