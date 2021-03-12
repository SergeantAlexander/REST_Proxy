package ru.sergeantalexander.restproxy.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import ru.sergeantalexander.restproxy.JsonRequestMapping;
import ru.sergeantalexander.restproxy.entity.ClientInfo;
import ru.sergeantalexander.restproxy.service.ClientInfoService;

@RestController
public class ClientInfoController {

    private final ClientInfoService service;

    public ClientInfoController(ClientInfoService service) {
        this.service = service;
    }

    @JsonRequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ClientInfo getClientInfoByHash(@PathVariable(name = "id") Long id) {
        return service.getClientInfoByHash(id);

    }


}
