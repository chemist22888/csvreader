package com.mgm.reader;

import com.mgm.dto.Line;
import com.opencsv.CSVReader;
import org.apache.commons.lang3.tuple.ImmutablePair;
import org.apache.commons.lang3.tuple.Pair;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class CsvFinderAlgo implements CsvFinder {
	@Override
	public List<Line> findTop10(String file) {
		List<Line> largest = new ArrayList<>();
		try {
			CSVReader csvReader = new CSVReader(new InputStreamReader
					(new BufferedInputStream(new FileInputStream(file))), ';');

			String[] resLine;

			long minLargest = 0;

			while (true) {
				resLine = csvReader.readNext();
				if (resLine == null)
					break;

				Line line = new Line(resLine[0], Long.valueOf(resLine[1]));
				Long value = Long.parseLong(resLine[1]);
				if (largest.size() < 10) {
					largest.add(line);

					Collections.sort(largest);
					minLargest = largest.get(largest.size() - 1).getValue();

				} else if (value > minLargest) {
					System.out.println(value + " " + minLargest);
					largest.add(line);

					Collections.sort(largest);
					largest.remove(10);

					minLargest = largest.get(largest.size() - 1).getValue();
				}


			}

		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		} catch (IOException e) {
			e.printStackTrace();
		}
		return largest;
	}
}
