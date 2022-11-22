package WalletHotline.les.Repository;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.stereotype.Repository;

@Repository
public class CustomCompraProdutoRepository {
	private final EntityManager em;

	public CustomCompraProdutoRepository(EntityManager em) {
		this.em = em;
	}

	public Object graphProduto(Integer id, String dataInicial, String dataFinal) {
		// .setParameter("id", id).getResultList();
		var q = em.createNativeQuery(
				"select sum(compras_produtos.quantidade), compras.data_comp from compras_produtos join compras ON compras.id = compras_produtos.compra_id where DATE(data_comp)>= :dataInicial and DATE(data_comp)<= :dataFinal and produtoid = :id group by data_comp, produtoid order by data_comp asc;");
		q.setParameter("dataInicial", dataInicial);
		q.setParameter("dataFinal", dataFinal);
		q.setParameter("id", id);
		return q.getResultList();
	}

	public List graphData(String dataInicial, String dataFinal) {
		// .setParameter("id", id).getResultList();
		var q = em.createNativeQuery(
				"select compras.data_comp from compras_produtos join compras ON compras.id = compras_produtos.compra_id where DATE(data_comp)>= :dataInicial and DATE(data_comp)<= :dataFinal group by data_comp order by data_comp asc;");
		q.setParameter("dataInicial", dataInicial);
		q.setParameter("dataFinal", dataFinal);

		return q.getResultList();
	}
}
