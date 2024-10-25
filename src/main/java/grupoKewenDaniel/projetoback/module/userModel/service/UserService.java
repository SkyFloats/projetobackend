package grupoKewenDaniel.projetoback.module.userModel.service;

import grupoKewenDaniel.projetoback.module.userModel.entity.UserModel;
import grupoKewenDaniel.projetoback.module.userModel.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository uRepo;

    public List<UserModel> getAll(){
        return uRepo.findAll();
    }

    public UserModel create(UserModel user){
        return uRepo.save(user);
    }

    public UserModel findUserWithId(UUID id){
        return uRepo.findById(id).get();
    }
}
