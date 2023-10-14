package com.tapiwa.leela;

import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;
import java.util.List;
//
class ContainsDuplicate
{
	public static boolean containsDuplicate(Integer[] nums)
	{
	     List<Integer> numsList = Arrays.asList(nums);
	     // System.out.println((new HashSet<Integer>(numsList)).size());
	     if (numsList.size() == (new HashSet<Integer>(numsList)).size() )
	        return false;
	     return true;
	}
}
