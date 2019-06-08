package com.app.hr;

import com.app.emp.Employee;

public class HR {
public void manageEmployees() {
	Employee.tnrName="Nag";
	Employee e1=new Employee();
	e1.id=101;
	e1.name="John";
	e1.teach();
	e1.listenAndWork();
}
}
