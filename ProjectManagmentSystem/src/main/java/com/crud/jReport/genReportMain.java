package com.crud.jReport;

import java.net.URISyntaxException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;



public class genReportMain {
   
   public  void hello(String[] args) throws URISyntaxException {
	   genReport ob=new genReport();
	   ob.generate(232);
   }
}