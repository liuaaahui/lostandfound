package com.example.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;
import java.util.Calendar;
import java.util.UUID;

@RestController
@RequestMapping("/upload")
public class PictureController {
    @RequestMapping("/add")
    @ResponseBody
    public String handleFileUpload(@RequestParam("file") MultipartFile file) {
//        String path = "C:\\Users\\Administrator\\Desktop\\img";
        String path = "C:\\Users\\Administrator\\Desktop\\lostfound\\static\\img";
        String fileName = file.getOriginalFilename();
        Calendar currTime = Calendar.getInstance();
        String time = String.valueOf(currTime.get(Calendar.YEAR))+String.valueOf((currTime.get(Calendar.MONTH)+1));
        String suffix = fileName.substring(file.getOriginalFilename().lastIndexOf("."));
        suffix = suffix.toLowerCase();
        if(suffix.equals(".jpg") || suffix.equals(".jpeg") || suffix.equals(".png")){
            fileName = UUID.randomUUID().toString()+suffix;
            File targetFile = new File(path, fileName);
            if(!targetFile.getParentFile().exists()){
                targetFile.getParentFile().mkdirs();
            }
            long size = 0;
            try {
                file.transferTo(targetFile);
                size = file.getSize();
            } catch (Exception e) {
                e.printStackTrace();
                return"上传失败";
            }
            String fileUrl="/static";
            fileUrl = fileUrl + "/img/" + fileName;
            return fileUrl;
        }else{
            return "上传失败";
        }
    }
}
