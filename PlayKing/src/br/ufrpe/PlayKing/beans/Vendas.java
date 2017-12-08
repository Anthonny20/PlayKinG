package br.ufrpe.PlayKing.beans;

import java.time.LocalDateTime;

public class Vendas {

	private String historicoVendas;//MOSTRAR� TODAS AS VENDAS EM GERAL //vai virar um array de String
	private double totalGanhosVendas;//MOSTRAR� O LUCRO TOTAL, GANHO COM �S MUS�CAS E COM OS ALB�NS VENDIDOS MAS A POR TIPO DE USU�RIO/ vai virar um array de double
	private int quantidadeMusicasVendidas;//TODAS AS MUSICAS EM GERAL
	private int quantidadeAlbunsVendidos;//TODOS OS ALB�NS EM GERAL
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







}
