package grupoKewenDaniel.projetoback.module.userModel.repository;

import grupoKewenDaniel.projetoback.module.userModel.entity.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface UserRepository extends JpaRepository<UserModel, UUID> {



}
