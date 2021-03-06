package br.com.zup.edu.ligaqualidade.desafioprovadorpagamentos.modifique;

import java.math.BigDecimal;
import java.time.LocalDate;

public class FormaPagamento {

	private String status;
	private BigDecimal valorOriginal;
	private BigDecimal valorASerRecebidoDeFato;
	public LocalDate dataEsperadoRecebimento;

	public FormaPagamento(String status, BigDecimal valorOriginal, BigDecimal valorASerRecebidoDeFato,
			LocalDate dataEsperadoRecebimento) {
		super();
		this.status = status;
		this.valorOriginal = valorOriginal;
		this.valorASerRecebidoDeFato = valorASerRecebidoDeFato;
		this.dataEsperadoRecebimento = dataEsperadoRecebimento;
	}

	public String getStatus() {
		return status;
	}

	public BigDecimal getValorOriginal() {
		return valorOriginal;
	}

	public BigDecimal getValorASerRecebidoDeFato() {
		return valorASerRecebidoDeFato;
	}

	public LocalDate getDataEsperadoRecebimento() {
		return dataEsperadoRecebimento;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public void setValorOriginal(BigDecimal valorOriginal) {
		this.valorOriginal = valorOriginal;
	}

	public void setValorASerRecebidoDeFato(BigDecimal valorASerRecebidoDeFato) {
		this.valorASerRecebidoDeFato = valorASerRecebidoDeFato;
	}

	public void setDataEsperadoRecebimento(LocalDate dataEsperadoRecebimento) {
		this.dataEsperadoRecebimento = dataEsperadoRecebimento;
	}

}
