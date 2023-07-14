package com.gura.step01;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FortuneController {
	
	@RequestMapping("/fortune")
	public String fortune(HttpServletRequest request) {
		// ������ �
		String fortuneToday="�������� ���� ������ ������";
		// request scope �� ���信 �ʿ��� �����͸� ��´�.
		request.setAttribute("fortuneToday", fortuneToday );
		
		// /WEB-INF/views/fortune.jsp �������� forward �̵��ؼ� �����ϱ�
		return "fortune";
	}
	
	@RequestMapping("/fortune2")
	public ModelAndView fortune2() {
		// ������ �
		String fortuneToday="�������� ���� ������ ������";
		
		// HttpServletRequest ��ü ��ſ� ModelAndView ��ü�� �����ؼ�
		ModelAndView mView=new ModelAndView();
		// view page �� ������ ������ ��´�.
		mView.addObject("fortuneToday", fortuneToday);
		// view page �� ��ġ�� ��´�.
		mView.setViewName("fortune");
		// �𵨰� view page ������ ��� ����ִ� ModelAndView ��ü�� �������ָ� �Ȱ��� �����Ѵ�.
		return mView;
		
	}
	
	// ModelAndView �� �Ű������� �����ϸ� ������ �����ӿ�ũ�� �ϾƼ� ��ü���� �� �������� �־��ش�. 
	@RequestMapping("/fortune3")
	public ModelAndView fortune3(ModelAndView mView) {
		// ������ �
		String fortuneToday="�������� ���� ������ ������";
		
		// view page �� ������ ������ ��´�.
		mView.addObject("fortuneToday", fortuneToday);
		// view page �� ��ġ�� ��´�.
		mView.setViewName("fortune");
		// �𵨰� view page ������ ��� ����ִ� ModelAndView ��ü�� �������ָ� �Ȱ��� �����Ѵ�.
		return mView;
		
	}
	
}
