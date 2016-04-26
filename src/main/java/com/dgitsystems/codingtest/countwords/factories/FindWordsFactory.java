/**
 * This is the factory class for providing responsible implementation 
 * classes of FindWords business
 */
package com.dgitsystems.codingtest.countwords.factories;

import com.dgitsystems.codingtest.countwords.service.findwords.FindWords;
import com.dgitsystems.codingtest.countwords.service.findwords.FindWordsLongerThanSpecifiedCharacters;

/**
 * @author Rokon
 *
 */
public class FindWordsFactory {

	public FindWords getFindWordsConcrete(String findWordsType) {

		if (findWordsType.equals("LONGER_THAN_SPECIFIED_CHAR")) {
			return new FindWordsLongerThanSpecifiedCharacters();
		} else
			return null;
	}

}
