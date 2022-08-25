package org.edu;

public class Education extends Medicine {
public void eduUg() {
	System.out.println("Ug");
}
public void eduPg() {
	System.out.println("Pg");
}
public static void main(String[] args) {
	Education e = new Education();
	e.eduUg();
	e.eduPg();
	e.bsc();
	e.bed();
	e.ba();
	e.bba();
	e.eng1();
	e.eng2();
	e.mbbs();
	e.physiyo();
	e.dental();
}
}