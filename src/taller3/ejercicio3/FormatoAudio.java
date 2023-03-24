package taller3.ejercicio3;

public abstract class FormatoAudio implements Reproductor{
	protected int duracionSegundos;
	protected long tamanoBytes;
	protected String artista;
	protected String compositor;
	protected String generoMusical;
	
	
    public FormatoAudio(int duracionSegundos, long tamanoBytes, String artista, String compositor, String generoMusical) {
        this.duracionSegundos = duracionSegundos;
        this.tamanoBytes = tamanoBytes;
        this.artista = artista;
        this.compositor = compositor;
        this.generoMusical = generoMusical;
    }
    
}
