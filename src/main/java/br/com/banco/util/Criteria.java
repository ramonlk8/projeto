package br.com.banco.util;

public class Criteria {

    public static String createFilter(Filtro filtro) {

        StringBuilder sql = new StringBuilder();
        sql.append("SELECT * FROM transferencia WHERE 1=1");
        if(filtro.getNomeOperador() != null) {
            sql.append(" AND nome_operador_transacao = :nomeOperador");
        }
        if (filtro.getIdConta() != null) {
            sql.append(" AND conta_id = :contaId");
        }
        if (filtro.getDataFim() != null) {
            sql.append(" AND BETWEEN date_format(str_to_date(':dataInicio', '%d/%m/%Y'), '%d/%m/%Y') AND date_format(str_to_date(':dataFim', '%d/%m/%Y'), '%d/%m/%Y')");
        }

        return sql.toString();
    }


}
