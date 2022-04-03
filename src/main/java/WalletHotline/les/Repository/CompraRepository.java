package WalletHotline.les.Repository;

import WalletHotline.les.Model.CompraModel;
import org.springframework.data.repository.CrudRepository;

public interface CompraRepository extends CrudRepository<CompraModel, Integer> {

        Iterable<CompraModel> findByClienteId(Integer clienteId);
}
