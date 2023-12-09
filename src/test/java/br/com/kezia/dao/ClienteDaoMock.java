package br.com.kezia.dao;

import br.com.kezia.domain.Cliente;
import br.com.kezia.exceptions.TipoChaveNaoEncontradaException;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Collection;

public class ClienteDaoMock implements IClienteDAO {

    @Override
    public Boolean cadastrar(Cliente entity) throws TipoChaveNaoEncontradaException {
        // TODO Auto-generated method stub
        return true;
    }

    @Override
    public void excluir(Long valor) {
        // TODO Auto-generated method stub

    }

    @Override
    public void alterar(Cliente entity) throws TipoChaveNaoEncontradaException {
        // TODO Auto-generated method stub

    }

    @Override
    public Cliente consultar(Long valor) {
        Cliente cliente = new Cliente();
        cliente.setCpf(valor);
        return cliente;
    }

    @Override
    public Collection<Cliente> buscarTodos() {

        return null;
    }

    @Override
    public Class<Cliente> getTipoClasse() {
        return null;
    }

    @Override
    public void atualiarDados(Cliente entity, Cliente entityCadastrado) {

    }

    @Override
    public String getQueryInsercao() {
        return null;
    }

    @Override
    public void setParametrosQueryInsercao(PreparedStatement stmInsert, Cliente entity) throws SQLException {

    }

    @Override
    public String getQueryAtualizacao() {
        return null;
    }

    @Override
    public void setParametrosQueryAtualizacao(PreparedStatement stmUpdate, Cliente entity) throws SQLException {

    }

    @Override
    public void setParametrosQuerySelect(PreparedStatement stmSelect, Long valor) throws SQLException {

    }
}