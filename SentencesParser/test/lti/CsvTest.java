package lti;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

import org.junit.Assert;
import org.junit.Test;

import lti.converter.CSVOutput;

public class CsvTest {
	@Test
	public void testXml() {
		try {
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			new CSVOutput().toOutput(new Scanner(getTestInput()), baos);
			System.out.println(baos.toString("utf-8"));
			Assert.assertEquals(baos.toString("utf-8"), expectedOutput());
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private String getTestInput() {
		// TODO Auto-generated method stub
		return "What	he  shouted was shocking:  停在那儿, 你这肮脏的掠夺者! I couldn't understand a word,perhaps because Chinese \r\n"
				+ " isn't my mother tongue. I was just standing there watching Mr. Young marching around - he \r\n"
				+ "was    furious.   Why was he directing  his  anger at me? Little did I know 	about 	that.\r\n"
				+ "\r\n"
				+ "Nordea Markets is the leading international capital markets operator and investment banking partner in the Nordic and Baltic Sea regions.\r\n"
				+ "We are located next door to you , connecting you to the global markets. \r\n" + "\r\n"
				+ "We combine local expertise with global strength to provide you with a complete portfolio of financial services and solutions. We have \r\n"
				+ "one of the strongest, most diversified product ranges in the Nordics and offer outstanding liquidity in local currencies.\r\n"
				+ "\r\n"
				+ "But more significantly, we offer you access to an unequalled team of experts ,in all facets of capital markets, dedicated to serving \r\n"
				+ "you in the best possible manner.\r\n"
				+ "At Nordea Markets we have a rare combination of local expertise and global strength which gives you, our customer, the opportunity to use us for a wide variety of financial services and solutions.\r\n"
				+ "In fact - in all of the Nordics, you’d have a hard time finding a product range as strong and diversified as ours (and we can give you excellent liquidity in local currencies too). But most importantly, we have a huge team of outstanding specialists ready to serve you, no matter what your financial challenge might be.\r\n"
				+ "";
	}

	private String expectedOutput() {
		return "words\r\n" + "Sentence 1, he, shocking:, shouted, was, What, 你这肮脏的掠夺者, 停在那儿\r\n"
				+ "Sentence 2, a, because, Chinese, couldn't, I, isn't, mother, my, tongue, understand, word,perhaps\r\n"
				+ "Sentence 3, I, just, Mr, standing, there, was, watching\r\n"
				+ "Sentence 4, -, around, furious, he, marching, was, Young\r\n"
				+ "Sentence 5, anger, at, directing, he, his, me, was, Why\r\n"
				+ "Sentence 6, about, did, I, know, Little, that\r\n"
				+ "Sentence 7, and, and, Baltic, banking, capital, in, international, investment, is, leading, Markets, markets, Nordea, Nordic, operator, partner, regions, Sea, the, the\r\n"
				+ "Sentence 8, , are, connecting, door, global, located, markets, next, the, to, to, We, you, you\r\n"
				+ "Sentence 9, a, and, combine, complete, expertise, financial, global, local, of, portfolio, provide, services, solutions, strength, to, We, with, with, you\r\n"
				+ "Sentence 10, and, currencies, diversified, have, in, in, liquidity, local, most, Nordics, of, offer, one, outstanding, product, ranges, strongest, the, the, We\r\n"
				+ "Sentence 11, ,in, access, all, an, best, But, capital, dedicated, experts, facets, in, manner, markets, more, of, of, offer, possible, serving, significantly, team, the, to, to, unequalled, we, you, you\r\n"
				+ "Sentence 12, a, a, and, and, At, combination, customer, expertise, financial, for, gives, global, have, local, Markets, Nordea, of, of, opportunity, our, rare, services, solutions, strength, the, to, us, use, variety, we, which, wide, you\r\n"
				+ "Sentence 13, (and, -, a, a, all, and, as, as, can, currencies, diversified, excellent, fact, finding, give, hard, have, In, in, in, liquidity, local, Nordics, of, ours, product, range, strong, the, time, too), we, you, you’d\r\n"
				+ "Sentence 14, a, be, But, challenge, financial, have, huge, importantly, matter, might, most, no, of, outstanding, ready, serve, specialists, team, to, we, what, you, your\r\n"
				+ "";
	}
}
