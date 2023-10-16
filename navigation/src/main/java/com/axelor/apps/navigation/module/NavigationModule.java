package com.axelor.apps.navigation.module;

import com.axelor.app.AxelorModule;
import com.axelor.apps.navigation.service.EAISService;
import com.axelor.apps.navigation.service.impl.EAISServiceImpl;

public class NavigationModule extends AxelorModule {

    @Override
    protected void configure() {
        bind(EAISService.class).to(EAISServiceImpl.class);
    }
}
