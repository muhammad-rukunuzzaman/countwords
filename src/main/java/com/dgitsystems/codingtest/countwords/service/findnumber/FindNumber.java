/**
 * Any new Business related to find NUMBER should implement this Interface
 * Follows open/closed principle
 * Gives the flexibility to add any new business without impacting previous implementations
 * Please keep the implementations in the same package for better grouping of same type of businesses
 * 
 */
package com.dgitsystems.codingtest.countwords.service.findnumber;

/**
 * @author Rokon
 *
 */
public interface FindNumber  {
	public void find(String sCurrentLine) ;
}
