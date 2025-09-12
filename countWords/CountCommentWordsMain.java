package com.ultramain.countWords;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Class to perform the actions on the comments.
 * @author siravi
 * @version 1.o
 * @since Sep 11, 2025
 */
public class CountCommentWordsMain {
	/**
	 * @param args
	 */
	public static void main(String []args) {
		List<CommentsDto> commentsList=new ArrayList<>();
		commentsList.add(new CommentsDto("This program is nice to see","saran"));
		commentsList.add(new CommentsDto("Company infrastructure is nice to watch and also good to work","sibi"));
		
		for(CommentsDto splitWords : commentsList) {
			Map<String,Integer> commentsMap=new HashMap<>();
			String [] separateWord=splitWords.comment.toLowerCase().split(" ");
			for(String words : separateWord) {
				words=words.replaceAll("[^a-zA-Z]","");
				if(!words.isEmpty()) {
					commentsMap.put(words,commentsMap.getOrDefault(words,0)+1);
				}
			}
			//print results
			for (Map.Entry<String, Integer> entry : commentsMap.entrySet()) {
	            System.out.println(entry.getKey() + " -> " + entry.getValue());
	        }
			System.out.println("-------------------------------------");
		}
	}
}
