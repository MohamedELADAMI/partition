package com.ptc.skillstesting.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import com.ptc.skillstesting.exception.PartitionException;

public class ListActionsTest {

	private List<String> alpha;

	private List<Integer> num;

	@Rule
	public ExpectedException expectedException = ExpectedException.none();

	@Before
	public void setUp() {

		alpha = new ArrayList<String>();
		alpha.add("A");
		alpha.add("B");
		alpha.add("C");
		alpha.add("D");
		alpha.add("E");

		num = new ArrayList<Integer>();
		num.add(1);
		num.add(2);
		num.add(3);
		num.add(4);
		num.add(5);
	}

	@Test
	public void testStringPartition() {

		List<List<String>> expected = Arrays.asList(Arrays.asList("A", "B"), Arrays.asList("C", "D"),
				Arrays.asList("E"));

		Assert.assertEquals(expected, ListActions.partition(alpha, 2));
	}

	@Test
	public void testStringPartitionWhenTailleEqualsListSize() {

		List<List<String>> expected = new ArrayList<List<String>>();
		expected.add(alpha);
		Assert.assertEquals(expected, ListActions.partition(alpha, 5));

	}

	@Test
	public void testExceptionPartitionWhenTailleLessThanZero() {

		expectedException.expect(PartitionException.class);
		expectedException.expectMessage("La taille de la partition -3 être supérieur strictement à 0.");
		ListActions.partition(alpha, -3);

	}

	@Test
	public void testExceptionPartitionWhenTailleEqualZero() {

		expectedException.expect(PartitionException.class);
		expectedException.expectMessage("La taille de la partition 0 être supérieur strictement à 0.");
		ListActions.partition(num, 0);

	}

	@Test
	public void testExceptionPartitionWhenListIsNull() {

		expectedException.expect(PartitionException.class);
		expectedException.expectMessage("On ne peut pas partionner une liste null.");
		ListActions.partition(null, 2);

	}

	@Test
	public void testNumericalPartition() {

		List<List<Integer>> expected = Arrays.asList(Arrays.asList(1, 2), Arrays.asList(3, 4), Arrays.asList(5));
		Assert.assertEquals(expected, ListActions.partition(num, 2));
	}

}
