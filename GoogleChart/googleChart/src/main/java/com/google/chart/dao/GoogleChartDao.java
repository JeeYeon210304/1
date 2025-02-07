package com.google.chart.dao;

import java.util.List;

import com.google.chart.dto.GoogleChartDto;

public interface GoogleChartDao {

	String NAMESPACE = "RChartMapper.";
	
	public List<GoogleChartDto> chartData(String chartId);
	public int insert(GoogleChartDto dto);
	
}
