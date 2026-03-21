package com.github.lucasbschuck.application;

import com.github.lucasbschuck.model.Smartphone;
import com.github.lucasbschuck.repository.SmartphoneRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class GetSmartphoneByEmail {
    SmartphoneRepository smartphoneRepository;

    public Smartphone execute(String email) {
        return smartphoneRepository.getSmartphoneByEmail(email);
    }
}


