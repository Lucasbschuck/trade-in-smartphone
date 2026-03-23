package com.github.lucasbschuck.application;

import com.github.lucasbschuck.model.Smartphone;
import com.github.lucasbschuck.repository.SmartphoneRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class GetSmarphoneByEmailPerformance {
    SmartphoneRepository smartphoneRepository;

    public Page<List<Smartphone>> execute(String email, Pageable Pageable){
        return smartphoneRepository.findAllByEmail(email, Pageable);
    }
}
