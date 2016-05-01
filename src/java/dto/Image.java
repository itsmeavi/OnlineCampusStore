/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

import com.opensymphony.xwork2.ActionSupport;
import java.io.File;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.apache.commons.io.FileUtils;
import org.apache.struts2.interceptor.ServletRequestAware;

/**
 *
 * @author AYSHANI
 */
public class Image extends ActionSupport implements ServletRequestAware{
    
    
    private File imageUpload;
    private String imageUploadContentType;
    private String imageUploadFileName;
    private HttpServletRequest servletRequest;

    /**
     * @return the imageUpload
     */
    
    /**
     * @return the imageUploadContentType
     */
    public String getImageUploadContentType() {
        return imageUploadContentType;
    }

    /**
     * @param imageUploadContentType the imageUploadContentType to set
     */
    public void setImageUploadContentType(String imageUploadContentType) {
        this.imageUploadContentType = imageUploadContentType;
    }

    /**
     * @return the imageUploadFileName
     */
    public String getImageUploadFileName() {
        return imageUploadFileName;
    }

    /**
     * @param imageUploadFileName the imageUploadFileName to set
     */
    public void setImageUploadFileName(String imageUploadFileName) {
        this.imageUploadFileName = imageUploadFileName;
    }
    
    
    public String execute(){
        
        try {
            
             HttpSession srvltSession = this.servletRequest.getSession();
             ServletContext srvlContxt = srvltSession.getServletContext();// .getServletContext()
                    String filePath = srvlContxt.getRealPath("/").concat("userimages");
            System.out.println("Image Location:" + filePath);
            File destFile = new File(filePath, this.imageUploadFileName);
            FileUtils.copyFile(this.imageUpload, destFile);
            
		
       
            
        }catch(Exception e){
            System.err.println(e);
            return ERROR;
        }
	return SUCCESS;
		
	}
	
	public String display() {
		return NONE;
	}

    /**
     * @return the fileUpload
     */
   

    /**
     * @return the imageUpload
     */
    public File getImageUpload() {
        return imageUpload;
    }

    /**
     * @param imageUpload the imageUpload to set
     */
    public void setImageUpload(File imageUpload) {
        this.imageUpload = imageUpload;
    }

    /**
     * @return the destPath
     */
   
    
    
    public void setServletRequest(HttpServletRequest servletRequest) {
        this.servletRequest = servletRequest;
 
    }

    
    
}
