package WalletHotline.les.Repository;

import WalletHotline.les.Model.CartaoModel;
import org.springframework.data.repository.CrudRepository;

public interface CartaoRepository extends CrudRepository<CartaoModel, Integer> {

        Iterable<CartaoModel> findByClienteId(Integer cliente_id);
}
