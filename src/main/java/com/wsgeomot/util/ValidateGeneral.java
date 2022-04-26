/**
 * 
 */
package com.wsgeomot.util;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.apache.log4j.Logger;

import com.wsgeomot.co.model.dto.StatusResponse;

/**
 * @author Andres Capera
 *
 */
public class ValidateGeneral {

	private static final Logger logger = Logger.getLogger(ValidateGeneral.class);

	public <T> StatusResponse validate(T t) {

		StatusResponse statusResponse = null;
		String message = "";

		try {
			ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
			Validator validator = factory.getValidator();
			Set<ConstraintViolation<T>> violations = validator.validate(t);

			if (violations.isEmpty()) {
				statusResponse = ResponseCodes.SUCCESS;
			} else {
				statusResponse = ResponseCodes.UNPROCESSABLE_ENTITY;

				for (ConstraintViolation<T> violation : violations) {
					message = "geo-mot validate : " + violation.getMessage();
					logger.error(message);
				}
			}

		} catch (Exception e) {
			statusResponse = ResponseCodes.TECHNICAL_ERROR;
			message = "geo-mot GeneralValidator validate" + e.getMessage();
			logger.error(message);
		}

		return statusResponse;

	}
}
