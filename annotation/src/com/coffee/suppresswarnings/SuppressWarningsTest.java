package com.coffee.suppresswarnings;

import java.util.ArrayList;
import java.util.List;
public class SuppressWarningsTest {
	
	@SuppressWarnings("unchecked")  
	public void addItems1(String item){  
	  @SuppressWarnings("rawtypes")  
	   List items = new ArrayList();  
	   items.add(item);  
	}  
	//示例2——抑制多类型的警告：

	//[java] view plain copy
	@SuppressWarnings(value={"unchecked", "rawtypes"})  
	public void addItems2(String item){  
	   List items = new ArrayList();  
	   items.add(item);  
	}  
	//示例3——抑制所有类型的警告：
	//[java] view plain copy
	@SuppressWarnings("all")  
	public void addItems3(String item){  
	   List items = new ArrayList();  
	   items.add(item);  
	}  
	

}
