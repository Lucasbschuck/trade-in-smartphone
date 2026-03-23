package com.github.lucasbschuck.controller;

import com.github.lucasbschuck.application.GetSmarphoneByEmailPerformance;
import com.github.lucasbschuck.model.Smartphone;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/tradeinperformance/smartphones" )
@RequiredArgsConstructor
public class TradeInSmartphonePerformanceController {
    final GetSmarphoneByEmailPerformance getSmarphoneByEmailPerformance;

    @GetMapping
    public Page<List<Smartphone>> getByEmail(@RequestParam String email, Pageable pageable){
        return getSmarphoneByEmailPerformance.execute(email,pageable);
    }

}
