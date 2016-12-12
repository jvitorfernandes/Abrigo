package controller;
import model.*;
import view.*;

import java.util.*;

public class ControleTarefa {
	
	ArrayList<Tarefa> listaTarefas = new ArrayList<Tarefa>();
	
	public void adicionarTarefa(Tarefa umaTarefa){
		listaTarefas.add(umaTarefa);
	}
	
	public void removerTarefa(int x){
		listaTarefas.remove(x);
	}

	public ArrayList<Tarefa> getListaTarefas() {
		return listaTarefas;
	}

	public void setListaTarefas(ArrayList<Tarefa> listaTarefas) {
		this.listaTarefas = listaTarefas;
	}

}
