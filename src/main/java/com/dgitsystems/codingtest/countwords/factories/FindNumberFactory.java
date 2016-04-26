/**
 * This is the factory class for providing responsible implementation 
 * classes of FindNumber business
 */
package com.dgitsystems.codingtest.countwords.factories;

import com.dgitsystems.codingtest.countwords.service.findnumber.FindNumber;
import com.dgitsystems.codingtest.countwords.service.findnumber.FindNumberStartWithM;

/**
 * @author Rokon
 *
 */
public class FindNumberFactory {

	public FindNumber getFindNumberConcrete(String findNumberType) {

		if (findNumberType.equals("START_WITH_M")) {
			return new FindNumberStartWithM();
		} else
			return null;
	}
}
