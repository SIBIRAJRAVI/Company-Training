package camo.ultramain.mergeContactList;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author siravi
 * @version 1.0
 * @since Sep 11, 2025
 */
public class MergedContactMain {
	public static void main(String []args) {
	//	Getting the Input for the first Contact list
		List<ContactDtoFirst> contactFirstList=new ArrayList<>();
		contactFirstList.add(new ContactDtoFirst("sibi",8526002720l));
		contactFirstList.add(new ContactDtoFirst("krishna",9600272056l));
	//	Getting the Input for the Second Contact list
		List<ContactDtoSecond> contactSecondList = new ArrayList<>();
		contactSecondList.add(new ContactDtoSecond("jerome",8098088080l));
		contactSecondList.add(new ContactDtoSecond("jerome",8526002720l));
	//	Merging the two list in one List
		List<ContactDtoFirst> MergedList=new ArrayList<>(contactFirstList);
		for(ContactDtoSecond addContactSecond:contactSecondList)
		MergedList.add(new ContactDtoFirst(addContactSecond.getContactNameSecond(),addContactSecond.getContactNumberSecond()));
		System.out.println("-------------------------------");
		for(ContactDtoFirst showMergedContact : MergedList) {
			System.out.println(showMergedContact);
		}
		System.out.println("-----------------------------------------");
	//	Placing set to remove the duplicate Based on Number
		Set<ContactDtoFirst> contactFirstSet=new HashSet<>();
		for(ContactDtoFirst addMergedList : MergedList) {
			contactFirstSet.add(addMergedList);
		}
		for(ContactDtoFirst displayResult : contactFirstSet) {
			System.out.println(displayResult);
		}
	}
}
