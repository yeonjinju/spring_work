package com.gura.step01.member;

import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gura.step01.MemberDto;

@Controller
public class MemberController {
	@RequestMapping("/member/delete")
	public String delete(int num) {
		System.out.println(num+"�� ȸ���� �����մϴ�.");
		/*
		 * �����Ϸ�Ʈ ������ �Ҷ��� "redirect: ���� ��û �� ��� " �������� view page ������ �ۼ��ϸ� �ȴ�. 
		 *  redirect:/ == home
		 */
		return "redirect:/";
	}
	
	// "/member/insertform" ��û�� ó���� �޼ҵ� �����
	/*
	 *  [��û �Ķ���� �����ϴ� ��� 1]
	 *  HttpServletRequest ��ü�� Controller �޼ҵ�� ���޹޾Ƽ� ���� �����Ѵ�.
	 */
	
	
	// ������Ʈ ������ �����Ҷ� ������ �ʼ�"/" ������ "/" ���ʿ� 
	@RequestMapping("/member/insertform")
	// �޼ҵ���� �ǹ� ���� ���� ����(���� �Ȱ��� �ۼ�)
	public String insertform() {
		// ������ jsp �������� ��ġ�� �������ָ� �ȴ�.
		return "member/insertform";
	}
	@RequestMapping("/member/insert")
	public String insert(HttpServletRequest request) throws UnsupportedEncodingException {
		// �� ���۵Ǵ� �Ķ���� �����ϱ�
		int num=Integer.parseInt(request.getParameter("num"));
		String name=request.getParameter("name");
		String addr=request.getParameter("addr");
		
		System.out.println(num+"|"+name+"|"+addr);
		
		return "member/insert";
	}
	
	 	/*
	    *  [ ��û �Ķ���� �����ϴ� ��� 3 ]
	    *  
	    *  �Ķ���͸�� ������ �ʵ���� ������ �ִ� dto Ŭ���� type ��  �޼ҵ��� �Ű������� ������ ������
	    *  �ڵ����� �����ؼ� dto ��  ������ ���� setter �޼ҵ带 �̿��ؼ� ���� ����  �ش� dto ��ü�� 
	    *  �������� ���޵ȴ�.
	    *  
	    *  pulic class MemberDto{
	    *     private int num;  => <input name="num">
	    *     private String name; => <input name="name">
	    *     private String addr; => <input name="addr">
	    *  }
	    *  
	    */
	
	   @RequestMapping("/member/insert3")
	   public String insert3(MemberDto dto) {
	      
	      System.out.println(dto.getNum()+"|"+dto.getName()+"|"+dto.getAddr());
	      
	      return "member/insert";
	   }
	   
	   
	}   












