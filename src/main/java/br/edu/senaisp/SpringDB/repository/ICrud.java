package br.edu.senaisp.SpringDB.repository;

import java.util.List;

import br.edu.senaisp.SpringDB.model.Banda;

public interface ICrud {
	public List<Banda> lista();
	
	public Banda buscaPorId(int id);
	
	public int altera(Banda banda, int id);
	
	public int insere(Banda banda);
	
	public boolean exclui(int id);
	
	
	
}
