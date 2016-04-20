package com.dgitsystems.codingtest.countwords.service.findwords;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import org.junit.Before;
import org.junit.Test;

import com.dgitsystems.codingtest.countwords.dao.DataRepository;
import java.util.ArrayList;
import java.util.List;

public class FindWordsLongerThanSpecifiedCharactersTest {

	DataRepository dataRepository;

	/*
	 * Creating Mock Object before using
	 */
	@Before
	public void create() {

		List<String> nameList = new ArrayList<String>();
		nameList.add("Jack");
		nameList.add("Marvin");
		nameList.add("Helen");
		nameList.add("moly");
		nameList.add("Manazir");
		nameList.add("Fredrick");

		dataRepository = mock(DataRepository.class);
		when(dataRepository.getInputStrList()).thenReturn(nameList);
	}

	@Test
	public void test() {

		List<String> nameList = new ArrayList<String>();
		nameList.add("Marvin");
		nameList.add("Manazir");
		nameList.add("Fredrick");

		FindWords findWords = new FindWordsLongerThanSpecifiedCharacters();
		assertEquals(nameList, findWords.find(dataRepository.getInputStrList(), 5));
	}

}
