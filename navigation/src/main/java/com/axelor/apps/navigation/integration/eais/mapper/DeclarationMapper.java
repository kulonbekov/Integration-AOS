package com.axelor.apps.navigation.integration.eais.mapper;

import com.axelor.apps.base.db.Country;
import com.axelor.apps.base.db.repo.CountryRepository;
import com.axelor.apps.ens.db.CustomsOffice;
import com.axelor.apps.ens.db.Declaration;
import com.axelor.apps.ens.db.repo.CustomsOfficeRepository;
import com.axelor.apps.navigation.integration.eais.TransitDeclarationResponse;
import com.google.inject.Inject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static com.axelor.apps.navigation.Utils.ParseUtils.parseIntOrNull;
import static com.oracle.truffle.js.builtins.GlobalBuiltins.Global.parseInt;

public class DeclarationMapper {

    private static final Logger LOG = LoggerFactory.getLogger(DeclarationMapper.class);
    @Inject
    private CountryRepository countryRepository;
    @Inject
    private CustomsOfficeRepository officeRepository;
    @Inject
    private VehicleMapper vehicleMapper;
    @Inject
    private ProductMapper productMapper;

    public Declaration toDeclaration(TransitDeclarationResponse declarationResponse){

        Declaration declaration = new Declaration();
        declaration.setRegistrationNumberTd(declarationResponse.getGATDId());
        declaration.setDepartureCountry(getCountry(declarationResponse.getSendCountry()));
        declaration.setCounterpartyName(declarationResponse.getCounterPartyName());
        declaration.setDestinationCountry(getCountry(declarationResponse.getDestinationCountry()));
        declaration.setCountryRegistration(getCountry(declarationResponse.getRegistrationCountry()));
        declaration.setCustomsDeparture(getCustomsOffice(declarationResponse.getCustomsOrigCode()));
        declaration.setCustomsDestination(getCustomsOffice(declarationResponse.getCustomsDestCode()));
        declaration.setTransportationVehicle(vehicleMapper.toVehicle(declarationResponse.getVehicleType(),declarationResponse.getVehicleRegCountry(),
                declarationResponse.getTransportNumbers(),declarationResponse.getSemiTrailerNumbers()));
        declaration.setProduct(productMapper.toProducts(declarationResponse.getGoods().getGood()));

        return declaration;
    }

    private Country getCountry(String codeCountry){
        Country country = countryRepository.findByNumericCode(codeCountry);

        if (country == null) {
            LOG.warn("Страна с кодом {} не найдена.", codeCountry);
        }

        return country; // Это будет null, если страна не найдена.
    }
    private CustomsOffice getCustomsOffice (String codeCustomsOffice){
        CustomsOffice customsOffice = officeRepository.findByCode(parseIntOrNull(codeCustomsOffice));
        if (customsOffice == null) {
            LOG.warn("Таможенный орган с кодом {} не найдена.", customsOffice);
        }

        return customsOffice; // Это будет null, если страна не найдена.
    }
}
