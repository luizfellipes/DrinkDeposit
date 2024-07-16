package com.example.drinkdeposit.controller;

import com.example.drinkdeposit.model.dto.DrinkConfigDTO;
import com.example.drinkdeposit.model.entities.DrinkConfig;
import com.example.drinkdeposit.service.DrinkConfigService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/drinkdeposit")
public class DrinkConfigController {

    private final DrinkConfigService drinkConfigService;

    public DrinkConfigController(DrinkConfigService drinkConfigService) {
        this.drinkConfigService = drinkConfigService;
    }

    @PatchMapping("/sections")
    public ResponseEntity<DrinkConfig> updateSections(@PathVariable(value = "id") Integer id, @RequestBody @Valid DrinkConfigDTO drinkConfigDTO) {
        return ResponseEntity.status(HttpStatus.OK).body(drinkConfigService.patchingDrinkConfig(id, drinkConfigDTO));
    }
}
