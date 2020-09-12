package com.exemplo.feign.demo.controller;

import com.exemplo.feign.demo.dto.Cep;
import com.exemplo.feign.demo.services.CepFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cep")
public class CepController {

    @Autowired
    private CepFeignService cepFeignService;

    @GetMapping("/{numero_cep}")
    public ResponseEntity<Cep> consultaEnderecoPorCep(@PathVariable(value="numero_cep",required = true) String numero_cep){
        return new ResponseEntity<Cep>(cepFeignService.getCep(numero_cep), HttpStatus.OK);
    }

}
