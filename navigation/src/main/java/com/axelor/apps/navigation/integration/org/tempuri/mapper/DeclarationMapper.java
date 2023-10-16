package com.axelor.apps.navigation.integration.org.tempuri.mapper;

import com.axelor.apps.base.db.Country;
import com.axelor.apps.base.db.repo.CountryRepository;
import com.axelor.apps.ens.db.Declaration;
import com.axelor.apps.navigation.integration.org.tempuri.TransitDeclarationResponse;
import com.google.inject.Inject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DeclarationMapper {

    private static final Logger LOG = LoggerFactory.getLogger(DeclarationMapper.class);
    @Inject
    private CountryRepository countryRepository;

    public Declaration toDeclaration(TransitDeclarationResponse declarationResponse){

        Declaration declaration = new Declaration();
        declaration.setRegistrationNumberTd(declarationResponse.getGATDId());
        declaration.setDepartureCountry(getCountry(declarationResponse.getSendCountry()));
        declaration.setCounterpartyName(declarationResponse.getCounterPartyName());


        return declaration;
    }

    private Country getCountry(String codeCountry){
        Country country = countryRepository.findByNumericCode(codeCountry);

        if (country == null) {
            LOG.warn("Страна с кодом {} не найдена.", codeCountry);
        }

        return country; // Это будет null, если страна не найдена.
    }
}
