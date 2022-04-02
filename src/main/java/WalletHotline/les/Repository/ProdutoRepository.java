package WalletHotline.les.Repository;

import WalletHotline.les.Model.ProdutoModel;
import org.springframework.data.repository.CrudRepository;

public interface ProdutoRepository extends CrudRepository<ProdutoModel, Integer> {
        Iterable<ProdutoModel> findByTipo(String tipo);
}
