package com.qre.tg.query.api.service.impl;

import com.qre.tg.dto.fare.FareRequest;
import org.springframework.stereotype.Component;

@Component
public class ReturnJourneyStrategy extends TicketTypeStrategy {

    @Override
    public long calculateFare(FareRequest fareRequest) {
        return super.calculateFare(fareRequest) * 2;
    }
}
