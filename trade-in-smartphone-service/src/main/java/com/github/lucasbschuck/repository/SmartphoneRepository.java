package com.github.lucasbschuck.repository;

import com.github.lucasbschuck.model.Smartphone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface SmartphoneRepository extends JpaRepository<Smartphone, UUID> {

    List<Smartphone> findSmartphoneByEmail(String email);
}