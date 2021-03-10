package lti.sentence;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class Sentence {

	private TreeMap<String, List<String>> words = new TreeMap<>(new Comparator<String>() {
		public int compare(String o1, String o2) {
			return o1.toLowerCase().compareTo(o2.toLowerCase());
		}
	});

	public void add(String word) {
		List<String> list = words.get(word);
		if (list == null) {
			list = new LinkedList<>();
			words.put(word, list);
		}
		list.add(word);
	}

	public List<String> getSortedWords() {
		return words.values().stream().flatMap(l -> l.stream()).collect(Collectors.toList());
	}
}
