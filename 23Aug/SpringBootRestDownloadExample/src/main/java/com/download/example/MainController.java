package com.download.example;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.InputStreamResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;


@RestController
public class MainController {
	
	 //upload the selected file in server
   // @RequestMapping(value = "/upload", method = RequestMethod.POST, consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    @PostMapping(value = "/upload",consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public String fileUpload(@RequestParam("file") MultipartFile file) {
          String result = "File was uploaded successfully";
            
     try {
    	 	//get name of original file
              File convertFile = new File("E://temp/"+file.getOriginalFilename());
             //create a new empty file with same name
              convertFile.createNewFile();
              //open that file in write mode
              FileOutputStream fout = new FileOutputStream(convertFile);
              //get all contents from user file to server file
              fout.write(file.getBytes());
              fout.close();
              
      } catch (IOException iex) {
                    result = "Error " + iex.getMessage();
      } 
       
     return result;
      
   
}
    
		
// download file
    
    @GetMapping(value = "/download")   
    public ResponseEntity<Object> downloadFile() throws IOException  {
        // server location of file which user wants to download   
    	String fileName = "E://temp/abc.txt";
    	
    	//Create classloader object-- to load file in memory
    	ClassLoader classLoader = new MainController().getClass().getClassLoader();
    	// Get file from physical ststem to memory by using Classloader
    	File file = new File(classLoader.getResource(fileName).getFile()); 
    	//Read your file
    	   	
    	InputStreamResource resource = new InputStreamResource(new FileInputStream(file));
     
    	//Prepare Header to send it to client side
    	HttpHeaders headers = new HttpHeaders();
    	//providing information about data type
        headers.add("Content-Disposition", String.format("attachment; filename=\"%s\"", file.getName()));
        headers.add("Cache-Control", "no-cache, no-store, must-revalidate");
        headers.add("Pragma", "no-cache");
        headers.add("Expires", "0");
        
     
        //prepare responseentity (header-- file information, body-- conatins data of file)
        ResponseEntity<Object> responseEntity = ResponseEntity.ok().headers(headers).contentLength(file.length())
        		.contentType(MediaType.parseMediaType("application/txt")).body(resource);
        
     return responseEntity;
    }
	
}

    
    



	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	    
        


       