package ru.sergeantalexander.restproxy.client.rest;

import org.springframework.stereotype.Component;
import ru.sergeantalexander.restproxy.entity.PersonalData;

@Component
public class PersonalDataClient {

    public PersonalData getPersonalData(Long id) {
        return new PersonalData();
    }

}
