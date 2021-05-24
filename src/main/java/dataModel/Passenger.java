package dataModel;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
//Domaine4. 2.
@Entity
@Table
public class Passenger {
	@Id
	@Column(name="name")
 private String name;
	@Column(name="pClass")
 private String pClass;
	@Column(name="age")
 private Double age;
	@Column(name="sex")
 private String sex;
	@Column(name="survived")
 private Integer survived;
 public String getSex() {
	return sex;
}
public void setSex(String sex) {
	this.sex = sex;
}

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getpClass() {
	return pClass;
}
public void setpClass(String pClass) {
	this.pClass = pClass;
}
public Double getAge() {
	return age;
}
public void setAge(Double age) {
	this.age = age;
}
public Integer getSurvived() {
	return survived;
}
public void setSurvived(Integer survived) {
	this.survived = survived;
}
@Override
public String toString() {
	return "Passenger [name=" + name + ", pClass=" + pClass + ", age=" + age + ", sex=" + sex + ", survived=" + survived
			+ "]";
}


}
