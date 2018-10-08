/***
 * GROUP ANAGRAMS
 * Write a method to sort an array of strings so that all the anagrams are next to each other.
 */

package Q10_02_Group_Anagrams;

import java.util.Arrays;

import CtCILibrary.AssortedMethods;

public class Question {
	public static void main(String[] args) {
		String[] array = {"apple", "banana", "carrot", "ele", "duck", "papel", "tarroc", "cudk", "eel", "lee"};
		System.out.println(AssortedMethods.stringArrayToString(array));
		Arrays.sort(array, new AnagramComparator());
		System.out.println(AssortedMethods.stringArrayToString(array));
	}
}
