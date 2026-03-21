package com.github.lucasbschuck.controller;

import com.github.lucasbschuck.application.CreateSmartphone;
import com.github.lucasbschuck.application.GetSmartphoneByEmail;
import com.github.lucasbschuck.model.Smartphone;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/tradein/smartphones")
@RestController
@AllArgsConstructor
public class TradeInSmartphoneController {
    private final CreateSmartphone createSmartphone;
    private final GetSmartphoneByEmail getSmartphoneByEmail;

    @GetMapping
    public List<Smartphone> get(@RequestParam String email){
        return getSmartphoneByEmail.execute(email);
    }
    @PostMapping
    public ResponseEntity<?> create(@RequestBody Smartphone smartphone) {
        try {
            createSmartphone.execute(smartphone);
            return ResponseEntity.status(HttpStatus.CREATED).body("Smartphone Added");

        } catch (IllegalArgumentException e) {
            return ResponseEntity.status(400).body(e.getMessage());
        }
    }
}
