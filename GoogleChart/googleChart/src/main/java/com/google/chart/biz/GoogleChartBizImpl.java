package com.google.chart.biz;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.chart.dao.GoogleChartDao;
import com.google.chart.dto.GoogleChartDto;

@Service
public class GoogleChartBizImpl implements GoogleChartBiz {

	@Autowired
	private GoogleChartDao dao;
	
	@Override
	public List<GoogleChartDto> chartData(String chartId){
		return dao.chartData(chartId);
	}
	
	@Override
	public int insert(GoogleChartDto dto) {
		return dao.insert(dto);
	}

}
