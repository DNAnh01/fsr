package persistence;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Table(name = "LoaiHang")

//Required: query --> JPQL (Java Persistence Query Language)
@NamedQueries(
		@NamedQuery(
				name = ItemGroup.Q_SELECT_ALL, 
				query = "SELECT ig FROM ItemGroup ig")
)
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class ItemGroup {
	
	public static final String Q_SELECT_ALL = "SELECT_ALL_ITEM_GROUPS";
	
	@Id
	@Column(name = "MaLH")
	private Integer id;
	@Column(name = "TenLH")
	private String name;
	// default: fetch LAZY
	@OneToMany(mappedBy = "itemGroup")
	private List<Item> items;
	
	public ItemGroup() {
	}
	
	public ItemGroup(Integer id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public ItemGroup(Integer id, String name, List<Item> items) {
		this.id = id;
		this.name = name;
		this.items = items;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

//	@Override
//	public boolean equals(Object obj) {
//		if(this == obj) {
//			return true;
//		}
//		if(!(obj instanceof ItemGroup)) {
//			return false;
//		}
//		ItemGroup that = (ItemGroup)obj;
//		return (getId() == that.getId()) && (getName() == that.getName()); 
//	}
//	
//	@Override
//	public int hashCode() {
//		return Objects.hash(getId(), getName());
//	}

	@Override
	public String toString() {
		return "ItemGroup [id=" + id + ", name=" + name + "]";
	}

	
}