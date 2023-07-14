package com.gura.step01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/*
 *  JSON ���ڿ� �����ϴ� ���
 *  
 *  1. pom.xml �� jackson-databind dependency �� �߰��Ѵ�.
 *  2. ��Ʈ�ѷ� �޼ҵ忡 @ResponseBody ������̼��� �����ش�.
 *  3. Dto, List, Map ���� ��Ʈ�ѷ����� �������ָ� �ش� ��ü�� ��� ������ json ���� �����Ǿ ����ȴ�.
 *  
 */

@Controller
public class TestController {
	@ResponseBody
	@RequestMapping("/test/json1")
	public String json1() {
		return "{\"num\":1, \"name\":\"kim\", \"addr\":\"seoul\"}";
	}
	
	@ResponseBody
	@RequestMapping("/test/json2")
	public MemberDto json2() {
		// DB���� �о�� ȸ��������� ��������
		MemberDto dto=new MemberDto();
		dto.setNum(2);
		dto.setName("�ذ�");
		dto.setAddr("������");
		
		return dto;
	}
	
	@ResponseBody
	@RequestMapping("/test/json3")
	public Map<String, Object> json3() {
		Map<String, Object> map=new HashMap<>();
		map.put("num", 3);
		map.put("name", "������");
		map.put("addr", "������");
		return map;
	}
	
	@ResponseBody
	@RequestMapping("/test/json4")
	public List<String> json4(){
		List<String> names=new ArrayList<>();
		names.add("�豸��");
		names.add("�ذ�");
		names.add("������");
		
		return names;
	}

	@ResponseBody
	@RequestMapping("/test/json5")
	public List<MemberDto> jaon5(){
		List<MemberDto> list=new ArrayList<>();
		list.add(new MemberDto(1, "�豸��", "�뷮��"));
		list.add(new MemberDto(2, "�ذ�", "��ŵ�"));
		list.add(new MemberDto(3, "������", "������"));
		
		return list;
	}
	
	@ResponseBody
	@RequestMapping("/test/json6")
	public List<Map<String, Object>> json6(){
		List<Map<String, Object>> list = new ArrayList<>();
		Map<String, Object> map1=new HashMap<>();
		map1.put("num", 1);
		map1.put("name", "�豸��");
		map1.put("addr", "�뷮��");
		
		Map<String, Object> map2=new HashMap<>();
		map2.put("num", 2);
		map2.put("name", "�ذ�");
		map2.put("addr", "��ŵ�");
		
		Map<String, Object> map3=new HashMap<>();
		map3.put("num", 3);
		map3.put("name", "������");
		map3.put("addr", "������");
		
		list.add(map1);
		list.add(map2);
		list.add(map3);
		
		return list;
	}
	
	
	/*
	 *  Dto or Map => { }
	 *  List => [ ]
	 *  List<String> => ["xxx",:"xxx":....]
	 *  List<Dto> or List<Map> => [{}, {}, ...]
	 *  
	 */
	
}







