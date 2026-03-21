package com.github.lucasbschuck.application;

import com.github.lucasbschuck.model.Smartphone;
import com.github.lucasbschuck.repository.SmartphoneRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class GetSmartphoneByEmail {
    SmartphoneRepository smartphoneRepository;
    List<Smartphone> list;
    public List<Smartphone> execute(String email) {
        list = (smartphoneRepository.findSmartphoneByEmail(email));
        return list;


    }
}


