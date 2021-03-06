package com.senla.elhoteladmin.service;

import com.senla.elhoteladmin.entity.AdditionalService;

import java.util.List;

public interface IAdditionalServiceService {
    List<AdditionalService> getListAdditionalServices();

    List<AdditionalService> getListAdditionalServicesSortedByPrice();

    void setNewAdditionalService(AdditionalService additionalService);

    void deleteAdditionalService(AdditionalService additionalService);

    AdditionalService getAdditionalServiceByID(Integer serviceID);

}
