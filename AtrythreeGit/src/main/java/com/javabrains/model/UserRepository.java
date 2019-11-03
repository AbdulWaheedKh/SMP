package com.javabrains.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
    

// ceo is the Entity and long is the PK type

public interface UserRepository extends JpaRepository <ceo ,Long> {

}
