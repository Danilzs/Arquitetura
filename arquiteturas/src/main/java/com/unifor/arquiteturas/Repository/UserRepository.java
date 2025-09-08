package com.unifor.arquiteturas.Repository;

import com.unifor.arquiteturas.Model.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, long> {

}
