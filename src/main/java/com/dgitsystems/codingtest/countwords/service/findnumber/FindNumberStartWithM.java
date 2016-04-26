/**
 * Implementation of 
 * Req 1. Counts and returns the NUMBER of words (i.e. Strings) that start with "M" or "m"
 * 
 */
package com.dgitsystems.codingtest.countwords.service.findnumber;

import java.util.List;
import org.apache.log4j.Logger;

/**
 * @author Rokon
 *
 */
public class FindNumberStartWithM extends FindNumber {

	/* log4j logging */
	static Logger log = Logger.getLogger(FindNumberStartWithM.class);

	/* finds the number of words starts with M or m */
	@Override
	public int find(List<String> inputStrList) {
		int numberCount = 0;

		if (!inputStrList.isEmpty()) {
			for (String name : inputStrList) {
				if (name.substring(0, 1).equalsIgnoreCase("m")) {
					numberCount += 1;
				}
			}
		} else {
			log.info("No names found in the input file!");
		}
		return numberCount;
	}
}
