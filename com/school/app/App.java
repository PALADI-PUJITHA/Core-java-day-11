package com.school.app;
import com.school.management.School;
import com.school.staff.Principal;
public class App {
	public static void main(String args[]) {
		School school=new School();
		school.setName("Narayana High School");
		school.setLocation("Atmakur");
		Principal princ=new Principal();
		princ.setPrincipalName("Raja Shekhar");
		princ.setExperienceYears(25);
		school.showSchoolInfo();
		System.out.println();
		princ.showPrincipalInfo();
	}
}
