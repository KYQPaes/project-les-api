package WalletHotline.les.Controller;

import WalletHotline.les.Model.EnderecoModel;
import WalletHotline.les.Repository.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class EnderecoController {

    @Autowired
    private EnderecoRepository repository;

    // read
    // @GetMapping(path = "/api/enderecos/{id}")
    // @CrossOrigin(origins = "http://192.168.1.19:8080")
    // public ResponseEntity consultar(@PathVariable("id") Integer id) {
    // return repository.findById(id).map(record ->
    // ResponseEntity.ok().body(record)).orElseThrow();
    // }

    @GetMapping(path = "/api/enderecos/clienteid/{id}")
    @CrossOrigin(origins = "http://192.168.1.19:8080")
    public Iterable<EnderecoModel> endereco_cliente_id(@PathVariable("id") Integer cliente_id) {
        return repository.findByClienteId(cliente_id);
    }

    // create/update
    // @PostMapping(path = "/api/enderecos") // salva e atualiza caso tenha um id
    // @CrossOrigin(origins = "http://192.168.1.19:8080")
    // public EnderecoModel salvar(@RequestBody EnderecoModel endereco) {
    // return repository.save(endereco);
    // }

    // get
    // @GetMapping(path = "/api/enderecos")
    // @CrossOrigin(origins = "http://192.168.1.19:8080")
    // public Iterable<EnderecoModel> consultarTodos() {
    // return repository.findAll();
    // }

    // delete
    // @DeleteMapping(path = "/api/enderecos/{id}")
    // @CrossOrigin(origins = "http://192.168.1.19:8080")
    // public void deletar(@PathVariable("id") Integer id) {
    // repository.deleteById(id);
    // }
}