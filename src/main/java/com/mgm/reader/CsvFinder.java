package com.mgm.reader;

import com.mgm.dto.Line;
import org.apache.commons.lang3.tuple.Pair;

import java.io.File;
import java.util.List;
import java.util.Map;

public interface CsvFinder {
	List<Line> findTop10(String file);
}
