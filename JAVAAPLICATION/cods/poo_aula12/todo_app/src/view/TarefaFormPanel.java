package view;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.xml.crypto.Data;

import model.Categoria;
import model.CategoriaBD;
import model.DataBase;
import model.Tarefa;

public class TarefaFormPanel extends JPanel {
	//espa�amento entre os componentes (top, left, bottom, right)
	private static final Insets FIELD_INSETS = new Insets(5, 10, 0, 0);
	private static final int LIST_VISIBLE_ROWS = 3;
	
	private JList<Categoria> naoselecionadoList;
	private JList<Categoria> selecionadoList;
	private CategoriaListModel naoselecionadoModel;
	private CategoriaListModel selecionadoModel;
	
	
	private AppFrame frame;
	private GridBagLayout layout;
	private GridBagConstraints constraints;
	
	private JTextField id;
	private JTextField nomeTarefa;
	private JTextArea descricao;
	private JButton salvar;
	private JButton cancelar;
	
	private Tarefa tarefa;
	
	public TarefaFormPanel(AppFrame appFrame) {
		
		this.frame = appFrame;		
		layout = new GridBagLayout();
		constraints = new GridBagConstraints();
		tarefa =  null;
		
		setLayout(layout);
			//limpar os campos do formulario a cada novo evento
			addComponentListener(new ComponentAdapter() {
				@Override
				public void componentShown(ComponentEvent e) {
					if(tarefa == null) {
						id.setText("");
						nomeTarefa.setText("");
						descricao.setText("");
						naoselecionadoModel.carregar(CategoriaBD.listar());
						selecionadoModel.carregar(new ArrayList<>());
					}else {
						id.setText(Integer.toString(tarefa.getId()));
						nomeTarefa.setText(tarefa.getNome());
						descricao.setText(tarefa.getDescricao());
						selecionadoModel.carregar(tarefa.getCategorias());
						naoselecionadoModel.carregar(CategoriaBD.listarNaoSelecionado(tarefa.getId()));
					}
					
				}
			});
		criarForm();
	}
	
	public void setTarefa(Tarefa tarefa) {
		this.tarefa = tarefa;
	}
	
	//criar o formulario
	private void criarForm() {
		JLabel rotulo;
		
		rotulo = new JLabel("Id");
		adicionarComponente(rotulo, 0, 0, 1, 1); //ocupa um celula de 1x1
		id = new JTextField(30); //limitar o tamanho do campo
		id.setEditable(false); // esse campo n�o � edit�vel
		adicionarComponente(id, 0, 1, 1, 1);		
		
		rotulo = new JLabel("Nome");
		adicionarComponente(rotulo, 1, 0, 1, 1);
		nomeTarefa =  new JTextField(30);
		nomeTarefa.setDocument(new MaxCharDocument(15)); //estou limitando o campo de texto a 15 caracteres
		adicionarComponente(nomeTarefa, 1, 1, 1, 1);
		
		rotulo = new JLabel("Descri��o");
		adicionarComponente(rotulo, 2, 0, 1, 1);
		descricao = new JTextArea(5, 30);
		descricao.setDocument(new MaxCharDocument(300)); 
		JScrollPane scrollPane = new JScrollPane(descricao);
		adicionarComponente(scrollPane, 2, 1, 1, 5);
		
		criarBotoes();
		criarListaCategorias();
	}
	
	private void criarListaCategorias() {
		JLabel rotulo;
		JPanel panel;
		JScrollPane scroll;
		Dimension scrollPreferredDimension = new Dimension(120,60);
		rotulo = new JLabel("Categorias");
		adicionarComponente(rotulo, 7, 0, 1, 1);
		
		panel = new JPanel();
		FlowLayout flowlayout = (FlowLayout) panel.getLayout();
		flowlayout.setAlignment(FlowLayout.LEFT);
		
		naoselecionadoModel = new CategoriaListModel(CategoriaBD.listar());
		naoselecionadoList = new JList<Categoria>(naoselecionadoModel);
		naoselecionadoList.setVisibleRowCount(LIST_VISIBLE_ROWS);
		naoselecionadoList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		scroll = new JScrollPane(naoselecionadoList);
		scroll.setPreferredSize(scrollPreferredDimension);
		panel.add(scroll);
		
		//mover de lista para a outra (selecionado para n�o selecionado)
		JButton moverBtn = new JButton("Mover");
		moverBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Categoria selecionado;
				
				if(naoselecionadoList.getSelectedIndex() >= 0) {
					selecionado = naoselecionadoList.getSelectedValue();
					selecionadoModel.inserir(selecionado);
					naoselecionadoModel.remover(selecionado);
				}
				
				if(selecionadoList.getSelectedIndex() >= 0) {
					selecionado = selecionadoList.getSelectedValue();
					naoselecionadoModel.inserir(selecionado);
					selecionadoModel.remover(selecionado);
				}
				
			}
		});
		
		panel.add(moverBtn);
		
		selecionadoModel = new CategoriaListModel(new ArrayList<>());
		selecionadoList = new JList<Categoria>(selecionadoModel);
		selecionadoList.setVisibleRowCount(LIST_VISIBLE_ROWS);
		selecionadoList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		scroll = new JScrollPane(selecionadoList);
		scroll.setPreferredSize(scrollPreferredDimension);
		panel.add(scroll);
		
		adicionarComponente(panel, 7, 1, 1, LIST_VISIBLE_ROWS);
		
	}

	private void criarBotoes() {
		JPanel btn = new JPanel();
		FlowLayout flowLayout = (FlowLayout) btn.getLayout();
		flowLayout.setAlignment(FlowLayout.LEFT); //alinha os botoes a esquerda
		
		criarSalvarBtn();
		btn.add(salvar);
		criarCancelarBtn();
		btn.add(cancelar);
		
		adicionarComponente(btn, 10, 1, 2, 1);
	}
		
	private void criarSalvarBtn() {
		salvar = new JButton("Salvar");
		salvar.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				//salvar a tarefa no "banco de dados"
				Tarefa tarefa = new Tarefa();
				tarefa.setNome(nomeTarefa.getText());
				tarefa.setDescricao(descricao.getText());
				tarefa.setCategorias(selecionadoModel.getCategorias());
				
				if(TarefaFormPanel.this.tarefa == null) {
					DataBase.inserir(tarefa);
					JOptionPane.showMessageDialog(TarefaFormPanel.this, "Tarefa criada com sucesso", AppFrame.TITULO, JOptionPane.INFORMATION_MESSAGE);			
				}else {
					tarefa.setId(Integer.parseInt(id.getText()));
					DataBase.atualizar(tarefa);
					JOptionPane.showMessageDialog(TarefaFormPanel.this, "Tarefa atualizada com sucesso", AppFrame.TITULO, JOptionPane.INFORMATION_MESSAGE);			
				}
				frame.mostrarListaTarefas();
				
				
			}
		});
	}
	
	private void criarCancelarBtn() {
		cancelar = new JButton("Cancelar");
		
		//tratar o evento de click
		cancelar.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				frame.mostrarListaTarefas();				
			}
		});
		
	}
	//adicionar qualquer componente na tela
	private void adicionarComponente(JComponent componente, int linha, int coluna, int largura, int altura) {
		constraints.gridx = coluna;
		constraints.gridy = linha;
		constraints.gridwidth = largura;
		constraints.gridheight = altura;
		
		constraints.fill = GridBagConstraints.HORIZONTAL;
		constraints.insets = FIELD_INSETS;
		
		layout.setConstraints(componente, constraints);
		add(componente);
	}
}//fim classe TarefaFormPanel
