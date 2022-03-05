package WalletHotline.les.Repository;

import WalletHotline.les.Model.ClienteModel;
import org.springframework.data.repository.CrudRepository;

public interface ClienteRepository extends CrudRepository<ClienteModel, Integer> {

    Iterable<ClienteModel> findByEmailAndSenha(String email, String senha);
}
