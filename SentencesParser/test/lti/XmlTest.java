package lti;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

import org.junit.Assert;
import org.junit.Test;

import lti.converter.XmlOutput;

public class XmlTest {

	@Test
	public void testXml() {
		try {
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			new XmlOutput().toOutput(new Scanner(getTestInput()), baos);
			System.out.println(baos.toString("utf-8"));
			Assert.assertEquals(baos.toString("utf-8"), expectedOutput());
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private String expectedOutput() {
		return "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\r\n" + "<text>\r\n" + "	<sentence>\r\n"
				+ "		<word>he</word>\r\n" + "		<word>shocking:</word>\r\n" + "		<word>shouted</word>\r\n"
				+ "		<word>was</word>\r\n" + "		<word>What</word>\r\n" + "		<word>你这肮脏的掠夺者</word>\r\n"
				+ "		<word>停在那儿</word>\r\n" + "	</sentence>\r\n" + "	<sentence>\r\n" + "		<word>a</word>\r\n"
				+ "		<word>because</word>\r\n" + "		<word>Chinese</word>\r\n"
				+ "		<word>couldn't</word>\r\n" + "		<word>I</word>\r\n" + "		<word>isn't</word>\r\n"
				+ "		<word>mother</word>\r\n" + "		<word>my</word>\r\n" + "		<word>tongue</word>\r\n"
				+ "		<word>understand</word>\r\n" + "		<word>word,perhaps</word>\r\n" + "	</sentence>\r\n"
				+ "	<sentence>\r\n" + "		<word>I</word>\r\n" + "		<word>just</word>\r\n"
				+ "		<word>Mr</word>\r\n" + "		<word>standing</word>\r\n" + "		<word>there</word>\r\n"
				+ "		<word>was</word>\r\n" + "		<word>watching</word>\r\n" + "	</sentence>\r\n"
				+ "	<sentence>\r\n" + "		<word>-</word>\r\n" + "		<word>around</word>\r\n"
				+ "		<word>furious</word>\r\n" + "		<word>he</word>\r\n" + "		<word>marching</word>\r\n"
				+ "		<word>was</word>\r\n" + "		<word>Young</word>\r\n" + "	</sentence>\r\n"
				+ "	<sentence>\r\n" + "		<word>anger</word>\r\n" + "		<word>at</word>\r\n"
				+ "		<word>directing</word>\r\n" + "		<word>he</word>\r\n" + "		<word>his</word>\r\n"
				+ "		<word>me</word>\r\n" + "		<word>was</word>\r\n" + "		<word>Why</word>\r\n"
				+ "	</sentence>\r\n" + "	<sentence>\r\n" + "		<word>about</word>\r\n"
				+ "		<word>did</word>\r\n" + "		<word>I</word>\r\n" + "		<word>know</word>\r\n"
				+ "		<word>Little</word>\r\n" + "		<word>that</word>\r\n" + "	</sentence>\r\n"
				+ "	<sentence>\r\n" + "		<word>and</word>\r\n" + "		<word>and</word>\r\n"
				+ "		<word>Baltic</word>\r\n" + "		<word>banking</word>\r\n"
				+ "		<word>capital</word>\r\n" + "		<word>in</word>\r\n"
				+ "		<word>international</word>\r\n" + "		<word>investment</word>\r\n"
				+ "		<word>is</word>\r\n" + "		<word>leading</word>\r\n" + "		<word>Markets</word>\r\n"
				+ "		<word>markets</word>\r\n" + "		<word>Nordea</word>\r\n" + "		<word>Nordic</word>\r\n"
				+ "		<word>operator</word>\r\n" + "		<word>partner</word>\r\n"
				+ "		<word>regions</word>\r\n" + "		<word>Sea</word>\r\n" + "		<word>the</word>\r\n"
				+ "		<word>the</word>\r\n" + "	</sentence>\r\n" + "	<sentence>\r\n" + "		<word></word>\r\n"
				+ "		<word>are</word>\r\n" + "		<word>connecting</word>\r\n" + "		<word>door</word>\r\n"
				+ "		<word>global</word>\r\n" + "		<word>located</word>\r\n"
				+ "		<word>markets</word>\r\n" + "		<word>next</word>\r\n" + "		<word>the</word>\r\n"
				+ "		<word>to</word>\r\n" + "		<word>to</word>\r\n" + "		<word>We</word>\r\n"
				+ "		<word>you</word>\r\n" + "		<word>you</word>\r\n" + "	</sentence>\r\n"
				+ "	<sentence>\r\n" + "		<word>a</word>\r\n" + "		<word>and</word>\r\n"
				+ "		<word>combine</word>\r\n" + "		<word>complete</word>\r\n"
				+ "		<word>expertise</word>\r\n" + "		<word>financial</word>\r\n" + "		<word>global</word>\r\n"
				+ "		<word>local</word>\r\n" + "		<word>of</word>\r\n" + "		<word>portfolio</word>\r\n"
				+ "		<word>provide</word>\r\n" + "		<word>services</word>\r\n"
				+ "		<word>solutions</word>\r\n" + "		<word>strength</word>\r\n" + "		<word>to</word>\r\n"
				+ "		<word>We</word>\r\n" + "		<word>with</word>\r\n" + "		<word>with</word>\r\n"
				+ "		<word>you</word>\r\n" + "	</sentence>\r\n" + "	<sentence>\r\n"
				+ "		<word>and</word>\r\n" + "		<word>currencies</word>\r\n"
				+ "		<word>diversified</word>\r\n" + "		<word>have</word>\r\n" + "		<word>in</word>\r\n"
				+ "		<word>in</word>\r\n" + "		<word>liquidity</word>\r\n" + "		<word>local</word>\r\n"
				+ "		<word>most</word>\r\n" + "		<word>Nordics</word>\r\n" + "		<word>of</word>\r\n"
				+ "		<word>offer</word>\r\n" + "		<word>one</word>\r\n" + "		<word>outstanding</word>\r\n"
				+ "		<word>product</word>\r\n" + "		<word>ranges</word>\r\n"
				+ "		<word>strongest</word>\r\n" + "		<word>the</word>\r\n" + "		<word>the</word>\r\n"
				+ "		<word>We</word>\r\n" + "	</sentence>\r\n" + "	<sentence>\r\n"
				+ "		<word>,in</word>\r\n" + "		<word>access</word>\r\n" + "		<word>all</word>\r\n"
				+ "		<word>an</word>\r\n" + "		<word>best</word>\r\n" + "		<word>But</word>\r\n"
				+ "		<word>capital</word>\r\n" + "		<word>dedicated</word>\r\n"
				+ "		<word>experts</word>\r\n" + "		<word>facets</word>\r\n" + "		<word>in</word>\r\n"
				+ "		<word>manner</word>\r\n" + "		<word>markets</word>\r\n" + "		<word>more</word>\r\n"
				+ "		<word>of</word>\r\n" + "		<word>of</word>\r\n" + "		<word>offer</word>\r\n"
				+ "		<word>possible</word>\r\n" + "		<word>serving</word>\r\n"
				+ "		<word>significantly</word>\r\n" + "		<word>team</word>\r\n" + "		<word>the</word>\r\n"
				+ "		<word>to</word>\r\n" + "		<word>to</word>\r\n" + "		<word>unequalled</word>\r\n"
				+ "		<word>we</word>\r\n" + "		<word>you</word>\r\n" + "		<word>you</word>\r\n"
				+ "	</sentence>\r\n" + "	<sentence>\r\n" + "		<word>a</word>\r\n" + "		<word>a</word>\r\n"
				+ "		<word>and</word>\r\n" + "		<word>and</word>\r\n" + "		<word>At</word>\r\n"
				+ "		<word>combination</word>\r\n" + "		<word>customer</word>\r\n"
				+ "		<word>expertise</word>\r\n" + "		<word>financial</word>\r\n" + "		<word>for</word>\r\n"
				+ "		<word>gives</word>\r\n" + "		<word>global</word>\r\n" + "		<word>have</word>\r\n"
				+ "		<word>local</word>\r\n" + "		<word>Markets</word>\r\n" + "		<word>Nordea</word>\r\n"
				+ "		<word>of</word>\r\n" + "		<word>of</word>\r\n" + "		<word>opportunity</word>\r\n"
				+ "		<word>our</word>\r\n" + "		<word>rare</word>\r\n" + "		<word>services</word>\r\n"
				+ "		<word>solutions</word>\r\n" + "		<word>strength</word>\r\n" + "		<word>the</word>\r\n"
				+ "		<word>to</word>\r\n" + "		<word>us</word>\r\n" + "		<word>use</word>\r\n"
				+ "		<word>variety</word>\r\n" + "		<word>we</word>\r\n" + "		<word>which</word>\r\n"
				+ "		<word>wide</word>\r\n" + "		<word>you</word>\r\n" + "	</sentence>\r\n"
				+ "	<sentence>\r\n" + "		<word>(and</word>\r\n" + "		<word>-</word>\r\n"
				+ "		<word>a</word>\r\n" + "		<word>a</word>\r\n" + "		<word>all</word>\r\n"
				+ "		<word>and</word>\r\n" + "		<word>as</word>\r\n" + "		<word>as</word>\r\n"
				+ "		<word>can</word>\r\n" + "		<word>currencies</word>\r\n"
				+ "		<word>diversified</word>\r\n" + "		<word>excellent</word>\r\n"
				+ "		<word>fact</word>\r\n" + "		<word>finding</word>\r\n" + "		<word>give</word>\r\n"
				+ "		<word>hard</word>\r\n" + "		<word>have</word>\r\n" + "		<word>In</word>\r\n"
				+ "		<word>in</word>\r\n" + "		<word>in</word>\r\n" + "		<word>liquidity</word>\r\n"
				+ "		<word>local</word>\r\n" + "		<word>Nordics</word>\r\n" + "		<word>of</word>\r\n"
				+ "		<word>ours</word>\r\n" + "		<word>product</word>\r\n" + "		<word>range</word>\r\n"
				+ "		<word>strong</word>\r\n" + "		<word>the</word>\r\n" + "		<word>time</word>\r\n"
				+ "		<word>too)</word>\r\n" + "		<word>we</word>\r\n" + "		<word>you</word>\r\n"
				+ "		<word>you’d</word>\r\n" + "	</sentence>\r\n" + "	<sentence>\r\n" + "		<word>a</word>\r\n"
				+ "		<word>be</word>\r\n" + "		<word>But</word>\r\n" + "		<word>challenge</word>\r\n"
				+ "		<word>financial</word>\r\n" + "		<word>have</word>\r\n" + "		<word>huge</word>\r\n"
				+ "		<word>importantly</word>\r\n" + "		<word>matter</word>\r\n"
				+ "		<word>might</word>\r\n" + "		<word>most</word>\r\n" + "		<word>no</word>\r\n"
				+ "		<word>of</word>\r\n" + "		<word>outstanding</word>\r\n" + "		<word>ready</word>\r\n"
				+ "		<word>serve</word>\r\n" + "		<word>specialists</word>\r\n" + "		<word>team</word>\r\n"
				+ "		<word>to</word>\r\n" + "		<word>we</word>\r\n" + "		<word>what</word>\r\n"
				+ "		<word>you</word>\r\n" + "		<word>your</word>\r\n" + "	</sentence>\r\n" + "</text>\r\n"
				+ "";
	}

	private String getTestInput() {
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
}
