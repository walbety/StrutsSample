package com.jwt.struts.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.jwt.struts.form.CustomerForm;

public class CustomerAction extends Action{
	
	@Override
	public ActionForward execute(ActionMapping mapping, 
            ActionForm form, HttpServletRequest request, 
            HttpServletResponse response) throws Exception {
		
		if(isCancelled(request)) {
			System.out.println("Cancel Operation Performed");
			return mapping.findForward("mainpage");
		}
		
		CustomerForm custForm = (CustomerForm) form;
		
		String firstName = custForm.getFirstName();
		String lastName = custForm.getLastName();
		
		System.out.println("Customer first name: " + firstName);
		System.out.println("Customer last name: " + lastName);
		
		
		ActionForward forward = mapping.findForward("success");
		return forward;
	}

}
