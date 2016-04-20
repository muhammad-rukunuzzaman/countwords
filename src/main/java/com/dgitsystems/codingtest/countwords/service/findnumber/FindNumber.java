/**
 * Any new Business related to find NUMBER should extend this Abstract class 
 * Follows open/closed principle
 * Gives the flexibility to add any new business without impacting previous implementations
 * Please keep the implementations in the same package for better grouping of same type of businesses
 * 
 */
package com.dgitsystems.codingtest.countwords.service.findnumber;

import java.util.List;

/**
 * @author Rokon
 *
 */
public abstract class FindNumber {
	public abstract int find(List<String> inputStrList);
}
