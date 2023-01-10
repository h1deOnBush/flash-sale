package com.actionworks.flashsale.domain.util;

import org.springframework.boot.autoconfigure.condition.AnyNestedCondition;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;

public class MultiPlaceOrderTypesCondition extends AnyNestedCondition {

    public MultiPlaceOrderTypesCondition() {
        super(ConfigurationPhase.PARSE_CONFIGURATION);
    }

    @ConditionalOnProperty(name = "place_order_type", havingValue = "normal", matchIfMissing = true)
    static class NormalCondition {

    }

    @ConditionalOnProperty(name = "place_order_type", havingValue = "queued", matchIfMissing = true)
    static class QueuedCondition {

    }
}