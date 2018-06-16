package com.coconason.snacksassistantorder.service;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.SubscribableChannel;

public interface SendService {

    @Output("inventoryDeduction")
    SubscribableChannel requestInventoryDeduction();
}
