package com.price.gas;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/gasprice/consumer")
public class GasPriceEventConsumerController {
	
	@RequestMapping("/heartbeat")
	public String getConsumerHeartBeat() {
		return "Consumer Alive";
	}

}
