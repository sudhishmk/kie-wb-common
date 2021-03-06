/*
 * Copyright 2016 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.kie.workbench.common.forms.dynamic.client.rendering.formGroups.impl.checkbox;

import javax.inject.Inject;

import com.google.gwt.user.client.ui.Widget;
import org.jboss.errai.common.client.dom.Div;
import org.jboss.errai.common.client.dom.HTMLElement;
import org.jboss.errai.ui.client.local.api.IsElement;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.Templated;
import org.kie.workbench.common.forms.dynamic.client.rendering.formGroups.labels.label.FieldLabel;
import org.kie.workbench.common.forms.model.FieldDefinition;

@Templated
public class CheckBoxFormGroupViewImpl implements IsElement,
                                                  CheckBoxFormGroupView {

    @Inject
    @DataField
    protected FieldLabel fieldLabel;

    @Inject
    @DataField
    protected Div helpBlock;

    public void render(Widget widget,
                       FieldDefinition field) {

        fieldLabel.renderForInput(widget,
                                  field);
    }

    @Override
    public HTMLElement getHelpBlock() {
        return helpBlock;
    }
}
