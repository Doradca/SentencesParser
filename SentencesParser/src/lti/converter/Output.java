package lti.converter;

import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.Scanner;

import lti.reader.Reader;

public abstract class Output {

	public void toOutput(Scanner input, OutputStream output) throws UnsupportedEncodingException, IOException {
		writeHeader(output);
		Reader reader = new Reader();
		while (reader.readSentence(input)) {
			writeSentence(output, reader.getSortedWords());
			output.flush();
		}
		writeFooter(output);
		output.close();
	}

	protected String getCharset() {
		return "utf-8";
	}

	protected abstract void writeSentence(OutputStream output, List<String> words) throws IOException;

	protected abstract void writeHeader(OutputStream output) throws UnsupportedEncodingException, IOException;

	protected abstract void writeFooter(OutputStream output) throws UnsupportedEncodingException, IOException;
}
