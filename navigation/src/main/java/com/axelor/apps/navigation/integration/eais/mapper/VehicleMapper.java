package com.axelor.apps.navigation.integration.eais.mapper;

import com.axelor.apps.base.db.Country;
import com.axelor.apps.base.db.repo.CountryRepository;
import com.axelor.apps.ens.db.TransportationVehicle;
import com.axelor.apps.ens.db.repo.TransportTypeRepository;
import com.axelor.apps.navigation.Utils.ParseUtils;
import com.google.inject.Inject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class VehicleMapper {

    @Inject
    private TransportTypeRepository transportTypeRepository;
    @Inject
    private ParseUtils parseUtils;
    @Inject
    private CountryRepository countryRepository;

    private static final Logger LOG = LoggerFactory.getLogger(VehicleMapper.class);

    public TransportationVehicle toVehicle (String type, String regCountry, String number, String semiNumber){

        TransportationVehicle vehicle = new TransportationVehicle();
        vehicle.setTransportType(transportTypeRepository.findByCode(parseUtils.parseIntOrNull(type)));
        vehicle.setCountryRegVehicle(getCountry(regCountry));
        vehicle.setPlateNo(number + "/" + semiNumber);

        return vehicle;
    }

    private Country getCountry(String codeCountry){
        Country country = countryRepository.findByNumericCode(codeCountry);

        if (country == null) {
            LOG.warn("Страна с кодом {} не найдена.", codeCountry);
        }

        return country; // Это будет null, если страна не найдена.
    }
}
