/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GraduateRequest;

import java.util.ArrayList;

/**
 *
 * @author ankithreddy
 */
public class GraduateRequestDirectory {
      
    ArrayList<GraduateRequest> graduateRequestList;
    
    public GraduateRequestDirectory(){
        this.graduateRequestList=new ArrayList<GraduateRequest>(); 
    }

    public ArrayList<GraduateRequest> getGraduateRequestList() {
        return graduateRequestList;
    }

    public void setGraduateRequestList(ArrayList<GraduateRequest> graduateRequestList) {
        this.graduateRequestList = graduateRequestList;
    }
    
//    public GraduateRequest createGraduateRequest(String id,Boolean gradreq,String mes){
//        GraduateRequest g = new GraduateRequest();
//        
//        //rentReq.setCustomer(customer);
//     
//        g.setGraduateStatus(gradreq);
//   
//        this.graduateRequestList.add(g);
//        return g;
//    }
}
