package com.abn.service;

import com.abn.entity.Role;
import com.abn.enums.RoleType;

import java.util.Optional;

public interface RoleService {
    Optional<Role> findByName(RoleType roleName);
}
