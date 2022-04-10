package WalletHotline.les.Repository;

import WalletHotline.les.Model.CupomModel;
import org.springframework.data.repository.CrudRepository;

public interface CupomRepository extends CrudRepository<CupomModel, Integer> {

        Iterable<CupomModel> findByClienteId(Integer cliente_id);
}
