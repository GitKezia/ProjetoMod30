package br.com.kezia.dao;

import br.com.kezia.dao.generic.IGenericDAO;
import br.com.kezia.domain.Venda;
import br.com.kezia.exceptions.DAOException;
import br.com.kezia.exceptions.TipoChaveNaoEncontradaException;

public interface IVendaDAO extends IGenericDAO<Venda, String> {

    <SQLException> void finalizarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;

    public void cancelarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;
}