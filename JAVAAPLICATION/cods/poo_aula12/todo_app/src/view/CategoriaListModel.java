package view;

import java.util.ArrayList;
import java.util.List;

import javax.swing.AbstractListModel;

import model.Categoria;

public class CategoriaListModel extends AbstractListModel<Categoria> {
	
	private List<Categoria> categorias = new ArrayList<>();
	
	public CategoriaListModel(List<Categoria> categorias) {
		this.categorias = categorias;
	}
	
	
	


	@Override
	public int getSize() {		
		return categorias.size();
	}

	@Override
	public Categoria getElementAt(int index) {
		
		Categoria categoria = null;
		
		if(index >=0 && index < getSize()) {
			categoria = categorias.get(index);
		}
		return categoria;
	}
	
	public void carregar (List<Categoria> categorias) {
		this.categorias = categorias;
		fireContentsChanged(this, 0, getSize());
	}
	
	public void remover(Categoria categoria) {
		int index = categorias.indexOf(categoria);
		
		if(index >=0) {
			categorias.remove(index);
			fireIntervalRemoved(this, index, index);
		}
	}
	
	public void inserir(Categoria categoria) {
		categorias.add(categoria);
		fireIntervalAdded(this, getSize()-1, getSize()-1);
	}
	
	public List<Categoria> getCategorias(){
		return categorias;
	}

}//fim da classe
