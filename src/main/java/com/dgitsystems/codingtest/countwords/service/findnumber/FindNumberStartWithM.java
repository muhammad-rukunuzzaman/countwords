/**
 * Implementation of 
 * Req 1. Counts and returns the NUMBER of words (i.e. Strings) that start with "M" or "m"
 * 
 */
package com.dgitsystems.codingtest.countwords.service.findnumber;

import java.util.List;
import org.apache.log4j.Logger;

import com.dgitsystems.codingtest.countwords.dao.DataRepository;

/**
 * @author Rokon
 *
 */
public class FindNumberStartWithM extends FindNumber {

	/*log4j logging*/
	static Logger log = Logger.getLogger(FindNumberStartWithM.class);
	
	/*In Real Scenario it should be done via Dependency Injection if any framework is being used*/
	DataRepository dataRepository = new DataRepository();
	
	/*finds the number of words starts with M or m*/
	@Override
	public int find() {
		int numberCount=0;
		List<String> inputStrList = dataRepository.getInputStrList();
		
		if(!inputStrList.isEmpty()){
            for(String name:inputStrList){  
                if(name.substring(0, 1).equalsIgnoreCase("m")){
                	numberCount+=1;
                }
            }
		} else {
			log.info("Input file missing or No names found in the input file!");
		}
		return numberCount;
	}
}
