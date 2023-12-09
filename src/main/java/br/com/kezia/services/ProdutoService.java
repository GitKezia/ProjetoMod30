package br.com.kezia.services;

import br.com.kezia.dao.IProdutoDAO;
import br.com.kezia.domain.Produto;
import br.com.kezia.services.generic.GenericService;

public class ProdutoService extends GenericService<Produto, String> implements IProdutoService {

    public ProdutoService(IProdutoDAO dao) {
        super(dao);
    }

}