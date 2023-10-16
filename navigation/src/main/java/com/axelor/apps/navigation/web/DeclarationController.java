package com.axelor.apps.navigation.web;

import com.axelor.apps.ens.db.Declaration;
import com.axelor.apps.navigation.service.EAISService;
import com.axelor.i18n.I18n;
import com.axelor.rpc.ActionRequest;
import com.axelor.rpc.ActionResponse;
import com.google.inject.Inject;

public class DeclarationController {

    @Inject
    private EAISService eaisService;

    public void setDeclarationFromOtherSystem(ActionRequest request, ActionResponse response) {

        try {
            String registrationNumberTd = (String) request.getContext().get("registrationNumberTd");
            if (registrationNumberTd == null) {
                response.setNotify(I18n.get("Not found declaration"));
                return;
            }

            Declaration declaration = eaisService.getById(registrationNumberTd);

            response.setNotify(I18n.get("Success"));
            response.setValue("declaration", declaration);
        } catch (RuntimeException exception) {
            response.setException(exception);
        }

    }
}
