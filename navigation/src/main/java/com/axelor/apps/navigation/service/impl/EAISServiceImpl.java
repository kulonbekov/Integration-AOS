package com.axelor.apps.navigation.service.impl;

import com.axelor.apps.ens.db.Declaration;
import com.axelor.apps.navigation.integration.org.tempuri.*;
import com.axelor.apps.navigation.integration.org.tempuri.mapper.DeclarationMapper;
import com.axelor.apps.navigation.service.EAISService;
import com.axelor.inject.Beans;
import com.google.inject.Inject;



public class EAISServiceImpl implements EAISService {

    @Inject
    DeclarationMapper declarationMapper;

    @Override
    public Declaration getById(String registrationNumberTd) {

        ITDService itdService = new TDService().getBasicHttpBindingITDService();

        ObjectFactory factory = new ObjectFactory();

        TDInfoRequest request = factory.createTDInfoRequest();
        request.setId(registrationNumberTd);

        TransitDeclarationResponse declarationResponse = itdService.requestTD(request);

        return declarationMapper.toDeclaration(declarationResponse);
    }
}
