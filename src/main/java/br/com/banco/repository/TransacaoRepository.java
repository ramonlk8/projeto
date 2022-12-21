package br.com.banco.repository;

import br.com.banco.model.Transacao;
import br.com.banco.util.Criteria;
import br.com.banco.util.Filtro;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Repository
public class TransacaoRepository {

    @PersistenceContext
    private EntityManager entityManager;


    public List<Transacao> getTransactions(Filtro filtro) {

        String sql = Criteria.createFilter(filtro);
        Query query = entityManager.createNativeQuery(sql);
        if(filtro.getNomeOperador() != null) {
            query.setParameter("nomeOperador", filtro.getNomeOperador());
        }
        if (filtro.getIdConta() != null) {
            query.setParameter("contaId", filtro.getIdConta());
        }
        if (filtro.getDataFim() != null) {
            query.setParameter("dataInicio", filtro.getDataInicio());
            query.setParameter("dataFim", filtro.getDataFim());
        }

        return query.getResultList();
    }
}
