package view;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

import model.Tarefa;

public class TarefaTableModel extends AbstractTableModel {

	private List<Tarefa> tarefas = new ArrayList<>();
	private String [] colunas = new String [] {"Id", "Título", "Descrição"};
	
	public TarefaTableModel( List<Tarefa> tarefas) {
		this.tarefas = tarefas;
	}

	@Override
	public int getRowCount() {
		return tarefas.size(); //retorna o número de linhas
	}
	@Override
	public int getColumnCount() {		
		return colunas.length; //retorna o número de colunas
	}
	@Override
	public String getColumnName(int column) {
		String columnName = null;
		if(column >= 0 && column < colunas.length) {
			columnName = colunas[column];
		}
		return columnName;
	}
	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		String value = null;
		
		if(rowIndex >= 0 && rowIndex < tarefas.size()) {
			Tarefa tarefa = tarefas.get(rowIndex);
			switch (columnIndex) {
			case 0:
				value = Integer.toString(tarefa.getId());
				break;
			case 1:		
				value = tarefa.getNome();
				break;
			case 2:	
				value = tarefa.getDescricao();
				break;

			default:
				System.err.printf("[ERRO] Índice inválido: %d\n", rowIndex);
			}
		}
		return value;
	}

	public void carregar(List<Tarefa> tarefas) {
		this.tarefas = tarefas;
		fireTableDataChanged(); // avisa que mudou os dados e recarrega a tabela
	}
	public Tarefa getTarefa(int rowIndex) {
		Tarefa tarefa = null;
		
		if(rowIndex>=0 && rowIndex < tarefas.size()) {
			tarefa = tarefas.get(rowIndex);
		}
		
		return tarefa;
	}
	
	public void remover (Tarefa tarefa) {
		tarefas.remove(tarefa);
		fireTableDataChanged();
	}
	
}//fim da classe
