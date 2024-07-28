package com.dev.userDept.repositoryes;

import com.dev.userDept.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRespository extends JpaRepository<User,Long> {
}
