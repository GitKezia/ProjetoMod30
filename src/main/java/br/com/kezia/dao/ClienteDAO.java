package br.com.kezia.dao;

import br.com.kezia.dao.generic.GenericDAO;
import br.com.kezia.domain.Cliente;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ClienteDAO extends GenericDAO<Cliente, Long> implements IClienteDAO {

    public ClienteDAO() {
        super();
    }

    @Override
    public Class<Cliente> getTipoClasse() {
        return Cliente.class;
    }

    @Override
    public void atualiarDados(Cliente entity, Cliente entityCadastrado) {
        entityCadastrado.setCidade(entity.getCidade());
        entityCadastrado.setCpf(entity.getCpf());
        entityCadastrado.setEnd(entity.getEnd());
        entityCadastrado.setEstado(entity.getEstado());
        entityCadastrado.setNome(entity.getNome());
        entityCadastrado.setNumero(entity.getNumero());
        entityCadastrado.setTel(entity.getTel());
        entityCadastrado.setCep(entity.getCep());

    }

    @Override
    public String getQueryInsercao() {
        StringBuilder sb = new StringBuilder();
        sb.append("INSERT INTO TB_CLIENTE ");
        sb.append("(ID, NOME, CPF, TEL, ENDERECO, NUMERO, CIDADE, ESTADO, CEP)");
        sb.append("VALUES (nextval('sq_cliente'),?,?,?,?,?,?,?,?,?)");
        return sb.toString();
    }

    @Override
    public void setParametrosQueryInsercao(PreparedStatement stmInsert, Cliente entity) throws SQLException {
        stmInsert.setString(1, entity.getNome());
        stmInsert.setLong(2, entity.getCpf());
        stmInsert.setLong(3, entity.getTel());
        stmInsert.setString(4, entity.getEnd());
        stmInsert.setLong(5, entity.getNumero());
        stmInsert.setString(6, entity.getCidade());
        stmInsert.setString(7, entity.getEstado());
        stmInsert.setLong(7, entity.getCep());

    }

    @Override
    protected String getQueryExclusao() {
        return "DELETE FROM TB_CLIENTE WHERE CPF = ?";
    }

    @Override
    protected void setParametrosQueryExclusao(PreparedStatement stmExclusao, Long valor) throws SQLException {
        stmExclusao.setLong(1, valor);
    }

    @Override
    public String getQueryAtualizacao() {
        StringBuilder sb = new StringBuilder();
        sb.append("UPDATE TB_CLIENTE ");
        sb.append("SET NOME = ?,");
        sb.append("TEL = ?,");
        sb.append("ENDERECO = ?,");
        sb.append("NUMERO = ?,");
        sb.append("CIDADE = ?,");
        sb.append("ESTADO = ?");
        sb.append(" WHERE CPF = ?");
        sb.append("CEP = ?");
        return sb.toString();
    }

    @Override
    public void setParametrosQueryAtualizacao(PreparedStatement stmUpdate, Cliente entity) throws SQLException {
        stmUpdate.setString(1, entity.getNome());
        stmUpdate.setLong(2, entity.getTel());
        stmUpdate.setString(3, entity.getEnd());
        stmUpdate.setLong(4, entity.getNumero());
        stmUpdate.setString(5, entity.getCidade());
        stmUpdate.setString(6, entity.getEstado());
        stmUpdate.setLong(7, entity.getCpf());
        stmUpdate.setLong(7, entity.getCep());
    }

    @Override
    public void setParametrosQuerySelect(PreparedStatement stmSelect, Long valor) throws SQLException {
        stmSelect.setLong(1, valor);
    }

}