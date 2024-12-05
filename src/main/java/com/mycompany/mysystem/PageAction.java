package com.mycompany.mysystem;



import com.mycompany.mysystem.services.Service;
import com.opensymphony.xwork2.ActionSupport;

public class PageAction extends ActionSupport {

    @SuppressWarnings("unused")
    private Service service;
    @Override
    public String execute() throws Exception {
        
        return SUCCESS;
    }
    public void setService(Service service){
        this.service = service;
    }
}
