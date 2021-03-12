package ru.sergeantalexander.restproxy.service;

import org.springframework.stereotype.Service;
import ru.sergeantalexander.restproxy.client.grpc.TaxClient;
import ru.sergeantalexander.restproxy.client.rest.PersonalDataClient;
import ru.sergeantalexander.restproxy.client.soap.InsuranceClient;
import ru.sergeantalexander.restproxy.entity.ClientInfo;
import ru.sergeantalexander.restproxy.entity.Insurance;
import ru.sergeantalexander.restproxy.entity.PersonalData;
import ru.sergeantalexander.restproxy.entity.Tax;

@Service
public class ClientInfoServiceImpl implements ClientInfoService {

    private final PersonalDataClient personalDataClient;
    private final InsuranceClient insuranceClient;
    private final TaxClient taxClient;

    public ClientInfoServiceImpl(PersonalDataClient personalDataClient, InsuranceClient insuranceClient, TaxClient taxClient) {
        this.personalDataClient = personalDataClient;
        this.insuranceClient = insuranceClient;
        this.taxClient = taxClient;
    }


    @Override
    public ClientInfo getClientInfoByHash(Long id) {

        PersonalData personalData = personalDataClient.getPersonalData(id);
        Insurance insurance = insuranceClient.getInsurance(personalData);
        Tax tax = taxClient.getTax(personalData);

        return new ClientInfo(personalData, insurance, tax);
    }

}
