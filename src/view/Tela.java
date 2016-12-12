package view;

import java.awt.EventQueue;

import model.*;
import controller.*;

import javax.swing.JFrame;

import java.awt.CardLayout;

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;



import javax.swing.JFormattedTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

import java.awt.Component;

import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.UIManager;
import javax.swing.border.BevelBorder;

import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;

public class Tela {

	private JFrame frmOla;
	private JTextField tfNome;
	private JTextField tfEspecie;
	private JTextField tfRaca;
	private JTextField tfDataDeEntrada;
	private JTextField tfIdade;
	private JTextField tfCor;
	private JTextField tfPorte;
	private JTextField tfPeso;
	private JTextField tfNumero;
	private JTextField tfDoencas;
	private JTextField tfInfoAdicional;
	
	private JTextField tfNomeP;
	private JTextField tfCPF;
	private JTextField tfDataDeNascimento;
	private JTextField tfEstado;
	private JTextField tfCidade;
	private JTextField tfCep;
	private JTextField tfLogradouro;
	private JTextField tfComplemento;
	private JTextField tfAnimal;
	
	private JPanel telaCadastroAnimal;
	private JPanel telaInicial;
	private JPanel telaCadastroProprietario;
	private JPanel telaPrincipalTarefa;
	private JPanel telaLista;
	

	
	private JButton btnAdicionar;
	private JButton btnListarAnimais;
	private JButton btnSalvarAnimal;
	private JTextField tfTelefone;
	
	Proprietario umProprietario;
	private Endereco umEndereco;
	Animal umAnimal;
	ControleAnimais controle = new ControleAnimais();
	ControleTarefa controleTarefa;
	
	
	private JTextField tfMateriais;
	private JTextField tfMetodos;
	private JTextField tfCuidados;
	private JTextField tfStatusHigiene;
	private JTextField tfDataHigiene;
	private JTextField tfDescricaoHigiene;
	
	private JTextField tfRacao;
	private JTextField tfQuantidade;
	private JTextField tfComplementoRacao;
	private JTextField tfQuantidadeComplemento;
	private JTextField tfStatusAlimentacao;
	private JTextField tfDataAlimentacao;
	private JTextField tfDescricaoAlimentacao;
	
	private JTextField tfMedicamento;
	private JTextField tfPosologia;
	private JTextField tfStatusMedicacao;
	private JTextField tfDataMedicacao;
	private JTextField tfDescricaoMedicacao;
	
	private JTextField tfNomeTarefa;
	private JTextField tfStatusTarefa;
	private JTextField tfDataTarefa;
	private JTextField tfDescricaoTarefa;
	private JTable table;
	private JTextField tfEscolha;
	
	public int escolha=0;
	
	private JButton btnAdicionarProprietrio;
	private JTextField tfEditarNome;
	private JTextField tfEditarData;
	private JTextField tfEditarIdade;
	private JTextField tfEditarEspecie;
	private JTextField tfEditarCor;
	private JTextField tfEditarPorte;
	private JTextField tfEditarRaca;
	private JTextField tfEditarPeso;
	private JTextField tfEditarNumero;
	private JTextField tfEditarDoencas;
	private JTextField tfEditarInfo;
	private JTextField tfEditarNomeP;
	private JTextField tfEditarEstado;
	private JTextField tfEditarCidade;
	private JTextField tfEditarCep;
	private JTextField tfEditarCpf;
	private JTextField tfEditarDataDeNascimento;
	private JTextField tfEditarTelefone;
	private JTextField tfEditarComplemento;
	private JTextField tfEditarLogradouro;
	private JTextField textField_9;
	private JTextField tfEscolhaTarefa;
	private JTextField tfRacaon;
	private JTextField tfQuantidaden;
	private JTextField tfQuantidadeComplementon;
	private JTextField tfComplementon;
	private JTextField tfStatusn;
	private JTextField tfDatan;
	private JTextField tfDescricaon;
	private JTextField tfNMedicamento;
	private JTextField tfNPosologia;
	private JTextField tfNStatusMedicamento;
	private JTextField tfNDataMedicamento;
	private JTextField tfNDescricaoMedicamento;
	private JTextField tfNMateriais;
	private JTextField tfNMetodos;
	private JTextField tfNStatusHigiene;
	private JTextField tfNDataHigiene;
	private JTextField tfNDescricaoHigiene;
	private JTextField tfNCuidados;
	private JTextField tfNNomeTarefa;
	private JTextField tfNDataTarefa;
	private JTextField tfNStatusTarefa;
	private JTextField tfNDescricaoTarefa;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela window = new Tela();
					window.frmOla.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Tela() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmOla = new JFrame();
		frmOla.setTitle("Abrigo");
		frmOla.setBounds(100, 100, 688, 460);
		frmOla.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmOla.getContentPane().setLayout(new CardLayout(0, 0));
		
		final JPanel telaInicial = new JPanel();
		frmOla.getContentPane().add(telaInicial, "name_1136182585885");
		telaInicial.setLayout(null);
		
		final JPanel telaCadastroAnimal = new JPanel();
		frmOla.getContentPane().add(telaCadastroAnimal, "name_1164778195026");
		telaCadastroAnimal.setLayout(null);
		
		final JPanel telaPrincipalTarefa = new JPanel();
		frmOla.getContentPane().add(telaPrincipalTarefa, "name_1212497626598");
		telaPrincipalTarefa.setLayout(null);
		
		final JPanel telaCadastroProprietario= new JPanel();
		frmOla.getContentPane().add(telaCadastroProprietario, "name_6499614669565");
		telaCadastroProprietario.setLayout(null);
		
		final JPanel telaLista = new JPanel();
		frmOla.getContentPane().add(telaLista, "name_9926647662242");
		telaLista.setLayout(null);
		
		final JPanel telaCadastroAlimentar = new JPanel();
		frmOla.getContentPane().add(telaCadastroAlimentar, "name_233864930476");
		telaCadastroAlimentar.setLayout(null);
		
		final JPanel telaCadastroOutra = new JPanel();
		frmOla.getContentPane().add(telaCadastroOutra, "name_383561245108");
		telaCadastroOutra.setLayout(null);
		
		final JPanel telaCadastroMedicar = new JPanel();
		frmOla.getContentPane().add(telaCadastroMedicar, "name_301836339771");
		telaCadastroMedicar.setLayout(null);
		
		final JPanel telaCadastroHigiene = new JPanel();
		frmOla.getContentPane().add(telaCadastroHigiene, "name_361790638682");
		telaCadastroHigiene.setLayout(null);
		
		final JPanel telaListaTarefas = new JPanel();
		telaListaTarefas.setLayout(null);
		frmOla.getContentPane().add(telaListaTarefas, "name_13954631312773");
		
		final JPanel telaListaDetalhes = new JPanel();
		frmOla.getContentPane().add(telaListaDetalhes, "name_1168016182548");
		telaListaDetalhes.setLayout(null);
		
		final JPanel telaEditarAnimal = new JPanel();
		frmOla.getContentPane().add(telaEditarAnimal, "name_4632501167266");
		telaEditarAnimal.setLayout(null);
		
		final JPanel telaEditarProprietario = new JPanel();
		frmOla.getContentPane().add(telaEditarProprietario, "name_3294920406242");
		telaEditarProprietario.setLayout(null);
		
		final JPanel telaEditarAlimentacao = new JPanel();
		frmOla.getContentPane().add(telaEditarAlimentacao, "name_10179594414205");
		telaEditarAlimentacao.setLayout(null);
		
		final JPanel telaEditarMedicamento = new JPanel();
		frmOla.getContentPane().add(telaEditarMedicamento, "name_10967816938108");
		telaEditarMedicamento.setLayout(null);
		
		final JPanel telaEditarHigiene = new JPanel();
		frmOla.getContentPane().add(telaEditarHigiene, "name_10994168472722");
		telaEditarHigiene.setLayout(null);
		
		JScrollPane scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(24, 37, 406, 383);
		telaListaDetalhes.add(scrollPane_3);
		
		final JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(22, 72, 414, 345);
		telaLista.add(scrollPane);
		
		final JTextArea textArea = new JTextArea();
		textArea.setWrapStyleWord(true);
		scrollPane.setViewportView(textArea);
		
		final JTextArea textArea_2 = new JTextArea();
		textArea_2.setWrapStyleWord(true);
		scrollPane_3.setViewportView(textArea_2);
		
		final JPanel telaEditarOutra = new JPanel();
		frmOla.getContentPane().add(telaEditarOutra, "name_11029221533311");
		telaEditarOutra.setLayout(null);
		
		JButton btnEditarAnimal = new JButton("Editar Animal");
		btnEditarAnimal.setIcon(new ImageIcon("icons/rsz_1417530146_new-24-128.png"));
		btnEditarAnimal.setBorderPainted(false);
		btnEditarAnimal.setBackground(new Color(0,0,0,0));
		btnEditarAnimal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				telaListaDetalhes.setVisible(false);
				telaEditarAnimal.setVisible(true);
				
				int i=escolha-1;
				
				tfEditarNome.setText(controle.getListaAnimais().get(i).getNome());
				tfEditarData.setText(controle.getListaAnimais().get(i).getDataDeEntrada());
				tfEditarNumero.setText(controle.getListaAnimais().get(i).getNcontrole());
				tfEditarEspecie.setText(controle.getListaAnimais().get(i).getEspecie());
				tfEditarRaca.setText(controle.getListaAnimais().get(i).getRaca());
				tfEditarIdade.setText(controle.getListaAnimais().get(i).getIdade());
				tfEditarPorte.setText(controle.getListaAnimais().get(i).getPorte());
				tfEditarPeso.setText(controle.getListaAnimais().get(i).getPeso());
				tfEditarCor.setText(controle.getListaAnimais().get(i).getCor());
				tfEditarDoencas.setText(controle.getListaAnimais().get(i).getDoencas());
				tfEditarInfo.setText(controle.getListaAnimais().get(i).getInfoAdicional());
				
				
			}
		});
		btnEditarAnimal.setBounds(462, 107, 171, 25);
		telaListaDetalhes.add(btnEditarAnimal);
		
		JButton btnEditarProprietrio = new JButton("Editar Proprietário");
		btnEditarProprietrio.setIcon(new ImageIcon("icons/rsz_1417530498_edit_user.png"));
		btnEditarProprietrio.setBackground(new Color(0,0,0,0));
		btnEditarProprietrio.setBorderPainted(false);
		btnEditarProprietrio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				///EDITAR PROPRIETÁRIO
				telaEditarProprietario.setVisible(true);
				telaListaDetalhes.setVisible(false);
				
				int i = escolha - 1;
				
				tfEditarNomeP.setText(controle.getListaAnimais().get(i).getProprietario().getNome());
				tfEditarDataDeNascimento.setText(controle.getListaAnimais().get(i).getProprietario().getDataDeNascimento());
				tfEditarTelefone.setText(controle.getListaAnimais().get(i).getProprietario().getTelefone());
				tfEditarCpf.setText(controle.getListaAnimais().get(i).getProprietario().getCpf());
				tfEditarCep.setText(controle.getListaAnimais().get(i).getProprietario().getEndereco().getCep());
				tfEditarEstado.setText(controle.getListaAnimais().get(i).getProprietario().getEndereco().getEstado());
				tfEditarCidade.setText(controle.getListaAnimais().get(i).getProprietario().getEndereco().getCidade());
				tfEditarLogradouro.setText(controle.getListaAnimais().get(i).getProprietario().getEndereco().getLogradouro());
				tfEditarComplemento.setText(controle.getListaAnimais().get(i).getProprietario().getEndereco().getComplemento());
				textField_9.setText(controle.getListaAnimais().get(i).getNome());
				
			}
		});
		btnEditarProprietrio.setBounds(462, 144, 214, 25);
		telaListaDetalhes.add(btnEditarProprietrio);
		
		JButton btnRemover_1 = new JButton("Remover");
		btnRemover_1.setIcon(new ImageIcon("icons/rsz_1417529830_cross-24-128.png"));
		btnRemover_1.setBackground(new Color(0,0,0,0));
		btnRemover_1.setBorderPainted(false);
		btnRemover_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				controle.removerAnimal(escolha);
				
				telaListaDetalhes.setVisible(false);
				telaLista.setVisible(true);
				
				textArea.setText("");
				controle.listarAnimais(textArea);
				
			}
		});
		btnRemover_1.setBounds(458, 181, 155, 25);
		telaListaDetalhes.add(btnRemover_1);
		
		JButton btnNewButton_9 = new JButton("Voltar");
		btnNewButton_9.setBorderPainted(false);
		btnNewButton_9.setBackground(new Color(0,0,0,0));
		btnNewButton_9.setIcon(new ImageIcon("icons/i13.png"));
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				telaListaDetalhes.setVisible(false);
				telaLista.setVisible(true);
				
				textArea.setText("");
				controle.listarAnimais(textArea);
				
			}
		});
		btnNewButton_9.setBounds(442, 327, 214, 93);
		telaListaDetalhes.add(btnNewButton_9);
		
		JLabel lblDetalhes = new JLabel("Detalhes");
		lblDetalhes.setBounds(489, 38, 70, 15);
		telaListaDetalhes.add(lblDetalhes);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(23, 39, 413, 381);
		telaListaTarefas.add(scrollPane_1);
		
		final JTextArea textArea_1 = new JTextArea();
		scrollPane_1.setViewportView(textArea_1);
		
		JButton btnNewButton_10 = new JButton("Remover");
		btnNewButton_10.setIcon(new ImageIcon("icons/rsz_1417529830_cross-24-128.png"));
		btnNewButton_10.setBorderPainted(false);
		btnNewButton_10.setBackground(new Color(0,0,0,0));
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int t = Integer.parseInt(tfEscolhaTarefa.getText());
				t=t-1;
				int j = escolha-1;
				
				controle.getListaAnimais().get(j).getListaTarefas().remove(t);
				
				textArea_1.setText("");
				controle.listarTarerefas(textArea_1, escolha);
				
			}
		});
		btnNewButton_10.setBounds(468, 120, 148, 25);
		telaListaTarefas.add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("Voltar");
		btnNewButton_11.setIcon(new ImageIcon("icons/i13.png"));
		btnNewButton_11.setBorderPainted(false);
		btnNewButton_11.setBackground(new Color(0,0,0,0));
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				telaLista.setVisible(true);
				telaListaTarefas.setVisible(false);
				
				
			}
		});
		btnNewButton_11.setBounds(439, 305, 211, 115);
		telaListaTarefas.add(btnNewButton_11);
		
		tfEscolhaTarefa = new JTextField();
		tfEscolhaTarefa.setBounds(522, 89, 68, 19);
		telaListaTarefas.add(tfEscolhaTarefa);
		tfEscolhaTarefa.setColumns(10);
		
		JButton btnAdicionar_1 = new JButton("Adicionar");
		btnAdicionar_1.setIcon(new ImageIcon("icons/rsz_1417529313_document_text_add-128.png"));
		btnAdicionar_1.setBackground(new Color(0,0,0,0));
		btnAdicionar_1.setBorderPainted(false);
		btnAdicionar_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				telaPrincipalTarefa.setVisible(true);
				telaListaTarefas.setVisible(false);
				
			}
		});
		btnAdicionar_1.setBounds(468, 194, 148, 25);
		telaListaTarefas.add(btnAdicionar_1);
		
		JButton btnEditar = new JButton("Editar");
		btnEditar.setIcon(new ImageIcon("icons/rsz_1417530146_new-24-128.png"));
		btnEditar.setBorderPainted(false);
		btnEditar.setBackground(new Color(0,0,0,0));
		btnEditar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int n = escolha-1;
				int i = Integer.parseInt(tfEscolhaTarefa.getText());
				i=i-1;
				
				if (controle.getListaAnimais().get(n).getListaTarefas().get(i) instanceof Alimentar) {
					
					telaEditarAlimentacao.setVisible(true);
					telaListaTarefas.setVisible(false);
					
					tfRacaon.setText(((Alimentar) controle.getListaAnimais().get(n).getListaTarefas().get(i)).getRacao());
					tfQuantidaden.setText(((Alimentar) controle.getListaAnimais().get(n).getListaTarefas().get(i)).getQuantidadeRacao());
					tfComplementon.setText(((Alimentar) controle.getListaAnimais().get(n).getListaTarefas().get(i)).getAdicional());
					tfQuantidadeComplementon.setText(((Alimentar) controle.getListaAnimais().get(n).getListaTarefas().get(i)).getQuantidadeAdicional());
					tfDatan.setText(((Alimentar) controle.getListaAnimais().get(n).getListaTarefas().get(i)).getData());
					tfStatusn.setText(((Alimentar) controle.getListaAnimais().get(n).getListaTarefas().get(i)).getStatus());
					tfDescricaon.setText(((Alimentar) controle.getListaAnimais().get(n).getListaTarefas().get(i)).getDescricao());
					
					
				}

				else
					if (controle.getListaAnimais().get(n).getListaTarefas().get(i) instanceof Medicar) {				
						
						telaEditarMedicamento.setVisible(true);
						telaListaTarefas.setVisible(false);
						
						tfNMedicamento.setText(((Medicar)controle.getListaAnimais().get(n).getListaTarefas().get(i)).getMedicamento());
						tfNPosologia.setText(((Medicar)controle.getListaAnimais().get(n).getListaTarefas().get(i)).getPosologia());
						tfNDataMedicamento.setText(((Medicar)controle.getListaAnimais().get(n).getListaTarefas().get(i)).getData());
						tfNStatusMedicamento.setText(((Medicar)controle.getListaAnimais().get(n).getListaTarefas().get(i)).getStatus());
						tfNDescricaoMedicamento.setText(((Medicar)controle.getListaAnimais().get(n).getListaTarefas().get(i)).getDescricao());
						
					}
					else
						if (controle.getListaAnimais().get(n).getListaTarefas().get(i) instanceof Higiene) {
							
							telaEditarHigiene.setVisible(true);
							telaListaTarefas.setVisible(false);
							
							tfNMateriais.setText(((Higiene)controle.getListaAnimais().get(n).getListaTarefas().get(i)).getMateriais());
							tfNMetodos.setText(((Higiene)controle.getListaAnimais().get(n).getListaTarefas().get(i)).getMetodos());
							tfNCuidados.setText(((Higiene)controle.getListaAnimais().get(n).getListaTarefas().get(i)).getCuidados());
							tfNDataHigiene.setText(((Higiene)controle.getListaAnimais().get(n).getListaTarefas().get(i)).getData());
							tfNStatusHigiene.setText(((Higiene)controle.getListaAnimais().get(n).getListaTarefas().get(i)).getStatus());
							tfNDescricaoHigiene.setText(((Higiene)controle.getListaAnimais().get(n).getListaTarefas().get(i)).getDescricao());
							
						}

						else
						{
							
							telaEditarOutra.setVisible(true);
							telaListaTarefas.setVisible(false);
							
							
							tfNNomeTarefa.setText(controle.getListaAnimais().get(n).listaTarefas.get(i).getNome());
							tfNStatusTarefa.setText(controle.getListaAnimais().get(n).listaTarefas.get(i).getStatus());
							tfNDataTarefa.setText(controle.getListaAnimais().get(n).listaTarefas.get(i).getData());
							tfNDescricaoTarefa.setText(controle.getListaAnimais().get(n).listaTarefas.get(i).getDescricao());
						}
				
			}
		});
		btnEditar.setBounds(456, 157, 148, 25);
		telaListaTarefas.add(btnEditar);
		
		JLabel label_26 = new JLabel("#");
		label_26.setBounds(508, 91, 25, 15);
		telaListaTarefas.add(label_26);
		
		JLabel lblListaDeTarefas = new JLabel("Lista de Tarefas");
		lblListaDeTarefas.setBounds(490, 40, 142, 15);
		telaListaTarefas.add(lblListaDeTarefas);
		
		///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		/*String col[] = {"Nome", "Data de Entrada","Especie"};
		
		DefaultTableModel tableModel = new DefaultTableModel(col, 0);
		

		Object[] teste = {"animal", "10/10/10", "cachorro"};
	
		tableModel.addRow(teste);
		
		Object[] outroteste = {controle.getListaAnimais().get(0).getNome(), "10/10/10", "cachorro"};
		tableModel.addRow(outroteste);
		
		for(int i = 0; i < controle.getListaAnimais().size(); i++){
			
			String nome = controle.getListaAnimais().get(i).getNome();
			String especie = controle.getListaAnimais().get(i).getEspecie();
			String dataEntrada = controle.getListaAnimais().get(i).getDataDeEntrada();

			Object[] data = {nome, especie, dataEntrada};
			tableModel.addRow(data);

		}
		table = new JTable(tableModel);
		scrollPane_2.setViewportView(table);
		
		
	
		table.getColumnModel().getColumn(0).setPreferredWidth(106);
		table.getColumnModel().getColumn(1).setPreferredWidth(98);
		table.getColumnModel().getColumn(2).setPreferredWidth(131);*/
		
		////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		JLabel lblAlimentao = new JLabel("Alimentação");
		lblAlimentao.setBounds(147, 37, 140, 15);
		telaCadastroAlimentar.add(lblAlimentao);
		
		JLabel lblNewLabel_6 = new JLabel("Ração");
		lblNewLabel_6.setBounds(70, 86, 70, 15);
		telaCadastroAlimentar.add(lblNewLabel_6);
		
		tfRacao = new JTextField();
		tfRacao.setBounds(70, 113, 217, 19);
		telaCadastroAlimentar.add(tfRacao);
		tfRacao.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("Quantidade");
		lblNewLabel_7.setBounds(299, 86, 114, 15);
		telaCadastroAlimentar.add(lblNewLabel_7);
		
		tfQuantidade = new JTextField();
		tfQuantidade.setBounds(299, 113, 114, 19);
		telaCadastroAlimentar.add(tfQuantidade);
		tfQuantidade.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("Complemento");
		lblNewLabel_8.setBounds(70, 144, 122, 15);
		telaCadastroAlimentar.add(lblNewLabel_8);
		
		tfComplementoRacao = new JTextField();
		tfComplementoRacao.setBounds(70, 171, 217, 19);
		telaCadastroAlimentar.add(tfComplementoRacao);
		tfComplementoRacao.setColumns(10);
		
		JLabel lblNewLabel_9 = new JLabel("Quantidade");
		lblNewLabel_9.setBounds(299, 144, 114, 15);
		telaCadastroAlimentar.add(lblNewLabel_9);
		
		tfQuantidadeComplemento = new JTextField();
		tfQuantidadeComplemento.setBounds(299, 171, 114, 19);
		telaCadastroAlimentar.add(tfQuantidadeComplemento);
		tfQuantidadeComplemento.setColumns(10);
		
		JLabel lblNewLabel_10 = new JLabel("Status");
		lblNewLabel_10.setBounds(70, 202, 70, 15);
		telaCadastroAlimentar.add(lblNewLabel_10);
		
		tfStatusAlimentacao = new JTextField();
		tfStatusAlimentacao.setBounds(70, 229, 217, 19);
		telaCadastroAlimentar.add(tfStatusAlimentacao);
		tfStatusAlimentacao.setColumns(10);
		
		JLabel lblNewLabel_11 = new JLabel("Data");
		lblNewLabel_11.setBounds(299, 202, 97, 15);
		telaCadastroAlimentar.add(lblNewLabel_11);
		
		tfDataAlimentacao = new JTextField();
		tfDataAlimentacao.setBounds(299, 229, 114, 19);
		telaCadastroAlimentar.add(tfDataAlimentacao);
		tfDataAlimentacao.setColumns(10);
		
		JLabel lblNewLabel_12 = new JLabel("Descrição");
		lblNewLabel_12.setBounds(70, 260, 70, 15);
		telaCadastroAlimentar.add(lblNewLabel_12);
		
		tfDescricaoAlimentacao = new JTextField();
		tfDescricaoAlimentacao.setBounds(70, 287, 217, 19);
		telaCadastroAlimentar.add(tfDescricaoAlimentacao);
		tfDescricaoAlimentacao.setColumns(10);
		
		JButton btnSalvarAlimentacao = new JButton("Salvar");
		btnSalvarAlimentacao.setBorderPainted(false);
		btnSalvarAlimentacao.setBackground(new Color(0,0,0,0));
		btnSalvarAlimentacao.setIcon(new ImageIcon("icons/i8.png"));
		btnSalvarAlimentacao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				String racao = tfRacao.getText();
				String quantidade = tfQuantidade.getText();
				String complementoR = tfComplementoRacao.getText();
				String quantidadeComplemento = tfQuantidadeComplemento.getText();
				String dataAlimentar = tfDataAlimentacao.getText();
				String statusAlimentar = tfStatusAlimentacao.getText();
				String descricaoAlimentar = tfDescricaoAlimentacao.getText();
				
				Alimentar alimentar = new Alimentar();
				
				alimentar.setRacao(racao);
				alimentar.setQuantidadeRacao(quantidade);
				alimentar.setAdicional(complementoR);
				alimentar.setQuantidadeAdicional(quantidadeComplemento);
				alimentar.setData(dataAlimentar);
				alimentar.setStatus(statusAlimentar);
				alimentar.setDescricao(descricaoAlimentar);
				
				if (escolha!=0){
					
					int n = escolha-1;
					controle.getListaAnimais().get(n).adicionarTarefa(alimentar);
					
				}
				
				else
		
				controleTarefa.adicionarTarefa(alimentar);
				
				tfRacao.setText("");
				tfQuantidade.setText("");
				tfComplementoRacao.setText("");
				tfQuantidadeComplemento.setText("");
				tfDataAlimentacao.setText("");
				tfStatusAlimentacao.setText("");
				tfDescricaoAlimentacao.setText("");
				
				telaCadastroAlimentar.setVisible(false);
				telaPrincipalTarefa.setVisible(true);
				
			}
		});
		btnSalvarAlimentacao.setBounds(270, 330, 230, 90);
		telaCadastroAlimentar.add(btnSalvarAlimentacao);
		
		JButton btnCancelarAlimentacao = new JButton("Cancelar");
		btnCancelarAlimentacao.setBackground(new Color(0,0,0,0));
		btnCancelarAlimentacao.setBorderPainted(false);
		btnCancelarAlimentacao.setIcon(new ImageIcon("icons/i14.png"));
		btnCancelarAlimentacao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				telaCadastroAlimentar.setVisible(false);
				telaPrincipalTarefa.setVisible(true);
			}
		});
		btnCancelarAlimentacao.setBounds(28, 330, 230, 90);
		telaCadastroAlimentar.add(btnCancelarAlimentacao);
		
		JLabel lblNewLabel_20 = new JLabel("");
		lblNewLabel_20.setIcon(new ImageIcon("icons/i9.png"));
		lblNewLabel_20.setBounds(461, 66, 150, 171);
		telaCadastroAlimentar.add(lblNewLabel_20);
		
		JLabel label_39 = new JLabel("");
		label_39.setIcon(new ImageIcon("/media/jvitorfernandes/FABIO/icones/i5.png"));
		label_39.setBounds(471, 229, 164, 86);
		telaCadastroAlimentar.add(label_39);
		
		
		
		JLabel lblNovaMedicao = new JLabel("Nova Medicação");
		lblNovaMedicao.setBounds(211, 27, 148, 15);
		telaCadastroMedicar.add(lblNovaMedicao);
		
		JLabel lblMedicamento = new JLabel("Medicamento");
		lblMedicamento.setBounds(132, 83, 114, 15);
		telaCadastroMedicar.add(lblMedicamento);
		
		tfMedicamento = new JTextField();
		tfMedicamento.setBounds(132, 110, 240, 19);
		telaCadastroMedicar.add(tfMedicamento);
		tfMedicamento.setColumns(10);
		
		JLabel lblNewLabel_13 = new JLabel("Posologia");
		lblNewLabel_13.setBounds(132, 141, 70, 15);
		telaCadastroMedicar.add(lblNewLabel_13);
		
		tfPosologia = new JTextField();
		tfPosologia.setBounds(132, 168, 240, 19);
		telaCadastroMedicar.add(tfPosologia);
		tfPosologia.setColumns(10);
		
		JLabel lblNewLabel_14 = new JLabel("Status");
		lblNewLabel_14.setBounds(132, 199, 70, 15);
		telaCadastroMedicar.add(lblNewLabel_14);
		
		tfStatusMedicacao = new JTextField();
		tfStatusMedicacao.setBounds(132, 226, 114, 19);
		telaCadastroMedicar.add(tfStatusMedicacao);
		tfStatusMedicacao.setColumns(10);
		
		JLabel lblNewLabel_15 = new JLabel("Data");
		lblNewLabel_15.setBounds(258, 204, 70, 15);
		telaCadastroMedicar.add(lblNewLabel_15);
		
		tfDataMedicacao = new JTextField();
		tfDataMedicacao.setBounds(258, 226, 114, 19);
		telaCadastroMedicar.add(tfDataMedicacao);
		tfDataMedicacao.setColumns(10);
		
		JLabel lblNewLabel_16 = new JLabel("Descrição");
		lblNewLabel_16.setBounds(132, 257, 70, 15);
		telaCadastroMedicar.add(lblNewLabel_16);
		
		tfDescricaoMedicacao = new JTextField();
		tfDescricaoMedicacao.setBounds(132, 284, 240, 19);
		telaCadastroMedicar.add(tfDescricaoMedicacao);
		tfDescricaoMedicacao.setColumns(10);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setIcon(new ImageIcon("icons/i8.png"));
		btnSalvar.setBackground(new Color(0,0,0,0));
		btnSalvar.setBorderPainted(false);
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String medicamento = tfMedicamento.getText();
				String posologia = tfPosologia.getText();
				String data = tfDataMedicacao.getText();
				String status = tfStatusMedicacao.getText();
				String descricao = tfDescricaoMedicacao.getText();
				
				Medicar medicar = new Medicar();
				
				medicar.setMedicamento(medicamento);
				medicar.setPosologia(posologia);
				medicar.setData(data);
				medicar.setDescricao(descricao);
				medicar.setStatus(status);
				
				if (escolha!=0){
					
					int n = escolha-1;
					controle.getListaAnimais().get(n).adicionarTarefa(medicar);
					
				}
				else
				controleTarefa.adicionarTarefa(medicar);
				
				tfMedicamento.setText("");
				tfPosologia.setText("");
				tfDataMedicacao.setText("");
				tfStatusMedicacao.setText("");
				tfDescricaoMedicacao.setText("");
				
				telaCadastroMedicar.setVisible(false);
				telaPrincipalTarefa.setVisible(true);
			}
		});
		btnSalvar.setBounds(276, 315, 221, 92);
		telaCadastroMedicar.add(btnSalvar);
		
		JButton btnNewButton_2 = new JButton("Cancelar");
		btnNewButton_2.setIcon(new ImageIcon("icons/i14.png"));
		btnNewButton_2.setBackground(new Color(0,0,0,0));
		btnNewButton_2.setBorderPainted(false);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				telaPrincipalTarefa.setVisible(true);
				telaCadastroMedicar.setVisible(false);
			}
		});
		btnNewButton_2.setBounds(22, 315, 242, 92);
		telaCadastroMedicar.add(btnNewButton_2);
		
		JLabel lblNewLabel_23 = new JLabel("");
		lblNewLabel_23.setIcon(new ImageIcon("icons/i11.png"));
		lblNewLabel_23.setBounds(436, 129, 158, 143);
		telaCadastroMedicar.add(lblNewLabel_23);
		
		
		
		JLabel lblTestando = new JLabel("Adicionar Tarefa de Higiene");
		lblTestando.setBounds(194, 29, 207, 15);
		telaCadastroHigiene.add(lblTestando);
		
		JLabel lblNewLabel_1 = new JLabel("Materiais");
		lblNewLabel_1.setBounds(35, 77, 70, 15);
		telaCadastroHigiene.add(lblNewLabel_1);
		
		tfMateriais = new JTextField();
		tfMateriais.setBounds(35, 104, 272, 19);
		telaCadastroHigiene.add(tfMateriais);
		tfMateriais.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Métodos");
		lblNewLabel_2.setBounds(373, 77, 70, 15);
		telaCadastroHigiene.add(lblNewLabel_2);
		
		tfMetodos = new JTextField();
		tfMetodos.setBounds(373, 104, 272, 19);
		telaCadastroHigiene.add(tfMetodos);
		tfMetodos.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Cuidados");
		lblNewLabel_3.setBounds(35, 135, 70, 15);
		telaCadastroHigiene.add(lblNewLabel_3);
		
		tfCuidados = new JTextField();
		tfCuidados.setBounds(35, 162, 272, 19);
		telaCadastroHigiene.add(tfCuidados);
		tfCuidados.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Status");
		lblNewLabel_4.setBounds(373, 135, 70, 15);
		telaCadastroHigiene.add(lblNewLabel_4);
		
		tfStatusHigiene = new JTextField();
		tfStatusHigiene.setBounds(373, 162, 146, 19);
		telaCadastroHigiene.add(tfStatusHigiene);
		tfStatusHigiene.setColumns(10);
		
		JLabel lblData = new JLabel("Data");
		lblData.setBounds(531, 135, 70, 15);
		telaCadastroHigiene.add(lblData);
		
		tfDataHigiene = new JTextField();
		tfDataHigiene.setBounds(531, 162, 114, 19);
		telaCadastroHigiene.add(tfDataHigiene);
		tfDataHigiene.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Descrição");
		lblNewLabel_5.setBounds(35, 193, 70, 15);
		telaCadastroHigiene.add(lblNewLabel_5);
		
		tfDescricaoHigiene = new JTextField();
		tfDescricaoHigiene.setBounds(35, 220, 484, 19);
		telaCadastroHigiene.add(tfDescricaoHigiene);
		tfDescricaoHigiene.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("Salvar");
		btnNewButton_1.setIcon(new ImageIcon("icons/i8.png"));
		btnNewButton_1.setBackground(new Color(0,0,0,0));
		btnNewButton_1.setBorderPainted(false);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				String materiais = tfMateriais.getText();
				String metodos = tfMetodos.getText();
				String cuidados = tfCuidados.getText();
				String status = tfStatusHigiene.getText();
				String data = tfDataHigiene.getText();
				String descricao = tfDescricaoHigiene.getText();
				
				Higiene higiene = new Higiene();
				
				higiene.setMateriais(materiais);
				higiene.setMetodos(metodos);
				higiene.setCuidados(cuidados);
				higiene.setData(data);
				higiene.setDescricao(descricao);
				higiene.setStatus(status);
				
				if (escolha!=0){
					
					int n = escolha-1;
					controle.getListaAnimais().get(n).adicionarTarefa(higiene);
					
				}
				
				else
				controleTarefa.adicionarTarefa(higiene);
				
				tfMateriais.setText("");
				tfMetodos.setText("");
				tfCuidados.setText("");
				tfStatusHigiene.setText("");
				tfDataHigiene.setText("");
				tfDescricaoHigiene.setText("");
				
				telaCadastroHigiene.setVisible(false);
				telaPrincipalTarefa.setVisible(true);
				
			}
		});
		btnNewButton_1.setBounds(318, 289, 238, 97);
		telaCadastroHigiene.add(btnNewButton_1);
		
		JButton btnCancelar_1 = new JButton("Cancelar");
		btnCancelar_1.setIcon(new ImageIcon("icons/i14.png"));
		btnCancelar_1.setBackground(new Color(0,0,0,0));
		btnCancelar_1.setBorderPainted(false);
		btnCancelar_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				telaPrincipalTarefa.setVisible(true);
				telaCadastroHigiene.setVisible(false);
			}
		});
		btnCancelar_1.setBounds(60, 289, 238, 86);
		telaCadastroHigiene.add(btnCancelar_1);
		
		
		
		JLabel lblNewLabel_17 = new JLabel("Nova Tarefa");
		lblNewLabel_17.setBounds(200, 53, 131, 15);
		telaCadastroOutra.add(lblNewLabel_17);
		
		JLabel lblNewLabel_18 = new JLabel("Nome");
		lblNewLabel_18.setBounds(76, 91, 70, 15);
		telaCadastroOutra.add(lblNewLabel_18);
		
		tfNomeTarefa = new JTextField();
		tfNomeTarefa.setBounds(76, 118, 302, 19);
		telaCadastroOutra.add(tfNomeTarefa);
		tfNomeTarefa.setColumns(10);
		
		JLabel lblStatus = new JLabel("Status");
		lblStatus.setBounds(76, 149, 70, 15);
		telaCadastroOutra.add(lblStatus);
		
		tfStatusTarefa = new JTextField();
		tfStatusTarefa.setBounds(76, 176, 114, 19);
		telaCadastroOutra.add(tfStatusTarefa);
		tfStatusTarefa.setColumns(10);
		
		JLabel lblData_1 = new JLabel("Data");
		lblData_1.setBounds(233, 149, 70, 15);
		telaCadastroOutra.add(lblData_1);
		
		tfDataTarefa = new JTextField();
		tfDataTarefa.setBounds(233, 176, 114, 19);
		telaCadastroOutra.add(tfDataTarefa);
		tfDataTarefa.setColumns(10);
		
		JLabel lblDescricao = new JLabel("Descricao");
		lblDescricao.setBounds(76, 207, 70, 15);
		telaCadastroOutra.add(lblDescricao);
		
		tfDescricaoTarefa = new JTextField();
		tfDescricaoTarefa.setBounds(76, 234, 302, 19);
		telaCadastroOutra.add(tfDescricaoTarefa);
		tfDescricaoTarefa.setColumns(10);
		
		JButton btnNewButton_4 = new JButton("Salvar");
		btnNewButton_4.setBackground(new Color(0,0,0,0));
		btnNewButton_4.setIcon(new ImageIcon("icons/i8.png"));
		btnNewButton_4.setBorderPainted(false);
		btnNewButton_4.setForeground(Color.DARK_GRAY);
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String nomeTarefa = tfNomeTarefa.getText();
				String dataTarefa = tfDataTarefa.getText();
				String statusTarefa = tfStatusTarefa.getText();
				String descricaoTarefa = tfDescricaoTarefa.getText();
				
				Tarefa tarefa = new Tarefa();
				
				tarefa.setNome(nomeTarefa);
				tarefa.setData(dataTarefa);
				tarefa.setStatus(statusTarefa);
				tarefa.setDescricao(descricaoTarefa);
				
				
				if (escolha!=0){
					
					int n = escolha-1;
					controle.getListaAnimais().get(n).adicionarTarefa(tarefa);
					
				}
				
				else
				controleTarefa.adicionarTarefa(tarefa);
				
				tfNomeTarefa.setText("");
				tfDataTarefa.setText("");
				tfStatusTarefa.setText("");
				tfDescricaoTarefa.setText("");
				
				telaCadastroOutra.setVisible(false);
				telaPrincipalTarefa.setVisible(true);
			}
		});
		btnNewButton_4.setBounds(272, 285, 230, 103);
		telaCadastroOutra.add(btnNewButton_4);
		
		JButton btnNewButton_6 = new JButton("Cancelar");
		btnNewButton_6.setIcon(new ImageIcon("icons/i14.png"));
		btnNewButton_6.setBorderPainted(false);
		btnNewButton_6.setBackground(new Color(0,0,0,0) );
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				telaPrincipalTarefa.setVisible(true);
				telaCadastroOutra.setVisible(false);
			}
		});
		btnNewButton_6.setBounds(35, 289, 230, 94);
		telaCadastroOutra.add(btnNewButton_6);
		
		JLabel lblNewLabel_22 = new JLabel("");
		lblNewLabel_22.setIcon(new ImageIcon("icons/i6.png"));
		lblNewLabel_22.setBounds(397, 74, 119, 103);
		telaCadastroOutra.add(lblNewLabel_22);
		
		JLabel label_47 = new JLabel("");
		label_47.setIcon(new ImageIcon("icons/i6.png"));
		label_47.setBounds(516, 74, 119, 103);
		telaCadastroOutra.add(label_47);
		
		JLabel label_48 = new JLabel("");
		label_48.setIcon(new ImageIcon("icons/i6.png"));
		label_48.setBounds(397, 170, 119, 103);
		telaCadastroOutra.add(label_48);
		
		JLabel label_49 = new JLabel("");
		label_49.setIcon(new ImageIcon("icons/i6.png"));
		label_49.setBounds(516, 170, 119, 103);
		telaCadastroOutra.add(label_49);
		
		
		
		JButton btnNewButton_8 = new JButton("Tarefas");
		btnNewButton_8.setBackground(new Color(0,0,0,0));
		btnNewButton_8.setBorderPainted(false);
		btnNewButton_8.setIcon(new ImageIcon("icons/rsz_1417529501_document_text-128.png"));
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				telaLista.setVisible(false);
				telaListaTarefas.setVisible(true);
				
				escolha = Integer.parseInt(tfEscolha.getText());
				
				textArea_1.setText("");
				controle.listarTarerefas(textArea_1, escolha);
				
				
			}
		});
		btnNewButton_8.setBounds(458, 135, 145, 25);
		telaLista.add(btnNewButton_8);
		
		JLabel lblListaDeAnimais = new JLabel("Lista de Animais Cadastrados");
		lblListaDeAnimais.setBounds(22, 45, 235, 15);
		telaLista.add(lblListaDeAnimais);
		
		tfEscolha = new JTextField();
		tfEscolha.setBounds(491, 104, 95, 19);
		telaLista.add(tfEscolha);
		tfEscolha.setColumns(10);
		
		JButton btnDetalhes = new JButton("Detalhes");
		btnDetalhes.setBackground(new Color(0,0,0,0));
		btnDetalhes.setBorderPainted(false);
		btnDetalhes.setIcon(new ImageIcon("icons/rsz_1417529709_circle_info_more-information_detail-128.png"));
		btnDetalhes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				telaListaDetalhes.setVisible(true);
				telaLista.setVisible(false);
				
				escolha = Integer.parseInt(tfEscolha.getText());
				
				textArea_2.setText("");
				controle.listarCompleta(textArea_2, escolha);
				
			}
		});
		btnDetalhes.setBounds(448, 172, 165, 25);
		telaLista.add(btnDetalhes);
		
		JButton btnRemover = new JButton("Remover");
		btnRemover.setBackground(new Color(0,0,0,0));
		btnRemover.setBorderPainted(false);
		btnRemover.setIcon(new ImageIcon("icons/rsz_1417529830_cross-24-128.png"));
		btnRemover.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				int escolha = Integer.parseInt(tfEscolha.getText());
				
				controle.removerAnimal(escolha);
				textArea.setText("");
				controle.listarAnimais(textArea);
				
			}
		});
		btnRemover.setBounds(469, 209, 124, 25);
		telaLista.add(btnRemover);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setIcon(new ImageIcon("icons/i13.png"));
		btnVoltar.setBorderPainted(false);
		btnVoltar.setBackground(new Color(0,0,0,0));
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				telaLista.setVisible(false);
				telaInicial.setVisible(true);
				
				escolha=0;
				
				textArea.setText("");
				controle.listarAnimais(textArea);
				
				tfEscolha.setText("");
			}
		});
		btnVoltar.setBounds(436, 319, 228, 88);
		telaLista.add(btnVoltar);
		
		JLabel lblInsiraONmero = new JLabel("Insira o número");
		lblInsiraONmero.setBounds(469, 77, 117, 15);
		telaLista.add(lblInsiraONmero);
		
		JLabel lblNewLabel_19 = new JLabel("#");
		lblNewLabel_19.setBounds(469, 106, 19, 15);
		telaLista.add(lblNewLabel_19);
		
		JButton btnAdicionar = new JButton("Adicionar Animal");
		btnAdicionar.setBorderPainted(false);
		btnAdicionar.setBackground(new Color(0, 0, 0, 0));
		btnAdicionar.setIcon(new ImageIcon("icons/i7.png"));
		btnAdicionar.setBounds(28, 93, 271, 126);
		btnAdicionar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				telaInicial.setVisible(false);
				telaCadastroAnimal.setVisible(true);
				
				umAnimal = new Animal();
				controleTarefa = new ControleTarefa();
			}
		});
		
		JButton btnNewButton_5 = new JButton("Outra");
		btnNewButton_5.setBorderPainted(false);
		btnNewButton_5.setBackground(new Color (0, 0, 0, 0));
		btnNewButton_5.setIcon(new ImageIcon("icons/Untitled-2.png"));
		btnNewButton_5.setBounds(354, 211, 241, 82);
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				telaCadastroOutra.setVisible(true);
				telaPrincipalTarefa.setVisible(false);
			}
		});
		JButton btnMedicamento = new JButton("Medicamento");
		btnMedicamento.setBorderPainted(false);
		btnMedicamento.setBackground(new Color (0, 0, 0, 0));
		btnMedicamento.setIcon(new ImageIcon("icons/i11.png"));
		btnMedicamento.setBounds(334, 85, 327, 111);
		btnMedicamento.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				telaCadastroMedicar.setVisible(true);
				telaPrincipalTarefa.setVisible(false);
			}
		});
		JButton btnHigiene = new JButton("Higiene");
		btnHigiene.setBorderPainted(false);
		btnHigiene.setBackground(new Color(0, 0, 0, 0));
		btnHigiene.setIcon(new ImageIcon("icons/i10.png"));
		btnHigiene.setBounds(-32, 84, 327, 113);
		btnHigiene.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				telaCadastroHigiene.setVisible(true);
				telaPrincipalTarefa.setVisible(false);
			}
		});
		JButton btnAlimentao = new JButton("Alimentação");
		btnAlimentao.setBorderPainted(false);
		btnAlimentao.setBackground(new Color(0, 0, 0, 0));
		btnAlimentao.setIcon(new ImageIcon("icons/i9.png"));
		btnAlimentao.setBounds(12, 209, 255, 86);
		btnAlimentao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				telaCadastroAlimentar.setVisible(true);
				telaPrincipalTarefa.setVisible(false);
			}
		});
		
		JButton btnNewButton_7 = new JButton("Voltar");
		btnNewButton_7.setBorderPainted(false);
		btnNewButton_7.setForeground(UIManager.getColor("Button.foreground"));
		btnNewButton_7.setBackground(new Color(0,0,0,0));
		btnNewButton_7.setIcon(new ImageIcon("icons/i13.png"));
		btnNewButton_7.setBounds(200, 307, 224, 113);
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(escolha!=0){
					telaPrincipalTarefa.setVisible(false);
					telaListaTarefas.setVisible(true);
					
					textArea_1.setText("");
					controle.listarTarerefas(textArea_1, escolha);
				}
				
				else{
				
				telaPrincipalTarefa.setVisible(false);
				telaCadastroAnimal.setVisible(true);
				
				
				}
			}
		});
		telaPrincipalTarefa.setLayout(null);
		telaPrincipalTarefa.add(btnNewButton_7);
		telaPrincipalTarefa.add(btnNewButton_5);
		telaPrincipalTarefa.add(btnMedicamento);
		telaPrincipalTarefa.add(btnHigiene);
		telaPrincipalTarefa.add(btnAlimentao);
		
		JLabel lblNovaTarefa = new JLabel("Nova Tarefa");
		lblNovaTarefa.setFont(new Font("Dialog", Font.BOLD, 18));
		lblNovaTarefa.setBounds(278, 25, 131, 22);
		telaPrincipalTarefa.add(lblNovaTarefa);
		
		JButton btnListar = new JButton("Listar Animais");
		btnListar.setBackground(new Color(0, 0, 0, 0));
		btnListar.setIcon(new ImageIcon("icons/Untitled-2.png"));
		btnListar.setBorderPainted(false);
		btnListar.setBounds(0, 246, 287, 90);
		btnListar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				telaInicial.setVisible(false);
				telaLista.setVisible(true);
				
				textArea.setText("");
				controle.listarAnimais(textArea);
			}
		});
		telaInicial.setLayout(null);
		telaInicial.add(btnListar);
		telaInicial.add(btnAdicionar);
		
		JLabel lblMen = new JLabel("Menu");
		lblMen.setFont(new Font("Dialog", Font.BOLD, 18));
		lblMen.setBounds(28, 66, 70, 15);
		telaInicial.add(lblMen);
		
		JLabel lblNewLabel_21 = new JLabel("New label");
		lblNewLabel_21.setIcon(new ImageIcon("icons/rsz_2789776.png"));
		lblNewLabel_21.setBounds(292, 36, 353, 365);
		telaInicial.add(lblNewLabel_21);
		
		
		
		JLabel lblAdicionalAnimal = new JLabel("Adicionar Animal");
		lblAdicionalAnimal.setBounds(46, 12, 123, 32);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(46, 62, 40, 15);
		
		JLabel lblEspcie = new JLabel("Espécie");
		lblEspcie.setBounds(355, 62, 54, 15);
		
		JLabel lblRaa = new JLabel("Raça");
		lblRaa.setBounds(508, 62, 34, 15);
		
		JLabel lblDataDeEntrada = new JLabel("Data de entrada");
		lblDataDeEntrada.setBounds(46, 105, 117, 15);
		
		JLabel lblIdade = new JLabel("Idade");
		lblIdade.setBounds(195, 105, 40, 15);
		
		JLabel lblCor = new JLabel("Cor");
		lblCor.setBounds(355, 105, 24, 15);
		
		tfNome = new JTextField();
		tfNome.setBounds(46, 80, 288, 19);
		tfNome.setColumns(10);
		
		tfEspecie = new JTextField();
		tfEspecie.setBounds(355, 80, 114, 19);
		tfEspecie.setColumns(10);
		
		tfRaca = new JTextField();
		tfRaca.setBounds(508, 80, 114, 19);
		tfRaca.setColumns(10);
		
		tfDataDeEntrada = new JTextField();
		tfDataDeEntrada.setBounds(46, 126, 114, 19);
		tfDataDeEntrada.setColumns(10);
		
		tfIdade = new JTextField();
		tfIdade.setBounds(195, 126, 139, 19);
		tfIdade.setColumns(10);
		
		tfCor = new JTextField();
		tfCor.setBounds(355, 126, 114, 19);
		tfCor.setColumns(10);
		
		JLabel lblPorte = new JLabel("Porte");
		lblPorte.setBounds(508, 105, 39, 15);
		
		tfPorte = new JTextField();
		tfPorte.setBounds(508, 126, 114, 19);
		tfPorte.setColumns(10);
		
		JLabel lblPeso = new JLabel("Peso");
		lblPeso.setBounds(46, 151, 35, 15);
		
		tfPeso = new JTextField();
		tfPeso.setBounds(46, 172, 114, 19);
		tfPeso.setColumns(10);
		
		JLabel lblN = new JLabel("Nº");
		lblN.setBounds(195, 151, 17, 15);
		
		tfNumero = new JTextField();
		tfNumero.setBounds(195, 172, 139, 19);
		tfNumero.setColumns(10);
		
		JLabel lblDoenas = new JLabel("Doenças");
		lblDoenas.setBounds(46, 197, 61, 15);
		
		tfDoencas = new JTextField();
		tfDoencas.setBounds(46, 221, 255, 19);
		tfDoencas.setColumns(10);
		
		JLabel lblInformaoAdicional = new JLabel("Informação Adicional");
		lblInformaoAdicional.setBounds(46, 249, 147, 15);
		
		tfInfoAdicional = new JTextField();
		tfInfoAdicional.setBounds(46, 270, 263, 19);
		tfInfoAdicional.setColumns(10);
		
		final JButton btnAdicionarProprietrio = new JButton("Adicionar Proprietário");
		btnAdicionarProprietrio.setBorderPainted(false);
		btnAdicionarProprietrio.setForeground(Color.BLACK);
		btnAdicionarProprietrio.setIcon(new ImageIcon("icons/rsz_1417528518_add_user.png"));
		btnAdicionarProprietrio.setBackground(new Color(0,0,0,0));
		btnAdicionarProprietrio.setBounds(352, 218, 270, 25);
		btnAdicionarProprietrio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				telaCadastroAnimal.setVisible(false);
				telaCadastroProprietario.setVisible(true);
				
				tfAnimal.setText(tfNome.getText());
			}
		});
		
		JButton btnNewButton = new JButton("Adicionar Tarefas");
		btnNewButton.setIcon(new ImageIcon("icons/rsz_1417529313_document_text_add-128.png"));
		btnNewButton.setBackground(new Color(0,0,0,0));
		btnNewButton.setBorderPainted(false);
		btnNewButton.setBounds(352, 267, 237, 25);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				telaCadastroAnimal.setVisible(false);
				telaPrincipalTarefa.setVisible(true);
				
			}
		});
		
		JButton btnSalvarProprietario = new JButton("Salvar");
		btnSalvarProprietario.setIcon(new ImageIcon("icons/i8.png"));
		btnSalvarProprietario.setBackground(new Color(0,0,0,0));
		btnSalvarProprietario.setBorderPainted(false);
		btnSalvarProprietario.setBounds(353, 300, 234, 105);
		btnSalvarProprietario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				telaCadastroProprietario.setVisible(false);
				telaCadastroAnimal.setVisible(true);
				
			}
		});
		
		JButton btnSalvarAnimal = new JButton("Salvar");
		btnSalvarAnimal.setIcon(new ImageIcon("icons/i8.png"));
		btnSalvarAnimal.setBackground(new Color(0,0,0,0));
		btnSalvarAnimal.setBorderPainted(false);
		btnSalvarAnimal.setBounds(393, 318, 229, 102);
		btnSalvarAnimal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
					
				Animal umAnimal = new Animal();
				
				//Adicionando Proprietario
				Proprietario umProprietario = new Proprietario();
				Endereco umEndereco = new Endereco();
				
				String nomeP = tfNomeP.getText();
				String cpf = tfCPF.getText();
				String telefone = tfTelefone.getText();
				String dataDeNascimento = tfDataDeNascimento.getText();
				
				umProprietario.setNome(nomeP);
				umProprietario.setCpf(cpf);
				umProprietario.setTelefone(telefone);
				umProprietario.setDataDeNascimento(dataDeNascimento);
				
				String cep = tfCep.getText();
				String estado = tfEstado.getText();
				String cidade = tfCidade.getText();
				String logradouro = tfLogradouro.getText();
				String complemento = tfComplemento.getText();
				
				umEndereco.setCep(cep);
				umEndereco.setEstado(estado);
				umEndereco.setCidade(cidade);
				umEndereco.setLogradouro(logradouro);
				umEndereco.setComplemento(complemento);
				
				umProprietario.setEndereco(umEndereco);
				/////////////////////////////////////////////////////////////////
				
				
				
				String nome = tfNome.getText();
				String especie = tfEspecie.getText();
				String raca = tfRaca.getText();
				String idade = tfIdade.getText();
				String cor = tfCor.getText();
				String porte = tfPorte.getText();
				String peso = tfPeso.getText();
				String ncontrole = tfNumero.getText();
				String doencas = tfDoencas.getText();
				String dataDeEntrada = tfDataDeEntrada.getText();
				String infoAdicional = tfInfoAdicional.getText();
				
				umAnimal.setNome(nome);
				umAnimal.setEspecie(especie);
				umAnimal.setRaca(raca);
				umAnimal.setIdade(idade);
				umAnimal.setCor(cor);
				umAnimal.setPorte(porte);
				umAnimal.setPeso(peso);
				umAnimal.setNcontrole(ncontrole);
				umAnimal.setDoencas(doencas);
				umAnimal.setDataDeEntrada(dataDeEntrada);
				umAnimal.setInfoAdicional(infoAdicional);
				
				umAnimal.setProprietario(umProprietario);
				umAnimal.setListaTarefas(controleTarefa.getListaTarefas());
				
				//umAnimal.getListaTarefas().add();
				
				controle.adicionarAnimal(umAnimal);
				
				tfNome.setText("");
				tfEspecie.setText("");
				tfRaca.setText("");
				tfIdade.setText("");
				tfCor.setText("");
				tfPorte.setText("");
				tfPeso.setText("");
				tfNumero.setText("");
				tfDoencas.setText("");
				tfDataDeEntrada.setText("");
				tfInfoAdicional.setText("");
				
				
				tfNomeP.setText("");
				tfCPF.setText("");
				tfTelefone.setText("");
				tfDataDeNascimento.setText("");
				tfCep.setText("");
				tfEstado.setText("");
				tfCidade.setText("");
				tfLogradouro.setText("");
				tfComplemento.setText("");
				
				escolha=0;
				
				telaInicial.setVisible(true);
				telaCadastroAnimal.setVisible(false);
				
			}
		});
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBorderPainted(false);
		btnCancelar.setBackground(new Color(0, 0, 0, 0));
		btnCancelar.setIcon(new ImageIcon("icons/i14.png"));
		btnCancelar.setBounds(142, 326, 237, 86);
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				telaCadastroAnimal.setVisible(false);
				telaInicial.setVisible(true);
			}
		});
		telaCadastroAnimal.setLayout(null);
		telaCadastroAnimal.add(tfInfoAdicional);
		telaCadastroAnimal.add(lblDoenas);
		telaCadastroAnimal.add(tfPeso);
		telaCadastroAnimal.add(lblAdicionalAnimal);
		telaCadastroAnimal.add(lblNome);
		telaCadastroAnimal.add(tfDataDeEntrada);
		telaCadastroAnimal.add(lblDataDeEntrada);
		telaCadastroAnimal.add(lblPeso);
		telaCadastroAnimal.add(lblN);
		telaCadastroAnimal.add(lblIdade);
		telaCadastroAnimal.add(tfIdade);
		telaCadastroAnimal.add(tfNumero);
		telaCadastroAnimal.add(tfNome);
		telaCadastroAnimal.add(lblEspcie);
		telaCadastroAnimal.add(tfEspecie);
		telaCadastroAnimal.add(lblCor);
		telaCadastroAnimal.add(tfCor);
		telaCadastroAnimal.add(tfPorte);
		telaCadastroAnimal.add(lblPorte);
		telaCadastroAnimal.add(tfRaca);
		telaCadastroAnimal.add(lblRaa);
		telaCadastroAnimal.add(btnCancelar);
		telaCadastroAnimal.add(btnSalvarAnimal);
		telaCadastroAnimal.add(btnNewButton);
		telaCadastroAnimal.add(btnAdicionarProprietrio);
		telaCadastroAnimal.add(lblInformaoAdicional);
		telaCadastroAnimal.add(tfDoencas);
		

		
		JLabel lblCadastroProprietrio = new JLabel("Cadastro Proprietário");
		lblCadastroProprietrio.setBounds(12, 12, 155, 15);
		
		JLabel lblNome_1 = new JLabel("Nome");
		lblNome_1.setBounds(38, 51, 40, 15);
		
		tfNomeP = new JTextField();
		tfNomeP.setBounds(38, 72, 248, 19);
		tfNomeP.setColumns(10);
		
		JLabel lblCpf = new JLabel("CPF");
		lblCpf.setBounds(304, 51, 26, 15);
		
		tfCPF = new JTextField();
		tfCPF.setBounds(304, 72, 155, 19);
		tfCPF.setColumns(10);
		
		JLabel lblDataDeNascimento = new JLabel("Data de Nascimento");
		lblDataDeNascimento.setBounds(475, 51, 201, 15);
		
		tfDataDeNascimento = new JTextField();
		tfDataDeNascimento.setBounds(477, 72, 143, 19);
		tfDataDeNascimento.setColumns(10);
		
		JLabel lblEstado = new JLabel("Estado");
		lblEstado.setBounds(38, 97, 49, 15);
		
		tfEstado = new JTextField();
		tfEstado.setBounds(38, 118, 114, 19);
		tfEstado.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Cidade");
		lblNewLabel.setBounds(170, 97, 49, 15);
		
		tfCidade = new JTextField();
		tfCidade.setBounds(170, 118, 114, 19);
		tfCidade.setColumns(10);
		
		JLabel lblCep = new JLabel("CEP");
		lblCep.setBounds(304, 97, 26, 15);
		
		tfCep = new JTextField();
		tfCep.setBounds(304, 118, 155, 19);
		tfCep.setColumns(10);
		
		JLabel lblLogradouro = new JLabel("Logradouro");
		lblLogradouro.setBounds(38, 143, 83, 15);
		
		tfLogradouro = new JTextField();
		tfLogradouro.setBounds(38, 164, 411, 19);
		tfLogradouro.setColumns(10);
		
		JLabel lblComplemento = new JLabel("Complemento");
		lblComplemento.setBounds(477, 143, 97, 15);
		
		tfComplemento = new JTextField();
		tfComplemento.setBounds(477, 164, 143, 19);
		tfComplemento.setColumns(10);
		
		JLabel lblProprietrioDe = new JLabel("Proprietário de");
		lblProprietrioDe.setBounds(115, 232, 108, 15);
		
		tfAnimal = new JTextField();
		tfAnimal.setBounds(235, 230, 308, 19);
		tfAnimal.setColumns(10);
		
		
		
		JButton btnNewButton_3 = new JButton("Cancelar");
		btnNewButton_3.setBorderPainted(false);
		btnNewButton_3.setIcon(new ImageIcon("icons/i14.png"));
		btnNewButton_3.setBackground(new Color(0,0,0,0));
		btnNewButton_3.setBounds(71, 300, 259, 105);
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				telaCadastroProprietario.setVisible(false);
				telaCadastroAnimal.setVisible(true);
			}
		});
		telaCadastroProprietario.setLayout(null);
		telaCadastroProprietario.add(lblCadastroProprietrio);
		telaCadastroProprietario.add(lblLogradouro);
		telaCadastroProprietario.add(lblNome_1);
		telaCadastroProprietario.add(tfNomeP);
		telaCadastroProprietario.add(tfEstado);
		telaCadastroProprietario.add(lblEstado);
		telaCadastroProprietario.add(lblNewLabel);
		telaCadastroProprietario.add(tfCidade);
		telaCadastroProprietario.add(btnNewButton_3);
		telaCadastroProprietario.add(lblCep);
		telaCadastroProprietario.add(tfCep);
		telaCadastroProprietario.add(tfCPF);
		telaCadastroProprietario.add(lblCpf);
		telaCadastroProprietario.add(lblDataDeNascimento);
		telaCadastroProprietario.add(lblComplemento);
		telaCadastroProprietario.add(tfDataDeNascimento);
		telaCadastroProprietario.add(tfComplemento);
		telaCadastroProprietario.add(btnSalvarProprietario);
		telaCadastroProprietario.add(tfLogradouro);
		telaCadastroProprietario.add(lblProprietrioDe);
		telaCadastroProprietario.add(tfAnimal);
		
		JLabel lblTelefone = new JLabel("Telefone");
		lblTelefone.setBounds(475, 97, 70, 15);
		telaCadastroProprietario.add(lblTelefone);
		
		tfTelefone = new JTextField();
		tfTelefone.setBounds(475, 118, 145, 19);
		telaCadastroProprietario.add(tfTelefone);
		tfTelefone.setColumns(10);
		
		
		
		JLabel label = new JLabel("Nome");
		label.setBounds(32, 51, 40, 15);
		telaEditarAnimal.add(label);
		
		tfEditarNome = new JTextField();
		tfEditarNome.setColumns(10);
		tfEditarNome.setBounds(32, 69, 288, 19);
		telaEditarAnimal.add(tfEditarNome);
		
		JLabel label_1 = new JLabel("Data de entrada");
		label_1.setBounds(32, 94, 117, 15);
		telaEditarAnimal.add(label_1);
		
		tfEditarData = new JTextField();
		tfEditarData.setColumns(10);
		tfEditarData.setBounds(32, 115, 114, 19);
		telaEditarAnimal.add(tfEditarData);
		
		tfEditarIdade = new JTextField();
		tfEditarIdade.setColumns(10);
		tfEditarIdade.setBounds(181, 115, 139, 19);
		telaEditarAnimal.add(tfEditarIdade);
		
		JLabel label_2 = new JLabel("Idade");
		label_2.setBounds(181, 94, 40, 15);
		telaEditarAnimal.add(label_2);
		
		tfEditarEspecie = new JTextField();
		tfEditarEspecie.setColumns(10);
		tfEditarEspecie.setBounds(341, 69, 114, 19);
		telaEditarAnimal.add(tfEditarEspecie);
		
		JLabel label_3 = new JLabel("Espécie");
		label_3.setBounds(341, 51, 54, 15);
		telaEditarAnimal.add(label_3);
		
		JLabel label_4 = new JLabel("Cor");
		label_4.setBounds(341, 94, 24, 15);
		telaEditarAnimal.add(label_4);
		
		tfEditarCor = new JTextField();
		tfEditarCor.setColumns(10);
		tfEditarCor.setBounds(341, 115, 114, 19);
		telaEditarAnimal.add(tfEditarCor);
		
		tfEditarPorte = new JTextField();
		tfEditarPorte.setColumns(10);
		tfEditarPorte.setBounds(494, 115, 114, 19);
		telaEditarAnimal.add(tfEditarPorte);
		
		JLabel label_5 = new JLabel("Porte");
		label_5.setBounds(494, 94, 39, 15);
		telaEditarAnimal.add(label_5);
		
		tfEditarRaca = new JTextField();
		tfEditarRaca.setColumns(10);
		tfEditarRaca.setBounds(494, 69, 114, 19);
		telaEditarAnimal.add(tfEditarRaca);
		
		JLabel label_6 = new JLabel("Raça");
		label_6.setBounds(494, 51, 34, 15);
		telaEditarAnimal.add(label_6);
		
		tfEditarPeso = new JTextField();
		tfEditarPeso.setColumns(10);
		tfEditarPeso.setBounds(32, 161, 114, 19);
		telaEditarAnimal.add(tfEditarPeso);
		
		JLabel label_7 = new JLabel("Peso");
		label_7.setBounds(32, 140, 35, 15);
		telaEditarAnimal.add(label_7);
		
		JLabel label_8 = new JLabel("Nº");
		label_8.setBounds(181, 140, 17, 15);
		telaEditarAnimal.add(label_8);
		
		tfEditarNumero = new JTextField();
		tfEditarNumero.setColumns(10);
		tfEditarNumero.setBounds(181, 161, 139, 19);
		telaEditarAnimal.add(tfEditarNumero);
		
		tfEditarDoencas = new JTextField();
		tfEditarDoencas.setColumns(10);
		tfEditarDoencas.setBounds(32, 210, 255, 19);
		telaEditarAnimal.add(tfEditarDoencas);
		
		JLabel label_9 = new JLabel("Doenças");
		label_9.setBounds(32, 186, 61, 15);
		telaEditarAnimal.add(label_9);
		
		JLabel label_10 = new JLabel("Informação Adicional");
		label_10.setBounds(32, 238, 147, 15);
		telaEditarAnimal.add(label_10);
		
		tfEditarInfo = new JTextField();
		tfEditarInfo.setColumns(10);
		tfEditarInfo.setBounds(32, 259, 263, 19);
		telaEditarAnimal.add(tfEditarInfo);
		
		JButton btnSalvarAlteraes = new JButton("Salvar");
		btnSalvarAlteraes.setIcon(new ImageIcon("icons/i8.png"));
		btnSalvarAlteraes.setBorderPainted(false);
		btnSalvarAlteraes.setBackground(new Color(0,0,0,0));
		btnSalvarAlteraes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int i=escolha-1;
				controle.getListaAnimais().get(i).setNome(tfEditarNome.getText());
				controle.getListaAnimais().get(i).setDataDeEntrada(tfEditarData.getText());
				controle.getListaAnimais().get(i).setNcontrole(tfEditarNumero.getText());
				controle.getListaAnimais().get(i).setEspecie(tfEditarEspecie.getText());
				controle.getListaAnimais().get(i).setRaca(tfEditarRaca.getText());
				controle.getListaAnimais().get(i).setIdade(tfEditarIdade.getText());
				controle.getListaAnimais().get(i).setPorte(tfEditarPorte.getText());
				controle.getListaAnimais().get(i).setPeso(tfEditarPeso.getText());
				controle.getListaAnimais().get(i).setCor(tfEditarCor.getText());
				controle.getListaAnimais().get(i).setDoencas(tfEditarDoencas.getText());
				controle.getListaAnimais().get(i).setInfoAdicional(tfEditarInfo.getText());
				
				telaEditarAnimal.setVisible(false);
				telaListaDetalhes.setVisible(true);
				
				textArea_2.setText("");
				controle.listarCompleta(textArea_2, escolha);
				
			}
		});
		btnSalvarAlteraes.setBounds(356, 256, 263, 116);
		telaEditarAnimal.add(btnSalvarAlteraes);
		
		
		
		tfEditarNomeP = new JTextField();
		tfEditarNomeP.setColumns(10);
		tfEditarNomeP.setBounds(26, 94, 248, 19);
		telaEditarProprietario.add(tfEditarNomeP);
		
		JLabel label_11 = new JLabel("Nome");
		label_11.setBounds(26, 73, 40, 15);
		telaEditarProprietario.add(label_11);
		
		JLabel label_12 = new JLabel("Estado");
		label_12.setBounds(26, 119, 49, 15);
		telaEditarProprietario.add(label_12);
		
		tfEditarEstado = new JTextField();
		tfEditarEstado.setColumns(10);
		tfEditarEstado.setBounds(26, 140, 114, 19);
		telaEditarProprietario.add(tfEditarEstado);
		
		JLabel label_13 = new JLabel("Cidade");
		label_13.setBounds(158, 119, 49, 15);
		telaEditarProprietario.add(label_13);
		
		tfEditarCidade = new JTextField();
		tfEditarCidade.setColumns(10);
		tfEditarCidade.setBounds(158, 140, 114, 19);
		telaEditarProprietario.add(tfEditarCidade);
		
		tfEditarCep = new JTextField();
		tfEditarCep.setColumns(10);
		tfEditarCep.setBounds(292, 140, 155, 19);
		telaEditarProprietario.add(tfEditarCep);
		
		JLabel label_14 = new JLabel("CEP");
		label_14.setBounds(292, 119, 26, 15);
		telaEditarProprietario.add(label_14);
		
		tfEditarCpf = new JTextField();
		tfEditarCpf.setColumns(10);
		tfEditarCpf.setBounds(292, 94, 155, 19);
		telaEditarProprietario.add(tfEditarCpf);
		
		JLabel label_15 = new JLabel("CPF");
		label_15.setBounds(292, 73, 26, 15);
		telaEditarProprietario.add(label_15);
		
		JLabel label_16 = new JLabel("Data de Nascimento");
		label_16.setBounds(463, 73, 201, 15);
		telaEditarProprietario.add(label_16);
		
		tfEditarDataDeNascimento = new JTextField();
		tfEditarDataDeNascimento.setColumns(10);
		tfEditarDataDeNascimento.setBounds(465, 94, 143, 19);
		telaEditarProprietario.add(tfEditarDataDeNascimento);
		
		tfEditarTelefone = new JTextField();
		tfEditarTelefone.setColumns(10);
		tfEditarTelefone.setBounds(463, 140, 145, 19);
		telaEditarProprietario.add(tfEditarTelefone);
		
		tfEditarComplemento = new JTextField();
		tfEditarComplemento.setColumns(10);
		tfEditarComplemento.setBounds(465, 186, 143, 19);
		telaEditarProprietario.add(tfEditarComplemento);
		
		tfEditarLogradouro = new JTextField();
		tfEditarLogradouro.setColumns(10);
		tfEditarLogradouro.setBounds(26, 186, 411, 19);
		telaEditarProprietario.add(tfEditarLogradouro);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(223, 252, 308, 19);
		telaEditarProprietario.add(textField_9);
		
		JLabel label_17 = new JLabel("Proprietário de");
		label_17.setBounds(103, 254, 108, 15);
		telaEditarProprietario.add(label_17);
		
		JButton button = new JButton("Salvar");
		button.setIcon(new ImageIcon("icons/i8.png"));
		button.setBorderPainted(false);
		button.setBackground(new Color(0,0,0,0));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int i = escolha - 1;
				
				controle.getListaAnimais().get(i).getProprietario().setNome(tfEditarNomeP.getText());
				controle.getListaAnimais().get(i).getProprietario().setDataDeNascimento(tfEditarDataDeNascimento.getText());
				controle.getListaAnimais().get(i).getProprietario().setTelefone(tfEditarTelefone.getText());
				controle.getListaAnimais().get(i).getProprietario().setCpf(tfEditarCpf.getText());
				controle.getListaAnimais().get(i).getProprietario().getEndereco().setCep(tfEditarCep.getText());
				controle.getListaAnimais().get(i).getProprietario().getEndereco().setEstado(tfEditarEstado.getText());
				controle.getListaAnimais().get(i).getProprietario().getEndereco().setCidade(tfEditarCidade.getText());
				controle.getListaAnimais().get(i).getProprietario().getEndereco().setLogradouro(tfEditarLogradouro.getText());
				controle.getListaAnimais().get(i).getProprietario().getEndereco().setComplemento(tfEditarComplemento.getText());
				
				telaEditarProprietario.setVisible(false);
				telaListaDetalhes.setVisible(true);
				
				textArea_2.setText("");
				controle.listarCompleta(textArea_2, escolha);
				
			}
		});
		button.setBounds(223, 302, 248, 86);
		telaEditarProprietario.add(button);
		
		JLabel lblTelefone_1 = new JLabel("Telefone");
		lblTelefone_1.setBounds(463, 119, 70, 15);
		telaEditarProprietario.add(lblTelefone_1);
		
		JLabel lblLogradouro_1 = new JLabel("Logradouro");
		lblLogradouro_1.setBounds(26, 169, 114, 15);
		telaEditarProprietario.add(lblLogradouro_1);
		
		JLabel lblComplemento_1 = new JLabel("Complemento");
		lblComplemento_1.setBounds(463, 169, 145, 15);
		telaEditarProprietario.add(lblComplemento_1);
		
		JLabel label_18 = new JLabel("Alimentação");
		label_18.setBounds(207, 12, 140, 15);
		telaEditarAlimentacao.add(label_18);
		
		JLabel label_19 = new JLabel("Ração");
		label_19.setBounds(48, 60, 70, 15);
		telaEditarAlimentacao.add(label_19);
		
		tfRacaon = new JTextField();
		tfRacaon.setColumns(10);
		tfRacaon.setBounds(48, 87, 217, 19);
		telaEditarAlimentacao.add(tfRacaon);
		
		JLabel label_20 = new JLabel("Quantidade");
		label_20.setBounds(277, 60, 114, 15);
		telaEditarAlimentacao.add(label_20);
		
		tfQuantidaden = new JTextField();
		tfQuantidaden.setColumns(10);
		tfQuantidaden.setBounds(277, 87, 114, 19);
		telaEditarAlimentacao.add(tfQuantidaden);
		
		tfQuantidadeComplementon = new JTextField();
		tfQuantidadeComplementon.setColumns(10);
		tfQuantidadeComplementon.setBounds(277, 145, 114, 19);
		telaEditarAlimentacao.add(tfQuantidadeComplementon);
		
		JLabel label_21 = new JLabel("Quantidade");
		label_21.setBounds(277, 118, 114, 15);
		telaEditarAlimentacao.add(label_21);
		
		tfComplementon = new JTextField();
		tfComplementon.setColumns(10);
		tfComplementon.setBounds(48, 145, 217, 19);
		telaEditarAlimentacao.add(tfComplementon);
		
		JLabel label_22 = new JLabel("Complemento");
		label_22.setBounds(48, 118, 122, 15);
		telaEditarAlimentacao.add(label_22);
		
		tfStatusn = new JTextField();
		tfStatusn.setColumns(10);
		tfStatusn.setBounds(48, 203, 217, 19);
		telaEditarAlimentacao.add(tfStatusn);
		
		JLabel label_23 = new JLabel("Status");
		label_23.setBounds(48, 176, 70, 15);
		telaEditarAlimentacao.add(label_23);
		
		tfDatan = new JTextField();
		tfDatan.setColumns(10);
		tfDatan.setBounds(277, 203, 114, 19);
		telaEditarAlimentacao.add(tfDatan);
		
		JLabel label_24 = new JLabel("Data");
		label_24.setBounds(277, 176, 97, 15);
		telaEditarAlimentacao.add(label_24);
		
		tfDescricaon = new JTextField();
		tfDescricaon.setColumns(10);
		tfDescricaon.setBounds(48, 261, 217, 19);
		telaEditarAlimentacao.add(tfDescricaon);
		
		JLabel label_25 = new JLabel("Descrição");
		label_25.setBounds(48, 234, 70, 15);
		telaEditarAlimentacao.add(label_25);
		
		JButton button_2 = new JButton("Salvar");
		button_2.setIcon(new ImageIcon("icons/i8.png"));
		button_2.setBackground(new Color(0,0,0,0));
		button_2.setBorderPainted(false);
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int n = escolha-1;
				int i = Integer.parseInt(tfEscolhaTarefa.getText());
				i=i-1;
				
				((Alimentar) controle.getListaAnimais().get(n).getListaTarefas().get(i)).setRacao(tfRacaon.getText());
				((Alimentar) controle.getListaAnimais().get(n).getListaTarefas().get(i)).setQuantidadeRacao(tfQuantidaden.getText());
				((Alimentar) controle.getListaAnimais().get(n).getListaTarefas().get(i)).setAdicional(tfComplementon.getText());
				((Alimentar) controle.getListaAnimais().get(n).getListaTarefas().get(i)).setQuantidadeAdicional(tfQuantidadeComplementon.getText());
				((Alimentar) controle.getListaAnimais().get(n).getListaTarefas().get(i)).setData(tfDatan.getText());
				((Alimentar) controle.getListaAnimais().get(n).getListaTarefas().get(i)).setStatus(tfStatusn.getText());
				((Alimentar) controle.getListaAnimais().get(n).getListaTarefas().get(i)).setDescricao(tfDescricaon.getText());
				
				telaEditarAlimentacao.setVisible(false);
				telaListaTarefas.setVisible(true);
				
				textArea_1.setText("");
				controle.listarTarerefas(textArea_1, escolha);
				
			}
		});
		button_2.setBounds(187, 305, 232, 96);
		telaEditarAlimentacao.add(button_2);
		
		JLabel lblNewLabel_24 = new JLabel("");
		lblNewLabel_24.setIcon(new ImageIcon("icons/i5.png"));
		lblNewLabel_24.setBounds(447, 194, 164, 86);
		telaEditarAlimentacao.add(lblNewLabel_24);
		
		JLabel lblNewLabel_25 = new JLabel("");
		lblNewLabel_25.setIcon(new ImageIcon("icons/i9.png"));
		lblNewLabel_25.setBounds(437, 87, 137, 90);
		telaEditarAlimentacao.add(lblNewLabel_25);
		
		JLabel lblEditarMedicao = new JLabel("Editar Medicação");
		lblEditarMedicao.setBounds(175, 12, 148, 15);
		telaEditarMedicamento.add(lblEditarMedicao);
		
		JLabel label_27 = new JLabel("Medicamento");
		label_27.setBounds(96, 68, 114, 15);
		telaEditarMedicamento.add(label_27);
		
		tfNMedicamento = new JTextField();
		tfNMedicamento.setColumns(10);
		tfNMedicamento.setBounds(96, 95, 240, 19);
		telaEditarMedicamento.add(tfNMedicamento);
		
		JLabel label_28 = new JLabel("Posologia");
		label_28.setBounds(96, 126, 70, 15);
		telaEditarMedicamento.add(label_28);
		
		tfNPosologia = new JTextField();
		tfNPosologia.setColumns(10);
		tfNPosologia.setBounds(96, 153, 240, 19);
		telaEditarMedicamento.add(tfNPosologia);
		
		JLabel label_29 = new JLabel("Status");
		label_29.setBounds(96, 184, 70, 15);
		telaEditarMedicamento.add(label_29);
		
		tfNStatusMedicamento = new JTextField();
		tfNStatusMedicamento.setColumns(10);
		tfNStatusMedicamento.setBounds(96, 211, 114, 19);
		telaEditarMedicamento.add(tfNStatusMedicamento);
		
		tfNDataMedicamento = new JTextField();
		tfNDataMedicamento.setColumns(10);
		tfNDataMedicamento.setBounds(222, 211, 114, 19);
		telaEditarMedicamento.add(tfNDataMedicamento);
		
		JLabel label_30 = new JLabel("Data");
		label_30.setBounds(222, 189, 70, 15);
		telaEditarMedicamento.add(label_30);
		
		tfNDescricaoMedicamento = new JTextField();
		tfNDescricaoMedicamento.setColumns(10);
		tfNDescricaoMedicamento.setBounds(96, 269, 240, 19);
		telaEditarMedicamento.add(tfNDescricaoMedicamento);
		
		JButton button_5 = new JButton("Salvar");
		button_5.setIcon(new ImageIcon("icons/i8.png"));
		button_5.setBackground(new Color(0,0,0,0));
		button_5.setBorderPainted(false);
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int n = escolha-1;
				int i = Integer.parseInt(tfEscolhaTarefa.getText());
				i=i-1;
				
				((Medicar)controle.getListaAnimais().get(n).getListaTarefas().get(i)).setMedicamento(tfNMedicamento.getText());
				((Medicar)controle.getListaAnimais().get(n).getListaTarefas().get(i)).setPosologia(tfNPosologia.getText());
				((Medicar)controle.getListaAnimais().get(n).getListaTarefas().get(i)).setData(tfNDataMedicamento.getText());
				((Medicar)controle.getListaAnimais().get(n).getListaTarefas().get(i)).setStatus(tfNStatusMedicamento.getText());
				((Medicar)controle.getListaAnimais().get(n).getListaTarefas().get(i)).setDescricao(tfNDescricaoMedicamento.getText());
				
				telaEditarMedicamento.setVisible(false);
				telaListaTarefas.setVisible(true);
				
				textArea_1.setText("");
				controle.listarTarerefas(textArea_1, escolha);
				
			}
		});
		button_5.setBounds(106, 305, 240, 94);
		telaEditarMedicamento.add(button_5);
		
		JLabel label_31 = new JLabel("Descrição");
		label_31.setBounds(96, 242, 70, 15);
		telaEditarMedicamento.add(label_31);
		
		JLabel lblNewLabel_26 = new JLabel("");
		lblNewLabel_26.setIcon(new ImageIcon("icons/i11.png"));
		lblNewLabel_26.setBounds(364, 68, 148, 160);
		telaEditarMedicamento.add(lblNewLabel_26);
		
		JLabel label_50 = new JLabel("");
		label_50.setIcon(new ImageIcon("icons/i11.png"));
		label_50.setBounds(507, 68, 148, 160);
		telaEditarMedicamento.add(label_50);
		
		JLabel label_51 = new JLabel("");
		label_51.setIcon(new ImageIcon("/media/jvitorfernandes/FABIO/icones/i11.png"));
		label_51.setBounds(364, 184, 148, 160);
		telaEditarMedicamento.add(label_51);
		
		JLabel label_52 = new JLabel("");
		label_52.setIcon(new ImageIcon("/media/jvitorfernandes/FABIO/icones/i11.png"));
		label_52.setBounds(507, 184, 148, 160);
		telaEditarMedicamento.add(label_52);
		
		tfNMateriais = new JTextField();
		tfNMateriais.setColumns(10);
		tfNMateriais.setBounds(30, 77, 272, 19);
		telaEditarHigiene.add(tfNMateriais);
		
		JLabel label_32 = new JLabel("Materiais");
		label_32.setBounds(30, 50, 70, 15);
		telaEditarHigiene.add(label_32);
		
		JLabel label_33 = new JLabel("Métodos");
		label_33.setBounds(368, 50, 70, 15);
		telaEditarHigiene.add(label_33);
		
		tfNMetodos = new JTextField();
		tfNMetodos.setColumns(10);
		tfNMetodos.setBounds(368, 77, 272, 19);
		telaEditarHigiene.add(tfNMetodos);
		
		tfNStatusHigiene = new JTextField();
		tfNStatusHigiene.setColumns(10);
		tfNStatusHigiene.setBounds(368, 135, 146, 19);
		telaEditarHigiene.add(tfNStatusHigiene);
		
		JLabel label_34 = new JLabel("Status");
		label_34.setBounds(368, 108, 70, 15);
		telaEditarHigiene.add(label_34);
		
		JLabel label_35 = new JLabel("Data");
		label_35.setBounds(526, 108, 70, 15);
		telaEditarHigiene.add(label_35);
		
		tfNDataHigiene = new JTextField();
		tfNDataHigiene.setColumns(10);
		tfNDataHigiene.setBounds(526, 135, 114, 19);
		telaEditarHigiene.add(tfNDataHigiene);
		
		tfNDescricaoHigiene = new JTextField();
		tfNDescricaoHigiene.setColumns(10);
		tfNDescricaoHigiene.setBounds(30, 193, 484, 19);
		telaEditarHigiene.add(tfNDescricaoHigiene);
		
		JLabel label_36 = new JLabel("Descrição");
		label_36.setBounds(30, 166, 70, 15);
		telaEditarHigiene.add(label_36);
		
		tfNCuidados = new JTextField();
		tfNCuidados.setColumns(10);
		tfNCuidados.setBounds(30, 135, 272, 19);
		telaEditarHigiene.add(tfNCuidados);
		
		JLabel label_37 = new JLabel("Cuidados");
		label_37.setBounds(30, 108, 70, 15);
		telaEditarHigiene.add(label_37);
		
		JButton button_6 = new JButton("Salvar");
		button_6.setIcon(new ImageIcon("icons/i8.png"));
		button_6.setBorderPainted(false);
		button_6.setBackground(new Color(0,0,0,0));
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int n = escolha-1;
				int i = Integer.parseInt(tfEscolhaTarefa.getText());
				i=i-1;
				
				((Higiene)controle.getListaAnimais().get(n).getListaTarefas().get(i)).setMateriais(tfNMateriais.getText());
				((Higiene)controle.getListaAnimais().get(n).getListaTarefas().get(i)).setMetodos(tfNMetodos.getText());
				((Higiene)controle.getListaAnimais().get(n).getListaTarefas().get(i)).setCuidados(tfNCuidados.getText());
				((Higiene)controle.getListaAnimais().get(n).getListaTarefas().get(i)).setData(tfNDataHigiene.getText());
				((Higiene)controle.getListaAnimais().get(n).getListaTarefas().get(i)).setStatus(tfNStatusHigiene.getText());
				((Higiene)controle.getListaAnimais().get(n).getListaTarefas().get(i)).setDescricao(tfNDescricaoHigiene.getText());
				
				
				telaEditarHigiene.setVisible(false);
				telaListaTarefas.setVisible(true);
				
				textArea_1.setText("");
				controle.listarTarerefas(textArea_1, escolha);
				
			}
		});
		button_6.setBounds(368, 273, 248, 100);
		telaEditarHigiene.add(button_6);
		
		JLabel lblEditarTarefaHiginica = new JLabel("Editar Tarefa de Higiene");
		lblEditarTarefaHiginica.setBounds(48, 12, 216, 15);
		telaEditarHigiene.add(lblEditarTarefaHiginica);
		
		JLabel lblNewLabel_27 = new JLabel("");
		lblNewLabel_27.setIcon(new ImageIcon("icons/i10.png"));
		lblNewLabel_27.setBounds(174, 255, 177, 118);
		telaEditarHigiene.add(lblNewLabel_27);
		
		JLabel label_43 = new JLabel("");
		label_43.setIcon(new ImageIcon("icons/i10.png"));
		label_43.setBounds(30, 255, 177, 118);
		telaEditarHigiene.add(label_43);
		
		tfNNomeTarefa = new JTextField();
		tfNNomeTarefa.setColumns(10);
		tfNNomeTarefa.setBounds(45, 120, 302, 19);
		telaEditarOutra.add(tfNNomeTarefa);
		
		JLabel label_38 = new JLabel("Nome");
		label_38.setBounds(45, 93, 70, 15);
		telaEditarOutra.add(label_38);
		
		JLabel lblEditarTarefa = new JLabel("Editar Tarefa");
		lblEditarTarefa.setBounds(169, 55, 131, 15);
		telaEditarOutra.add(lblEditarTarefa);
		
		JLabel label_40 = new JLabel("Data");
		label_40.setBounds(202, 151, 70, 15);
		telaEditarOutra.add(label_40);
		
		tfNDataTarefa = new JTextField();
		tfNDataTarefa.setColumns(10);
		tfNDataTarefa.setBounds(202, 178, 114, 19);
		telaEditarOutra.add(tfNDataTarefa);
		
		tfNStatusTarefa = new JTextField();
		tfNStatusTarefa.setColumns(10);
		tfNStatusTarefa.setBounds(45, 178, 114, 19);
		telaEditarOutra.add(tfNStatusTarefa);
		
		JLabel label_41 = new JLabel("Status");
		label_41.setBounds(45, 151, 70, 15);
		telaEditarOutra.add(label_41);
		
		JLabel label_42 = new JLabel("Descricao");
		label_42.setBounds(45, 209, 70, 15);
		telaEditarOutra.add(label_42);
		
		tfNDescricaoTarefa = new JTextField();
		tfNDescricaoTarefa.setColumns(10);
		tfNDescricaoTarefa.setBounds(45, 236, 302, 19);
		telaEditarOutra.add(tfNDescricaoTarefa);
		
		JButton btnSalvat = new JButton("Salvar");
		btnSalvat.setIcon(new ImageIcon("icons/i8.png"));
		btnSalvat.setBorderPainted(false);
		btnSalvat.setBackground(new Color(0,0,0,0));
		btnSalvat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				

				int n = escolha-1;
				int i = Integer.parseInt(tfEscolhaTarefa.getText());
				i=i-1;
				
				controle.getListaAnimais().get(n).listaTarefas.get(i).setNome(tfNNomeTarefa.getText());
				controle.getListaAnimais().get(n).listaTarefas.get(i).setStatus(tfNStatusTarefa.getText());
				controle.getListaAnimais().get(n).listaTarefas.get(i).setData(tfNDataTarefa.getText());
				controle.getListaAnimais().get(n).listaTarefas.get(i).setDescricao(tfNDescricaoTarefa.getText());
				
				telaEditarOutra.setVisible(false);
				telaListaTarefas.setVisible(true);
				
				textArea_1.setText("");
				controle.listarTarerefas(textArea_1, escolha);
				
			}
		});
		btnSalvat.setBounds(107, 296, 240, 101);
		telaEditarOutra.add(btnSalvat);
		
		JLabel lblNewLabel_28 = new JLabel("");
		lblNewLabel_28.setIcon(new ImageIcon("icons/i6.png"));
		lblNewLabel_28.setBounds(365, 83, 151, 102);
		telaEditarOutra.add(lblNewLabel_28);
		
		JLabel label_44 = new JLabel("");
		label_44.setIcon(new ImageIcon("icons/i6.png"));
		label_44.setBounds(473, 83, 151, 102);
		telaEditarOutra.add(label_44);
		
		JLabel label_45 = new JLabel("");
		label_45.setIcon(new ImageIcon("icons/i6.png"));
		label_45.setBounds(365, 197, 151, 102);
		telaEditarOutra.add(label_45);
		
		JLabel label_46 = new JLabel("");
		label_46.setIcon(new ImageIcon("icons/i6.png"));
		label_46.setBounds(473, 197, 151, 102);
		telaEditarOutra.add(label_46);
				
		

	}
}
