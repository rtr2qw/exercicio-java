package Fundamentos;

import java.time.Clock;

public class Wrapper {
	public static void main(String[] args) {
		//byte
		Byte b=100;
		Short s =1000;
		Integer i = 10000;
		Long l = 100000L;

		System.out.println(b.byteValue());
		System.out.println(s.toString());
		System.out.println(i * 3);
		System.out.println(l / 3);

		Boolean bo = Boolean.parseBoolean("true");
		System.out.println(bo);
		System.out.println(bo.toString().toUpperCase());
		Character c = '#'; //char
		System.out.println(c+ "ccc");


	}

}
