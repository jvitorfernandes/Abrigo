package controller;

import model.*;

import java.util.*;

import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;


public class ControleAnimais {
	
	public ArrayList<Animal> listaAnimais = new ArrayList<Animal>();
	
	public void adicionarAnimal(Animal umAnimal){
		listaAnimais.add(umAnimal);
	}
	
	public void removerAnimal(int x){
		x=x-1;
		listaAnimais.remove(x);
	}
	
	public ArrayList<Animal> getListaAnimais() {
		return listaAnimais;
	}

	public void setListaAnimais(ArrayList<Animal> listaAnimais) {
		this.listaAnimais = listaAnimais;
	}

	public void listarAnimais(JTextArea textArea){
		
		for(int i=0; i<listaAnimais.size(); i++){
			
			textArea.append("#" +(i+1)+ ":");
			textArea.append("\n\tNome: " + listaAnimais.get(i).getNome());
			textArea.append("\n\tEspecie: " + listaAnimais.get(i).getEspecie());
			textArea.append("\n\tData de Entrada: " + listaAnimais.get(i).getDataDeEntrada());
			textArea.append("\n\tNumero de controle: " + listaAnimais.get(i).getNcontrole() + "\n\n");
			

		}
	}
	
	public void listarTarerefas(JTextArea textArea, int n){
		
			n-=1;
			textArea.append("Listando Tarefas de " + listaAnimais.get(n).getNome() + "\n");

			for(int j=0; j<listaAnimais.get(n).getListaTarefas().size(); j++){
				
				if (listaAnimais.get(n).getListaTarefas().get(j) instanceof Alimentar) {
					
					textArea.append("\n\n# " + (j+1));
					textArea.append("\n\tRação: " + ((Alimentar)listaAnimais.get(n).getListaTarefas().get(j)).getRacao());
					textArea.append("\n\tQuantidade de Ração: " + ((Alimentar)listaAnimais.get(n).getListaTarefas().get(j)).getQuantidadeRacao());
					textArea.append("\n\tComplemento: " + ((Alimentar)listaAnimais.get(n).getListaTarefas().get(j)).getAdicional());
					textArea.append("\n\tQuantidade Complemento: " + ((Alimentar)listaAnimais.get(n).getListaTarefas().get(j)).getQuantidadeAdicional());
					textArea.append("\n\tData: " + ((Alimentar)listaAnimais.get(n).getListaTarefas().get(j)).getData());
					textArea.append("\n\tStatus: " + ((Alimentar)listaAnimais.get(n).getListaTarefas().get(j)).getStatus());
					textArea.append("\n\tDescrição: " + ((Alimentar)listaAnimais.get(n).getListaTarefas().get(j)).getDescricao());
					
				}

				else
					if (listaAnimais.get(n).getListaTarefas().get(j) instanceof Medicar) {				
						
						textArea.append("\n\n# " + (j+1));
						textArea.append("\n\tMedicamento: " + ((Medicar)listaAnimais.get(n).getListaTarefas().get(j)).getMedicamento());
						textArea.append("\n\tPosologia: " + ((Medicar)listaAnimais.get(n).getListaTarefas().get(j)).getPosologia());
						textArea.append("\n\tData: " + ((Medicar)listaAnimais.get(n).getListaTarefas().get(j)).getData());
						textArea.append("\n\tStatus: " + ((Medicar)listaAnimais.get(n).getListaTarefas().get(j)).getStatus());
						textArea.append("\n\tDescrição: " + ((Medicar)listaAnimais.get(n).getListaTarefas().get(j)).getDescricao());
						
					}
					else
						if (listaAnimais.get(n).getListaTarefas().get(j) instanceof Higiene) {
							
							textArea.append("\n\n# " + (j+1));
							textArea.append("\n\tMateriais: " + ((Higiene)listaAnimais.get(n).getListaTarefas().get(j)).getMateriais());
							textArea.append("\n\tMétodos: " + ((Higiene)listaAnimais.get(n).getListaTarefas().get(j)).getMetodos());
							textArea.append("\n\tCuidados: " + ((Higiene)listaAnimais.get(n).getListaTarefas().get(j)).getCuidados());
							textArea.append("\n\tData: " + ((Higiene)listaAnimais.get(n).getListaTarefas().get(j)).getData());
							textArea.append("\n\tStatus: " + ((Higiene)listaAnimais.get(n).getListaTarefas().get(j)).getStatus());
							textArea.append("\n\tDescrição: " + ((Higiene)listaAnimais.get(n).getListaTarefas().get(j)).getDescricao());
							
						}

						else
						{
							
							textArea.append("\n\n# " + (j+1));
							textArea.append("\n\tNome tarefa: " + listaAnimais.get(n).listaTarefas.get(j).getNome());
							textArea.append("\n\tStatus: " + listaAnimais.get(n).listaTarefas.get(j).getStatus());
							textArea.append("\n\tData: " + listaAnimais.get(n).listaTarefas.get(j).getData());
							textArea.append("\n\tDescrição: " + listaAnimais.get(n).listaTarefas.get(j).getDescricao());
						}
							
							
				
			}
		}
	
	public void listarCompleta(JTextArea textArea, int i){
			
			i-=1;
		
			textArea.append("Dados do animal: ");
			

			textArea.append("\n\tNome: " + listaAnimais.get(i).getNome());
			textArea.append("\n\tData de Entrada: " + listaAnimais.get(i).getDataDeEntrada());
			textArea.append("\n\tNumero de controle: " + listaAnimais.get(i).getNcontrole());
			textArea.append("\n\tEspecie: " + listaAnimais.get(i).getEspecie());
			textArea.append("\n\tRaça: " + listaAnimais.get(i).getRaca());
			textArea.append("\n\tIdade: " + listaAnimais.get(i).getIdade());
			textArea.append("\n\tPorte: " + listaAnimais.get(i).getPorte());
			textArea.append("\n\tPeso: " + listaAnimais.get(i).getPeso());
			textArea.append("\n\tCor: " + listaAnimais.get(i).getCor());
			textArea.append("\n\tDoenças: " + listaAnimais.get(i).getDoencas());
			textArea.append("\n\tInformação Adicional: " + listaAnimais.get(i).getInfoAdicional() + "\n\n");
			
			textArea.append("Dados do proprietário: \n");
			
			textArea.append("\n\tNome: " + listaAnimais.get(i).getProprietario().getNome());
			textArea.append("\n\tCPF: " + listaAnimais.get(i).getProprietario().getCpf());
			textArea.append("\n\tTelefone: " + listaAnimais.get(i).getProprietario().getTelefone());
			textArea.append("\n\tData de Nascimento: " + listaAnimais.get(i).getProprietario().getDataDeNascimento());
			textArea.append("\n\tCEP: " + listaAnimais.get(i).getProprietario().getEndereco().getCep());
			textArea.append("\n\tEstado: " + listaAnimais.get(i).getProprietario().getEndereco().getEstado());
			textArea.append("\n\tCidade: " + listaAnimais.get(i).getProprietario().getEndereco().getCidade());
			textArea.append("\n\tLogradouro: " + listaAnimais.get(i).getProprietario().getEndereco().getLogradouro());
			textArea.append("\n\tComplemento: " + listaAnimais.get(i).getProprietario().getEndereco().getComplemento());
	}

}
