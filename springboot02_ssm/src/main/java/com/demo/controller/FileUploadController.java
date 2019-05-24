package com.demo.controller;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

//表示该类下的方法的返回值会自动做json格式的转换
@RestController
public class FileUploadController {
	
	@RequestMapping("fileUploadController")
	public Map<String, Object> fileLoad(MultipartFile filename) throws Exception{
		filename.transferTo(new File("f:/"+filename.getOriginalFilename()));
		Map<String, Object> map = new HashMap<>();
		map.put("msg", "ok");
		return map;
	}
}
