package ru.sergeantalexander.restproxy.client.grpc;

import org.springframework.stereotype.Component;
import ru.sergeantalexander.restproxy.entity.PersonalData;
import ru.sergeantalexander.restproxy.entity.Tax;

@Component
public class TaxClient {

    public Tax getTax(PersonalData personalData) {
        return new Tax();
    }
}
