package com.coconason.snacksassistantgoods.service;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface ReceiveService {

    @Input("inventoryDeduction")
    SubscribableChannel inventoryDeduction();
}
