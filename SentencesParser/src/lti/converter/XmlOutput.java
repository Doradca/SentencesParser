package lti.converter;

import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public class XmlOutput extends Output {

	protected void writeSentence(OutputStream output, List<String> words) throws IOException {
		output.write("	<sentence>\r\n".getBytes(super.getCharset()));
		AtomicReference<IOException> exception = new AtomicReference<>();
		words.forEach(word -> {
			try {
				output.write(("		<word>" + word + "</word>\r\n").getBytes(super.getCharset()));
			} catch (UnsupportedEncodingException e) {
				exception.set(e);
			} catch (IOException e) {
				exception.set(e);
			}
		});
		if (exception.get() != null) {
			throw exception.get();
		}
		output.write("	</sentence>\r\n".getBytes(super.getCharset()));
	}

	protected void writeHeader(OutputStream output) throws UnsupportedEncodingException, IOException {
		output.write(("<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\r\n<text>\r\n")
				.getBytes(super.getCharset()));
	}

	protected void writeFooter(OutputStream output) throws UnsupportedEncodingException, IOException {
		output.write(("</text>\r\n").getBytes(super.getCharset()));
	}
}
