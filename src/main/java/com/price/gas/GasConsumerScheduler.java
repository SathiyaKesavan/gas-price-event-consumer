package com.price.gas;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;


@Component
public class GasConsumerScheduler {

	@Autowired
	private GasPriceEventConsumerController gasPriceEventConsumerController;
	
	// Heartbeat service to keep the heroku app alive
	//@Scheduled(cron = "0 0 0 * * *")
	 @Scheduled(fixedRate = 600000)
	public void cronHertBeat() {
		 gasPriceEventConsumerController.getConsumerHeartBeat();
		}

	public GasPriceEventConsumerController getGasPriceEventConsumerController() {
		return gasPriceEventConsumerController;
	}

	public void setGasPriceEventConsumerController(GasPriceEventConsumerController gasPriceEventConsumerController) {
		this.gasPriceEventConsumerController = gasPriceEventConsumerController;
	}


	

}
