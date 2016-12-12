package model;

import java.util.*;

public class Animal {
	
	public String nome;
	public String especie;
	public String raca;
	public String idade;
	public String cor;
	public String porte;
	public String peso;
	public String ncontrole;
	public String doencas;
	public String dataDeEntrada;
	public String infoAdicional;
	
	public Proprietario proprietario;
	public ArrayList<Tarefa> listaTarefas;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEspecie() {
		return especie;
	}
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	public String getRaca() {
		return raca;
	}
	public void setRaca(String raca) {
		this.raca = raca;
	}
	public String getIdade() {
		return idade;
	}
	public void setIdade(String idade) {
		this.idade = idade;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getPorte() {
		return porte;
	}
	public void setPorte(String porte) {
		this.porte = porte;
	}
	public String getPeso() {
		return peso;
	}
	public void setPeso(String peso) {
		this.peso = peso;
	}
	public String getNcontrole() {
		return ncontrole;
	}
	public void setNcontrole(String ncontrole) {
		this.ncontrole = ncontrole;
	}
	public String getDoencas() {
		return doencas;
	}
	public void setDoencas(String doencas) {
		this.doencas = doencas;
	}
	public String getDataDeEntrada() {
		return dataDeEntrada;
	}
	public void setDataDeEntrada(String dataDeEntrada) {
		this.dataDeEntrada = dataDeEntrada;
	}
	public String getInfoAdicional() {
		return infoAdicional;
	}
	public void setInfoAdicional(String infoAdicional) {
		this.infoAdicional = infoAdicional;
	}
	public Proprietario getProprietario() {
		return proprietario;
	}
	public void setProprietario(Proprietario proprietario) {
		this.proprietario = proprietario;
	}
	public ArrayList<Tarefa> getListaTarefas() {
		return listaTarefas;
	}
	public void setListaTarefas(ArrayList<Tarefa> listaTarefas) {
		this.listaTarefas = listaTarefas;
	}
	
	public void adicionarTarefa(Tarefa umaTarefa){
		listaTarefas.add(umaTarefa);
	}
	
	public void removerTarefa(int x){
		listaTarefas.remove(x);
	}
	
}
