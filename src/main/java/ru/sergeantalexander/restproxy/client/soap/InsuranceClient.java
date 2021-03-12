package ru.sergeantalexander.restproxy.client.soap;

import org.springframework.stereotype.Component;
import ru.sergeantalexander.restproxy.entity.Insurance;
import ru.sergeantalexander.restproxy.entity.PersonalData;

@Component
public class InsuranceClient {

    public Insurance getInsurance(PersonalData personalData) {
        return new Insurance();
    }
}
