package com.github.lucasbschuck.model;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.context.annotation.Bean;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

@Data
@Entity
@Table(name = "smartphones")
public class Smartphone {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @CreationTimestamp
    @Column(nullable = false)
    private LocalDate date;
    @Column(nullable = false)
    private String model;
    @Column(nullable = false)
    private BigDecimal tradeInValue;
    @Column(nullable = false)
    private String email;

    public Smartphone() {

    }
}
