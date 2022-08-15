package com.mgm;

import com.mgm.reader.CsvFinder;
import com.mgm.reader.CsvFinderAlgo;

public class Main {
	public static void main(String[] args) {
		CsvFinder finder = new CsvFinderAlgo();

		finder.findTop10("C:\\Users\\natolij\\Downloads\\spring-authorization-server-main\\samples\\csvreader\\src\\main\\resources\\input.txt").forEach(pair->{
			System.out.println(pair.getKey()+" "+pair.getValue());
		});
	}
}
