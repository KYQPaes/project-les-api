package WalletHotline.les.Repository;

import WalletHotline.les.Model.EnderecoModel;
import org.springframework.data.repository.CrudRepository;

public interface EnderecoRepository extends CrudRepository<EnderecoModel, Integer> {

    Iterable<EnderecoModel> findByClienteId(Integer cliente_id);

}
