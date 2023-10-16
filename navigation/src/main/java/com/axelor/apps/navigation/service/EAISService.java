package com.axelor.apps.navigation.service;

import com.axelor.apps.ens.db.Declaration;
import com.axelor.apps.navigation.integration.org.tempuri.TDInfoRequest;

public interface EAISService {

    Declaration getById(String registrationNumberTdt);
}
