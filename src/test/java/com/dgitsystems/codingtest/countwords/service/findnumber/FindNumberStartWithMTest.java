package com.dgitsystems.codingtest.countwords.service.findnumber;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertSame;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import com.dgitsystems.codingtest.countwords.dao.DataRepository;
import java.util.ArrayList;
import java.util.List;

public class FindNumberStartWithMTest {

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
		FindNumber findNumber = new FindNumberStartWithM();
		assertSame(3, findNumber.find(dataRepository.getInputStrList()));
	}

}
