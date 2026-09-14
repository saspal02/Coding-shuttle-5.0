package org.saswat.code.impl;

import org.saswat.code.interfaces.Syrup;
import org.springframework.stereotype.Component;

@Component
public class StrawberrySyrup implements Syrup {

    @Override
    public String getSyrupType() {
        return "Strawberry syrup";
    }
}
