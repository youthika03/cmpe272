package com.sjsu.cmpe272.fetcher;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.Iterator;
import java.util.List;
import java.lang.Object;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import org.apache.commons.csv.*;

public class ParsingCSV {

	public static void main(String args[]) throws Exception {
		ReservoirFetcher getObj = new ReservoirFetcher();
	//	getObj.sendRequest();
		Reader in = new StringReader(getObj.getResponse());
		CSVParser parser = new CSVParser(in, CSVFormat.DEFAULT);
		List<CSVRecord> list = parser.getRecords();
		printValue(list);
	}

	private static void printValue(List<CSVRecord> list) {

		for (CSVRecord record : list) {
			Iterator<String> iterator = record.iterator();
			int i = 0;
			JsonObject jsonObject = new JsonObject();
			while (iterator.hasNext()) {
				jsonObject.addProperty("col" + ++i, iterator.next());
			}
			System.out.println(jsonObject.toString());
		}

	}
}
