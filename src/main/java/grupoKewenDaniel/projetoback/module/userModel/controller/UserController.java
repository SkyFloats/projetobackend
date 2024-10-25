package grupoKewenDaniel.projetoback.module.userModel.controller;

import grupoKewenDaniel.projetoback.module.userModel.entity.UserModel;
import grupoKewenDaniel.projetoback.module.userModel.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v3/users")
public class UserController {

    private final UserService uServ;


    @GetMapping("/todos")
    public ResponseEntity<List<UserModel>> retornaTodos(UserModel user){
        return ResponseEntity.status(HttpStatus.OK).body(uServ.getAll());
    }

    @GetMapping("/encontrar/{id}")
    public ResponseEntity<UserModel> encontrarUsuarioPeloId(@PathVariable UUID id){
        UserModel usuarioEncontrado = uServ.findUserWithId(id);
        return ResponseEntity.status(HttpStatus.OK).body(usuarioEncontrado);
    }

    @PostMapping("/salvar")
    public ResponseEntity<UserModel> salva(@RequestBody UserModel user){
        UserModel users = uServ.create(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(users);
    }
}
