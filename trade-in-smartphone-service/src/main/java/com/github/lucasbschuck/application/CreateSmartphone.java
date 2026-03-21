package com.github.lucasbschuck.application;

import com.github.lucasbschuck.model.Smartphone;
import com.github.lucasbschuck.repository.SmartphoneRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class CreateSmartphone {

    private SmartphoneRepository smartphoneRepository;

    public void execute(Smartphone smartphone) throws IllegalArgumentException{

        if(smartphone.getModel() == null || smartphone.getEmail() == null || smartphone.getTradeInValue() == null){
            throw new IllegalArgumentException("Field Can Not Be Null");
        }
        smartphoneRepository.save(smartphone);
    }
}
