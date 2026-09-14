package org.saswat.code.impl;

import org.saswat.code.interfaces.Frosting;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class ChocolateFrosting implements Frosting {
    @Override
    public String getFrostingType() {
        return "Chocolate frosting";
    }
}
