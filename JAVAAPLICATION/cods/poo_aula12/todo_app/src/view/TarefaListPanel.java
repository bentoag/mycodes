package view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import model.DataBase;
import model.Tarefa;

public class TarefaListPanel extends JPanel {
	private JButton novaTarefa;
	private JButton editar;
	private JButton remover;
	private JTable tabela;
	private TarefaTableModel tabelaModelo;
	
	private AppFrame appFrame;
	
	public TarefaListPanel(AppFrame appFrame) {
		
		this.appFrame = appFrame;		
		
		//tamanho inicial do layout para exibir tela tarefa lista
		setLayout(new BorderLayout(10,10)); 
		criarBotoes(); 
		criarTabela();
	}
	
	//cria o panel para exibir os botões alinhados acima e a direita
	private void criarBotoes() {
		JPanel panel = new JPanel();
		FlowLayout layout = (FlowLayout) panel.getLayout();
		layout.setAlignment(FlowLayout.RIGHT); //alinhar a direita
		
		novaTarefa = new JButton("Criar Tarefa");
		
			//ação para para chamar o formulário das tarefas
			novaTarefa.addActionListener(new ActionListener() {			
				@Override
				public void actionPerformed(ActionEvent e) {
					appFrame.mostrarFromTarefas(null);				
				}
			});
		
		panel.add(novaTarefa);
		
		editar = new JButton("Editar");
		
			editar.addActionListener(new ActionListener() {			
				@Override
				public void actionPerformed(ActionEvent e) {
					Tarefa tarefa = tabelaModelo.getTarefa(tabela.getSelectedRow());
					appFrame.mostrarFromTarefas(tarefa);				
				}
			});
			
		panel.add(editar);		
		
		remover = new JButton("Remover");	
		remover.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				Tarefa tarefa = tabelaModelo.getTarefa(tabela.getSelectedRow());
				int resposta = JOptionPane.showConfirmDialog(TarefaListPanel.this, "Deseja realmente remover?", AppFrame.TITULO, 	
								JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
				if(resposta == JOptionPane.YES_OPTION) {
					DataBase.remover(tarefa);
					tabelaModelo.remover(tarefa);
				}		
			}
		});		
				
		panel.add(remover);		
		add(panel, BorderLayout.NORTH); //criar o painel em cima
		
		desabilitarBotoes();
	}
	
	//cria o panel da tabela centralizado ocupando toda a janela
	private void criarTabela() {
		//preencher a tabela com os arquivos do "BD"
		tabelaModelo = new TarefaTableModel(DataBase.listar());
		//criei a tabela com o modelo da minha tabela
		tabela = new JTable(tabelaModelo);
		
		//permite selecionar uma linha da tabela
		tabela.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		tabela.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
			
			@Override
			public void valueChanged(ListSelectionEvent e) {
				if(!e.getValueIsAdjusting()) {
					if(tabela.getSelectedRow() >= 0) {
						habilitaBotoes();
					}else {
						desabilitarBotoes();
					}
				}
				
			}
		});
		
		JScrollPane scrollPane = new JScrollPane(tabela);
		add(scrollPane, BorderLayout.CENTER);		
	}
	
	private void desabilitarBotoes() {
		editar.setEnabled(false);
		remover.setEnabled(false);
	}
	
	private void habilitaBotoes() {
		editar.setEnabled(true);
		remover.setEnabled(true);
	}
	public void recarregar() {
		tabelaModelo.carregar(DataBase.listar());
	}	
}//fim da classe tarefaListPanel
