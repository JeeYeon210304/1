package com.google.chart.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.chart.biz.GoogleChartBiz;
import com.google.chart.dao.GoogleChartDao;
import com.google.chart.dto.GoogleChartDto;
import com.google.gson.Gson;

@Controller
public class HomeController {
	
	@Autowired
	private GoogleChartBiz biz;
	
	@Autowired
	private GoogleChartDao dao;
	
	@RequestMapping(value="/chartData.do", method=RequestMethod.GET)
	@ResponseBody
	public Map<String, GoogleChartDto> chartData(String chartId) {
		
		Map map = new HashMap();
		List<GoogleChartDto> list = biz.chartData(chartId);
		map.put("map", list);
		
		return map;
	}
	
	@RequestMapping("/readingTimeInsert.do")
	public String chartInsert(GoogleChartDto dto) {
		
		if(biz.insert(dto) > 0) {
			return "home";
		}
		return "home";
	}
	
}






















