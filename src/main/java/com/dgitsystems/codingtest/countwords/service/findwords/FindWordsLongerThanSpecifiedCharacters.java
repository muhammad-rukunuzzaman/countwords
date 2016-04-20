/**
 * Implementation of 
 * Req 2.	Returns all the words longer than 5 characters
 * 
 */
package com.dgitsystems.codingtest.countwords.service.findwords;

import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;

import com.dgitsystems.codingtest.countwords.dao.DataRepository;

/**
 * @author Rokon
 *
 */
public class FindWordsLongerThanSpecifiedCharacters extends FindWords {

	/*log4j logging*/
	static Logger log = Logger.getLogger(FindWordsLongerThanSpecifiedCharacters.class);
	
	/*In Real Scenario it should be done via Dependency Injection if any framework is being used*/
	DataRepository dataRepository = new DataRepository();
	
	/*returns a list of words longer than specified number of characters as received in the Argument */
	@Override
	public List<String> find(int longerThan) {
		
		List<String> longerThanList = new ArrayList<String>();
		List<String> inputStrList = dataRepository.getInputStrList();
		
		if(!inputStrList.isEmpty()){
            for(String name:inputStrList){  
                if(name.length()>longerThan){
                	longerThanList.add(name);
                }
            }
		} else {
			log.info("Input file missing or No names found in the input file!");
		}
		return longerThanList;
	}
}
