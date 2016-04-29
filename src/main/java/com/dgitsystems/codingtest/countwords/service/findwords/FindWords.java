/**
 * Any new Business related to find Words List should extend this Interface 
 * Follows open/closed principle
 * Gives the flexibility to add any new business without impacting previous implementations
 * Please keep the implementations in the same package for better grouping of same type of businesses
 * 
 */
package com.dgitsystems.codingtest.countwords.service.findwords;

/**
 * @author Rokon
 *
 */
public interface FindWords {
	public abstract void find(String sCurrentLine, int longerThan);
}
