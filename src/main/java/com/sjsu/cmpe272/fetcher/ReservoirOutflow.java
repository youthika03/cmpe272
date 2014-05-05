package com.sjsu.cmpe272.fetcher;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

import org.springframework.stereotype.Component;

@Component
public class ReservoirOutflow {
	private final String USER_AGENT = "Mozilla/5.0";
	private static String value;

	/*
	 * public static void main(String args[]) throws IOException {
	 * ReservoirOutflow objOutflow = new ReservoirOutflow(); Map<Long, Long>
	 * reservoirOutflow = objOutflow.getOutflowData("SHA");
	 * 
	 * }
	 */

	// Http GET Request.

	public Map<Long, Long> getOutflowData(String station) throws IOException {
		String inputLine;
		String url = "http://cdec.water.ca.gov/cgi-progs/queryCSV?station_id="
				+ station
				+ "&sensor_num=23&dur_code=D&start_date=2010-01-01&end_date=2014-04-25&data_wish=View+CSV+Data";

		URL obj = new URL(url);
		HttpURLConnection connect = (HttpURLConnection) obj.openConnection();
		connect.setRequestMethod("GET");
		connect.setRequestProperty("User-AGent", USER_AGENT);
		int responseCode = connect.getResponseCode();
		System.out.println("\n Sending GET Request to URL :" + url);
		System.out.println("Respond Code :" + responseCode);
		BufferedReader in = new BufferedReader(new InputStreamReader(
				connect.getInputStream()));

		StringBuffer response = new StringBuffer();
		Map<Long, Long> map = new TreeMap<Long, Long>();
		// New changes for string search start here.
		in.readLine();
		in.readLine();
		while ((inputLine = in.readLine()) != null) {
			try {
				String[] split = inputLine.split(",");
				if (split.length == 3) {
					SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
					Date date;
					date = format.parse(split[0]);
					map.put(date.getTime(), Long.parseLong(split[2]));
				}
			} catch (Exception e) {
				// ignore errors
			}

		}
		// New changes for string search end here.

		in.close();
		value = response.toString();

		return map;

	}

	public String getResponse() {
		return value;

	}

}
