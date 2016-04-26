/**
 * Implementation of 
 * Req 2.	Returns all the words longer than 5 characters
 * 
 */
package com.dgitsystems.codingtest.countwords.service.findwords;

import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;

/**
 * @author Rokon
 *
 */
public class FindWordsLongerThanSpecifiedCharacters extends FindWords {

	/* log4j logging */
	static Logger log = Logger.getLogger(FindWordsLongerThanSpecifiedCharacters.class);

	/*
	 * returns a list of words longer than specified number of characters as
	 * received in the Argument
	 */
	@Override
	public List<String> find(List<String> inputStrList, int longerThan) {

		List<String> longerThanList = new ArrayList<String>();

		if (!inputStrList.isEmpty()) {
			for (String name : inputStrList) {
				if (name.length() > longerThan) {
					longerThanList.add(name);
				}
			}
		} else {
			log.info("No names found in the input file!");
		}
		return longerThanList;
	}
}
