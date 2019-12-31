package com.grizzly.repositories;

import com.grizzly.pojo.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TestRepository extends JpaRepository <Admin,Integer> {
    Admin findByAid(Integer aid);
}
