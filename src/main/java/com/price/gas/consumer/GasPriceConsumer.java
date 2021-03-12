package com.price.gas.consumer;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import com.price.gas.dataaccess.GasPriceDataAccessController;
import com.price.gas.model.GasPrices;

import java.util.List;

@Component
public class GasPriceConsumer {
	
	@Autowired
	private GasPriceDataAccessController gasPriceDataAccessController;


    @KafkaListener(topics = "${cloudkarafka.topic}")
    public void processMessage(@Payload GasPrices message,
                               @Header(KafkaHeaders.RECEIVED_PARTITION_ID) List<Integer> partitions,
                               @Header(KafkaHeaders.RECEIVED_TOPIC) List<String> topics,
                               @Header(KafkaHeaders.OFFSET) List<Long> offsets) {
        System.out.println("consuming message for the state " + message.isSuccess() + " size " + message.getResult().size() + " record -> " + message.getResult().get(0).getName() + " " + message.getResult().get(0).getGasoline() );
        gasPriceDataAccessController.saveRecord(message);
      
    }

}
