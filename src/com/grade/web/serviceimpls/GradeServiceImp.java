package com.grade.web.serviceimpls;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import com.grade.web.daoimps.GradeDAOImp;
import com.grade.web.daos.GradeDAO;
import com.grade.web.domains.GradeBean;
import com.grade.web.services.GradeService;

public class GradeServiceImp implements GradeService {
	private GradeDAO dao;
	
	public GradeServiceImp() {
		dao= new GradeDAOImp();
	}

	@Override
	public void creatGrade(GradeBean param) {
	
		
	}
	public String createStudentNum(GradeBean param) {
	
	
		String studentNum="";
	
		
		return studentNum;
	}
	
	public int createAvg(GradeBean param) {
		int result =0;
		
		
		int eng=Integer.parseInt(param.getEng());
		int kor=Integer.parseInt(param.getKor());
		int math=Integer.parseInt(param.getMath());
		int soc = Integer.parseInt(param.getSoc());
		result = (eng+kor+math+soc)/4;

		return result;
		
	
		
		
	}
	
	
	

}
