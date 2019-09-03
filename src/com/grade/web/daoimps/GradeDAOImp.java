package com.grade.web.daoimps;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

import com.grade.web.daos.GradeDAO;
import com.grade.web.domains.GradeBean;

public class GradeDAOImp implements GradeDAO{
	public static final String FILE_PATH= String.format("C:%sUsers%suser%seclipse-jee%sjee-gradesystem%sWebContent%sresources%stxt%s",File.separator
			,File.separator
			,File.separator
			,File.separator
			,File.separator
			,File.separator
			,File.separator
			,File.separator);

	@Override
	public void insertGrade(GradeBean param) {
		try {
			File file = new File(FILE_PATH+"grade.txt");
			@SuppressWarnings("resource")
			BufferedWriter writer = new BufferedWriter(new FileWriter(file,true));
			writer.write(String.format("%s,%s,%s,%s,%s,%s",param.getStudentNum(),param.getName(),param.getKor(),param.getEng(),param.getSoc(),param.getMath()));
			writer.newLine();
			writer.flush();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
