package WalletHotline.les.Controller;

import WalletHotline.les.Model.ClienteModel;
import WalletHotline.les.Repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ClienteController {

    @Autowired
    private ClienteRepository repository;

    //read
    @GetMapping(path = "/api/cliente/{id}")
    public ResponseEntity consultar(@PathVariable("id") Integer id){
        return repository.findById(id).map(record -> ResponseEntity.ok().body(record)).orElseThrow();
    }

    //create/update
    @PostMapping(path = "/api/cliente")//salva e atualiza caso tenha um id
    public ClienteModel salvar(@RequestBody ClienteModel cliente){
        return repository.save(cliente);
    }

    //get
    @GetMapping(path = "/api/cliente")
    public Iterable<ClienteModel> consultarTodos(){
        return repository.findAll();
    }

    //delete
    @DeleteMapping(path = "/api/cliente/{id}")
    public void deletar(@PathVariable("id") Integer id){ repository.deleteById(id);}
}
