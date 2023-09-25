package in.ashokit.service;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import in.ashokit.request.SearchRequest;
import in.ashokit.response.SearchResponse;

public interface ReportService {

	public List<String> getUniquePlanNames();

	public List<String> getUniquePlanStatusChange();

	public List<SearchResponse> search(SearchRequest request);

	public void generateExcel(HttpServletResponse respone) throws IOException;

	public void generatePdf(HttpServletResponse response) throws Exception;



}
