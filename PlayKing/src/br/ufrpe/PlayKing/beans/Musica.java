package br.ufrpe.PlayKing.beans;

public class Musica {

	private String nomeMusica;
	private String tempoMusica;
	private double precoMusica;
	private Artista artistaMusica;
	


	public Musica(String nomeMusica, String tempoMusica, double precoMusica,  Artista artistaMusica) {
		super();
		this.nomeMusica = nomeMusica;
		this.tempoMusica = tempoMusica;
		this.precoMusica = precoMusica;
		this.artistaMusica = artistaMusica;
	}
	public String getNomeMusica() {
		return nomeMusica;
	}
	public void setNomeMusica(String nomeMusica) {
		this.nomeMusica = nomeMusica;
	}
	public String getTempoMusica() {
		return tempoMusica;
	}
	public void setTempoMusica(String tempoMusica) {
		this.tempoMusica = tempoMusica;
	}
	public double getPrecoMusica() {
		return precoMusica;
	}
	public void setPrecoMusica(double precoMusica) {
		this.precoMusica = precoMusica;
	}

	public Artista getArtistaMusica() {
		return artistaMusica;
	}
	public void setArtistaMusica(Artista artistaMusica) {
		this.artistaMusica = artistaMusica;
	}
	

	@Override
	public String toString() {
		
		
		return "\nNome da Música : "+this.getNomeMusica()+"\n"+
			   "Duração da Música : "+this.getTempoMusica()+"\n"+
			   "Artista : "+this.getArtistaMusica()+"\n"+
			   "Preço da Música : "+this.getPrecoMusica();
	}


	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Musica other = (Musica) obj;
		if (artistaMusica == null) {
			if (other.artistaMusica != null)
				return false;
		} else if (!artistaMusica.equals(other.artistaMusica))
			return false;
		if (nomeMusica == null) {
			if (other.nomeMusica != null)
				return false;
		} else if (!nomeMusica.equals(other.nomeMusica))
			return false;
		if (Double.doubleToLongBits(precoMusica) != Double.doubleToLongBits(other.precoMusica))
			return false;
		if (tempoMusica == null) {
			if (other.tempoMusica != null)
				return false;
		} else if (!tempoMusica.equals(other.tempoMusica))
			return false;
		return true;
	}}
