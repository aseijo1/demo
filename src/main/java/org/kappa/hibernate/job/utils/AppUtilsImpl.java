package org.kappa.hibernate.job.utils;

import java.util.Date;

import org.springframework.stereotype.Component;

@Component
public class AppUtilsImpl implements AppUtils {

	@Override
	public String showDate() {
		
		return new Date().toString();
	}

}
