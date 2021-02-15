package com.hari;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.actions.DispatchAction;

import com.sumtotal.util.crypto.PBAESCipher;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionForward;

public class LinkAction extends Action {   
   
  
	@Override
    public ActionForward execute(ActionMapping mapping, ActionForm  form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        //request.setAttribute("name","sreehari");
		
		request.setAttribute("url", "http://localhost:9797/jasperserver-pro/flow.html");
		request.setAttribute("pp", createPreauthToken("Provide your own pass phrase","sreehari","Expense"));		
        return mapping.findForward("success");
    }
	
	private Object createPreauthToken(String key, String username, String org) {
		System.out.println("Key :"+ key + " username : "+ username+"org : "+org);
		PBAESCipher cipher = new PBAESCipher();
		cipher.setPassPhrase(key);
		String orginalString="u="+username+"|r=RS_ROLE_ADMINISTRATOR,RS_ROLE_SUPERVISOR,RS_ROLE_USER|o="+org;
		System.out.println(orginalString);
		String encryptedPP = cipher.encrypt(orginalString);
		System.out.println(encryptedPP);
		return encryptedPP;
	}

   
   
}