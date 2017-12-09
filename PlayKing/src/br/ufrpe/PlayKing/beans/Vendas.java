package br.ufrpe.PlayKing.beans;

import java.time.LocalDateTime;

public class Vendas {

	private String historicoVendas;//MOSTRARÁ TODAS AS VENDAS EM GERAL //vai virar um array de String
	private double totalGanhosVendas;//MOSTRARÁ O LUCRO TOTAL, GANHO COM ÀS MUSÍCAS E COM OS ALBÚNS VENDIDOS MAS A POR TIPO DE USUÁRIO/ vai virar um array de double
	private int quantidadeMusicasVendidas;//TODAS AS MUSICAS EM GERAL
	private int quantidadeAlbunsVendidos;//TODOS OS ALBÚNS EM GERAL
	private LocalDateTime dataVenda;

	public Vendas(String historicoVendas, double totalGanhosVendas, int quantidadeMusicasVendidas,
			int quantidadeAlbunsVendidos, LocalDateTime dataVenda) {
		super();
		this.historicoVendas = historicoVendas;
		this.totalGanhosVendas = totalGanhosVendas;
		this.quantidadeMusicasVendidas = quantidadeMusicasVendidas;
		this.quantidadeAlbunsVendidos = quantidadeAlbunsVendidos;
		this.dataVenda = dataVenda;
	}



	public String getHistoricoVendas() {
		return historicoVendas;
	}

	public void setHistoricoVendas(String historicoVendas) {
		this.historicoVendas = historicoVendas;
	}

	public double getTotalGanhosVendas() {
		return totalGanhosVendas;
	}

	public void setTotalGanhosVendas(double totalGanhosVendas) {
		this.totalGanhosVendas = totalGanhosVendas;
	}

	public int getQuantidadeMusicasVendidas() {
		return quantidadeMusicasVendidas;
	}

	public void setQuantidadeMusicasVendidas(int quantidadeMusicasVendidas) {
		this.quantidadeMusicasVendidas = quantidadeMusicasVendidas;
	}

	public int getQuantidadeAlbunsVendidos() {
		return quantidadeAlbunsVendidos;
	}

	public void setQuantidadeAlbunsVendidos(int quantidadeAlbunsVendidos) {
		this.quantidadeAlbunsVendidos = quantidadeAlbunsVendidos;
	}

	public LocalDateTime getDataVenda() {
		return dataVenda;
	}

	public void setDataVenda(LocalDateTime dataVenda) {
		this.dataVenda = dataVenda;
	}



	@Override
	public String toString() {
		return "Vendas [historicoVendas=" + historicoVendas + ", totalGanhosVendas=" + totalGanhosVendas
				+ ", quantidadeMusicasVendidas=" + quantidadeMusicasVendidas + ", quantidadeAlbunsVendidos="
				+ quantidadeAlbunsVendidos + ", dataVenda=" + dataVenda + "]";
	}



	


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vendas other = (Vendas) obj;
		if (dataVenda == null) {
			if (other.dataVenda != null)
				return false;
		} else if (!dataVenda.equals(other.dataVenda))
			return false;
		if (historicoVendas == null) {
			if (other.historicoVendas != null)
				return false;
		} else if (!historicoVendas.equals(other.historicoVendas))
			return false;
		if (quantidadeAlbunsVendidos != other.quantidadeAlbunsVendidos)
			return false;
		if (quantidadeMusicasVendidas != other.quantidadeMusicasVendidas)
			return false;
		if (Double.doubleToLongBits(totalGanhosVendas) != Double.doubleToLongBits(other.totalGanhosVendas))
			return false;
		return true;
	}
	



}
