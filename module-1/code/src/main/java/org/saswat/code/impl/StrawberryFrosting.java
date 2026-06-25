package org.saswat.code.impl;

import org.saswat.code.interfaces.Frosting;
import org.springframework.stereotype.Component;

@Component
public class StrawberryFrosting implements Frosting {
    @Override
    public String getFrostingType() {
        return "Strawberry frosting";
    }
}
