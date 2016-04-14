/*
 * Copyright 2004-2016 EPAM Systems
 *
 * This file is part of JDI project.
 *
 * JDI is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * JDI is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; 
 * without even the implied warranty ofMERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. 
 * See the GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with JDI. If not, see <http://www.gnu.org/licenses/>.
 */

package com.epam.jdi.uitests.mobile.appium.elements.composite;

import com.epam.jdi.uitests.core.annotations.functions.Functions;
import com.epam.jdi.uitests.core.interfaces.complex.IPopup;
import com.epam.jdi.uitests.mobile.appium.elements.common.Text;

/**
 * Created by Roman_Iovlev on 7/8/2015.
 */
public class Popup extends Text implements IPopup {

    @Override
    protected String getTextAction() {
        return getElement.getTextElement().getText();
    }

    public void ok() {
        getElement.getButton(Functions.OK_BUTTON).click();
    }

    public void cancel() {
        getElement.getButton(Functions.CANCEL_BUTTON).click();
    }

    public void close() {
        getElement.getButton(Functions.CLOSE_BUTTON).click();
    }

}