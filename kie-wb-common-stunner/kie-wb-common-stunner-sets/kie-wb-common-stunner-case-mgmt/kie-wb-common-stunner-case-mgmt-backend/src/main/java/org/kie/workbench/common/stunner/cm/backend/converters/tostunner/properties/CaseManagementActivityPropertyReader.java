/*
 * Copyright 2018 Red Hat, Inc. and/or its affiliates.
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
package org.kie.workbench.common.stunner.cm.backend.converters.tostunner.properties;

import org.eclipse.bpmn2.Activity;
import org.eclipse.bpmn2.di.BPMNPlane;
import org.kie.workbench.common.stunner.bpmn.backend.converters.tostunner.DefinitionResolver;
import org.kie.workbench.common.stunner.bpmn.backend.converters.tostunner.properties.ActivityPropertyReader;
import org.kie.workbench.common.stunner.cm.backend.converters.customproperties.CaseManagementCustomElement;

public class CaseManagementActivityPropertyReader extends ActivityPropertyReader {

    public CaseManagementActivityPropertyReader(Activity activity,
                                                BPMNPlane plane,
                                                DefinitionResolver definitionResolver) {
        super(activity, plane, definitionResolver);
    }

    public boolean isCase() {
        return CaseManagementCustomElement.isCase.of(element).get();
    }
}