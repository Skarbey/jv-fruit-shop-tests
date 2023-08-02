package core.basesyntax.service;

import java.util.List;

/**
 * Interface responsible for generating reports based on the fruit shop's data.
 * Contains a method List String generateReport()
 * that generates a report in the desired format as a list of strings.
 * Each string represents a line in the report.**/
public interface ReportService {
    List<String> generateReport();
}