/*
 * iur-ade-citygml4j - i-Urban Revitalization ADE module for citygml4j
 * https://github.com/citygml4j/iur-ade-citygml4j
 *
 * iur-ade-citygml4j is part of the citygml4j project
 *
 * Copyright 2019-2021 Virtual City Systems
 * https://vc.systems/
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

package org.citygml4j.ade.iur.model.urg;

import org.citygml4j.ade.iur.model.common.AbstractDataType;
import org.citygml4j.builder.copy.CopyBuilder;
import org.citygml4j.builder.copy.ObjectCopier;
import org.citygml4j.model.common.base.ModelObjects;
import org.citygml4j.model.gml.basicTypes.Code;

public class LandPricePerLandUse extends AbstractDataType {
    private Code landUse;
    private Integer landPrice;

    public Code getLandUse() {
        return landUse;
    }

    public void setLandUse(Code landUse) {
        this.landUse = ModelObjects.setParent(landUse, this);
    }

    public Integer getLandPrice() {
        return landPrice;
    }

    public void setLandPrice(Integer landPrice) {
        this.landPrice = landPrice;
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        LandPricePerLandUse copy = target == null ? new LandPricePerLandUse() : (LandPricePerLandUse) target;
        return ObjectCopier.copyTo(this, copy, copyBuilder);
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new LandPricePerLandUse(), copyBuilder);
    }
}
