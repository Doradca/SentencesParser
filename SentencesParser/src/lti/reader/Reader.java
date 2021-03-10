package lti.reader;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicReference;

import lti.sentence.Sentence;

public class Reader {
	private static List<String> ENDS_OF_SEQUENCE = Arrays.asList(".", "!", "?");
	private static List<String> SEPARATORS = Arrays.asList(",");

	private Sentence sentence;

	public boolean readSentence(Scanner input) {
		sentence = new Sentence();
		boolean sentenceEnd = false;
		while (!sentenceEnd) {
			final String token = readToken(input);
			if (token == null) {
				return false;
			}
			final String word;
			String endend = ENDS_OF_SEQUENCE.stream().filter(end -> token.endsWith(end)).findAny().orElse(null);
			if (endend != null) {
				sentenceEnd = true;
				word = token.substring(0, token.length() - endend.length());
			} else {
				String separatorseparator = SEPARATORS.stream().filter(s -> token.endsWith(s)).findAny().orElse(null);
				if (separatorseparator != null) {
					word = token.substring(0, token.length() - separatorseparator.length());
				} else {
					word = token;
				}
			}
			sentence.add(word);
		}
		return true;
	}

	private String readToken(Scanner input) {
		AtomicReference<String> token = new AtomicReference<>();
		Thread t = new Thread() {
			public void run() {
				token.set(input.next());
			}
		};
		t.start();
		try {
			t.join(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		if (t.isAlive()) {
			t.interrupt();
		}
		return token.get();
	}

	public List<String> getSortedWords() {
		return sentence.getSortedWords();
	}
}
