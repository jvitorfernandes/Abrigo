package model;

public class Alimentar extends Tarefa{
	
	public String racao;
	public String quantidadeRacao;
	public String adicional;
	public String quantidadeAdicional;
	
	public String getRacao() {
		return racao;
	}
	public void setRacao(String racao) {
		this.racao = racao;
	}
	public String getQuantidadeRacao() {
		return quantidadeRacao;
	}
	public void setQuantidadeRacao(String quantidadeRacao) {
		this.quantidadeRacao = quantidadeRacao;
	}
	public String getAdicional() {
		return adicional;
	}
	public void setAdicional(String adicional) {
		this.adicional = adicional;
	}
	public String getQuantidadeAdicional() {
		return quantidadeAdicional;
	}
	public void setQuantidadeAdicional(String quantidadeAdicional) {
		this.quantidadeAdicional = quantidadeAdicional;
	}
}
