package com.ptc.skillstesting.list;

import java.util.ArrayList;
import java.util.List;

import com.ptc.skillstesting.exception.PartitionException;

/**
 * <h1>List Actions</h1> The ListActions class provide new methods to manipulate
 * List instances.
 * <p>
 *
 * @author Mohamed EL-ADAMI
 * @version 0.0.1
 * @since 14-09-2021
 */
public class ListActions {

	/**
	 * This method is used to partition a list to multiple list with size provided
	 * as param.
	 * 
	 * @param list   the list we want to partition.
	 * @param taille the size of each partition.
	 * @return List the result of partition.
	 * @exception PartitionException if taille is less than or equals 0.
	 * @exception PartitionException if list is null.
	 */
	public static <T> List<List<T>> partition(List<T> list, int taille) {

		List<List<T>> result = new ArrayList<List<T>>();

		int start = 0;
		int end = taille;

		// Si la taille inferieure ou egale à 0
		if (taille <= 0)
			throw new PartitionException("La taille de la partition " + taille + " être supérieur strictement à 0.");

		// Si la liste est null.
		if (list == null)
			throw new PartitionException("On ne peut pas partionner une liste null.");

		// si la taille est egale à la taille de la liste
		if (list.size() <= taille) {
			result.add(list);
			return result;
		}

		// traitement normale
		do {
			result.add(list.subList(start, end));
			start = Math.min(start + taille, list.size());
			end = Math.min(end + taille, list.size());

		} while (start < list.size());

		return result;
	}

}
