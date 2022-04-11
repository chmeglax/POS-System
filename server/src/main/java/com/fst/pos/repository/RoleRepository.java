package com.fst.pos.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.fst.pos.models.ERole;
import com.fst.pos.models.Role;

public interface RoleRepository extends MongoRepository<Role, String> {
  Optional<Role> findByName(ERole name);
}
