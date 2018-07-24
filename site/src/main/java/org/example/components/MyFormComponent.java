package org.example.components;

import java.util.Map;

import com.onehippo.cms7.eforms.hst.behaviors.StoreFormDataBehavior;
import com.onehippo.cms7.eforms.hst.components.EformComponent;
import com.onehippo.cms7.eforms.hst.model.ErrorMessage;
import com.onehippo.cms7.eforms.hst.model.Form;

import org.hippoecm.hst.component.support.forms.FormMap;
import org.hippoecm.hst.core.component.HstRequest;
import org.hippoecm.hst.core.component.HstResponse;

public class MyFormComponent extends EformComponent {

    @Override
    public void onValidationError(HstRequest request, HstResponse response, Form form, FormMap map, Map<String, ErrorMessage> errors) {
    }

    @Override
    public boolean onValidationSuccess(HstRequest request, HstResponse response, Form form, FormMap map) {
        return false;
    }

    @Override
    protected void addConfiguredBehaviors(HstRequest request) {
        super.addConfiguredBehaviors(request);
        addBehavior(new StoreFormDataBehavior());
    }

}
