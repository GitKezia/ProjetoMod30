package br.com.kezia.dao;

import br.com.kezia.dao.generic.IGenericDAO;
import br.com.kezia.domain.Cliente;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public interface IClienteDAO extends IGenericDAO<Cliente, Long> {


    Class<Cliente> getTipoClasse();

    void atualiarDados(Cliente entity, Cliente entityCadastrado);

    String getQueryInsercao();

    void setParametrosQueryInsercao(PreparedStatement stmInsert, Cliente entity) throws SQLException;

    String getQueryAtualizacao();

    void setParametrosQueryAtualizacao(PreparedStatement stmUpdate, Cliente entity) throws SQLException;

    void setParametrosQuerySelect(PreparedStatement stmSelect, Long valor) throws SQLException;
}
