package ru.sergeantalexander.restproxy.service;

import ru.sergeantalexander.restproxy.entity.ClientInfo;

public interface ClientInfoService {

    ClientInfo getClientInfoByHash(Long id);

}
