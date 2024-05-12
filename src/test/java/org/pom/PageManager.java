package org.pom;

public class PageManager {
private Pom_LoginPage p;
private Pom_SearchHotel s;
private Pom_HotelSelect h;
private Pom_HotelBook b;
private Pom_LastPage l;

public Pom_LoginPage getP() {
	if(p==null) 
	{
		p= new Pom_LoginPage();
		return p;
		}
	return p;
	}
public Pom_SearchHotel getS() {
	if(s==null) 
	{
		s= new Pom_SearchHotel();
		return s;
		}
	return s;
	}
public Pom_HotelSelect getH() {
	if(h==null) 
	{
		h= new Pom_HotelSelect();
		return h;
		}
	return h;
	}
public Pom_HotelBook getB() {
	if(b==null) 
	{
		b= new Pom_HotelBook();
		return b;
		}
	return b;
	}
public Pom_LastPage getL() {
	if(l==null) 
	{
		l= new Pom_LastPage();
		return l;
		}
	return l;
	}
}


