package o_o.model;

import java.util.List;

public class Menu extends BaseEntity {

	private static final long serialVersionUID = -2402443595615345570L;
	
	public Long id;
	public String name;
	public List<Submenu> Submenu;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Submenu> getSubmenu() {
		return Submenu;
	}
	public void setSubmenu(List<Submenu> submenu) {
		Submenu = submenu;
	}
}
