package lti;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

import lti.converter.XmlOutput;

public class Application {

	public static void main(String[] args) {
		try {
			new XmlOutput().toOutput(new Scanner(System.in), System.out);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.exit(0);
	}
}
