package o_o.web;

import java.util.List;

import org.springframework.util.CollectionUtils;

import o_o.model.Menu;

public class MenuCache {
    	
	private List<Menu> menuCache = null;
	
	public List<Menu> getMenuList(){
		if(CollectionUtils.isEmpty(menuCache)){
			// TODO query
			menuCache = testData();
		}
		return menuCache;
	}
	
	public List<Menu> reloadMenuList(){
		menuCache = null;
		return getMenuList();
	}
	
	private List<Menu> testData(){
	    
		
		
		return menuCache;
	}

}
