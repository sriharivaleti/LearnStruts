/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.vaannila;

import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.actions.DispatchAction;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionForward;
import org.apache.struts.util.LabelValueBean;

/**
 *
 * @author eswar@vaannila.com
 */
public class InputAction extends DispatchAction {
    
    private final static String SUCCESS = "success";
    
    public ActionForward populate(ActionMapping mapping, ActionForm  form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        ArrayList countryList = new ArrayList();
        ArrayList stateList = new ArrayList();
        InputForm inputForm = (InputForm) form;

        countryList.add(new CountryData("1", "USA"));
        countryList.add(new CountryData("2", "Canada"));
        countryList.add(new CountryData("3", "Mexico"));

        stateList.add(new LabelValueBean("New York", "1"));
        stateList.add(new LabelValueBean("California", "2"));
        stateList.add(new LabelValueBean("Los Angeles", "3"));

        inputForm.setCountryList(countryList);
        inputForm.setStateList(stateList);

        return mapping.findForward(SUCCESS);
    }

    public ActionForward save(ActionMapping mapping, ActionForm  form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        
        return mapping.findForward(SUCCESS);
    }
}