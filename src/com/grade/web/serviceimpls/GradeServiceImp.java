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
		param.setStudentNum(createStudentNum(param));
		dao.insertGrade(param);
		
	}
	public String createStudentNum(GradeBean param) {
		Date date= new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
		String studentNum="";
		String ssn = param.getSsn();
		Random ran= new Random();
		int temp = ran.nextInt(999)+1;
		String s= String.format("%03d",temp);
		studentNum = sdf.format(date)+"-"+ssn.substring(7,8)+s;
		
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
