package com.gura.spring04.file.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.gura.spring04.file.dto.FileDto;
import com.gura.spring04.file.service.FileService;

@Controller
public class FileController {
	
	@Autowired
	private FileService service;
	
	@RequestMapping("/file/list")
	public String list(HttpServletRequest request) {
		
		service.getList(request);
		
		return "file/list";
	}
	
	@RequestMapping("/file/upload_form")
	public String uploadForm() {
		
		return "file/upload_form";
	}
	
	// 파일 업로드 요청처리 
	@RequestMapping("/file/upload")
	public ModelAndView upload(FileDto dto, ModelAndView mView, HttpServletRequest request) {
		// FileDto 에는  폼전송되는 title 과 myFile 이 들어 있다.
		service.saveFile(dto, mView, request);
		mView.setViewName("file/upload");
		return mView;
	}
	
	@RequestMapping("/file/download")
	public ModelAndView download(int num, ModelAndView mView) {
		// num 은 다운로드 해줄 파일의 번호(PK)
		service.getFileData(num, mView);
		// 응답을 할 bean 의 이름을 설정 
		mView.setViewName("fileDownView");
		return mView;
	}
	
	@RequestMapping("/file/delete")
	public ModelAndView delete(int num, ModelAndView mView, HttpServletRequest request) {
		service.deleteFile(num, request);
		mView.setViewName("redirect:/file/list");
		return mView;
	}	
}






