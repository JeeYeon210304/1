package com.google.chart.biz;

import java.util.List;

import com.google.chart.dto.GoogleChartDto;

public interface GoogleChartBiz {

	public List<GoogleChartDto> chartData(String chartId);
	public int insert(GoogleChartDto dto);
	
}
