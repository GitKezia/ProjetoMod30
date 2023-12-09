package br.com.kezia.dao;

import br.com.kezia.domain.Produto;
import br.com.kezia.exceptions.TipoChaveNaoEncontradaException;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Collection;

public class ProdutoDaoMock implements IProdutoDAO {

    @Override
    public Boolean cadastrar(Produto entity) throws TipoChaveNaoEncontradaException {
        // TODO Auto-generated method stub
        return true;
    }

    @Override
    public void excluir(String valor) {
        // TODO Auto-generated method stub

    }

    @Override
    public void alterar(Produto entity) throws TipoChaveNaoEncontradaException {
        // TODO Auto-generated method stub

    }

    @Override
    public Produto consultar(String valor) {
        Produto produto = new Produto();
        produto.setCodigo(valor);
        return produto;
    }

    @Override
    public Collection<Produto> buscarTodos() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Class<Produto> getTipoClasse() {
        return null;
    }

    @Override
    public void atualiarDados(Produto entity, Produto entityCadastrado) {

    }

    @Override
    public String getQueryInsercao() {
        return null;
    }

    @Override
    public void setParametrosQueryInsercao(PreparedStatement stmInsert, Produto entity) throws SQLException {

    }

    @Override
    public String getQueryExclusao() {
        return null;
    }

    @Override
    public void setParametrosQueryExclusao(PreparedStatement stmExclusao, String valor) throws SQLException {

    }

    @Override
    public String getQueryAtualizacao() {
        return null;
    }

    @Override
    public void setParametrosQueryAtualizacao(PreparedStatement stmUpdate, Produto entity) throws SQLException {

    }

    @Override
    public void setParametrosQuerySelect(PreparedStatement stmExclusao, String valor) throws SQLException {

    }
}