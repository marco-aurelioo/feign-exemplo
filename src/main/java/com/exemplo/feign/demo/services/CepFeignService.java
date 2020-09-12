package com.exemplo.feign.demo.services;

import com.exemplo.feign.demo.dto.Cep;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@FeignClient(url = "https://viacep.com.br/ws", name = "wsCep")
public interface CepFeignService {

    @GetMapping("/{numero_cep}/json")
    Cep getCep(@PathVariable("numero_cep") String numero_cep);

}
