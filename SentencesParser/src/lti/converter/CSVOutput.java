package lti.converter;

import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public class CSVOutput extends Output {
	private int sentenceNumber = 0;

	protected void writeSentence(OutputStream output, List<String> words) throws IOException {
		sentenceNumber++;
		AtomicReference<IOException> exception = new AtomicReference<>();
		output.write(("Sentence " + sentenceNumber).getBytes(super.getCharset()));
		words.forEach(word -> {
			try {
				output.write((", " + word).getBytes(super.getCharset()));
			} catch (UnsupportedEncodingException e) {
				exception.set(e);
			} catch (IOException e) {
				exception.set(e);
			}
		});
		if (exception.get() != null) {
			throw exception.get();
		}
		output.write("\r\n".getBytes(super.getCharset()));
	}

	protected void writeHeader(OutputStream output) throws UnsupportedEncodingException, IOException {
		output.write("words\r\n".getBytes(super.getCharset()));
	}

	protected void writeFooter(OutputStream output) throws UnsupportedEncodingException, IOException {

	}
}
