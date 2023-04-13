package ru.skillbox.diplom.group35.microservice.account.api.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.skillbox.diplom.group35.microservice.account.api.dto.AccountDto;

import java.util.UUID;

@FeignClient(
        name = "accountFeignClient",
        url = "http://microservice-account",
//        url = "http://localhost:8082",
        path = "/api/v1/account")
public interface AccountFeignClient{

    @GetMapping("/statistic")
    ResponseEntity<Integer> getAccountCount();

    @GetMapping("/me")
    ResponseEntity<AccountDto> get();

    @GetMapping("/{id}")
    ResponseEntity<AccountDto> getById(@PathVariable(name = "id") UUID id);

    @GetMapping
    ResponseEntity<AccountDto> getByEmail(@RequestParam("email") String email);

    @PostMapping
    ResponseEntity<AccountDto> create(@RequestBody AccountDto dto);

    @PutMapping(value = "/me")
    ResponseEntity<AccountDto> update(@RequestBody AccountDto dto);

    @DeleteMapping(value = "/me")
    void delete();

    @DeleteMapping(value = "/{id}")
    void deleteById(@PathVariable(name = "id") UUID id);
}