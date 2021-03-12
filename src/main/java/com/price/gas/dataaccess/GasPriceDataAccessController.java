package com.price.gas.dataaccess;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.price.gas.model.GasPrices;
import com.price.gas.repository.GasPriceRepository;


@Component
public class GasPriceDataAccessController {
	
	@Autowired
	private GasPriceRepository gasPriceRepository;
	
	//insert the consumed message for the day into database
	public String saveRecord(GasPrices record) {
		record.setDate(new SimpleDateFormat("yyyy-MM-dd").format(Calendar.getInstance().getTime()));
		gasPriceRepository.save(record);
		return "Inserted Data for date: " + record.getDate();
	}
	

}
