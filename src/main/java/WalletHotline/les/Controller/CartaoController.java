package WalletHotline.les.Controller;

import WalletHotline.les.Model.CartaoModel;
import WalletHotline.les.Repository.CartaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class CartaoController {

        @Autowired
        private CartaoRepository repository;

        @GetMapping(path = "/api/cartoes/clienteid/{id}")
        @CrossOrigin(origins = "http://192.168.1.19:8080")
        public Iterable<CartaoModel> cliente_id(@PathVariable("id") Integer cliente_id) {
                return repository.findByClienteId(cliente_id);
        }
}
