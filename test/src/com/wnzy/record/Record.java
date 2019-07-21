package com.wnzy.record;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Record {
   //创建三个元素level,teacher,student,并get，set创建有参无参
	private String level;
	private  String teacher;
    private String student;
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	public String getTeacher() {
		return teacher;
	}
	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}
	public String getStudent() {
		return student;
	}
	public void setStudent(String student) {
		this.student = student;
	}
	@Override
	public String toString() {
		return "Record [level=" + level + ", teacher=" + teacher + ", student=" + student + "]";
	}
	public Record(String level, String teacher, String student) {
		
		this.level = level;
		this.teacher = teacher;
		this.student = student;
	}
	public Record() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * 创建一个代码多的集合并复制
	 * @return
	 */
	public static List<Record> setRecord(){
		List<Record> records=new ArrayList<Record>();
		Record record=new Record();
		record.setLevel("L1");
		record.setStudent("s1");
		record.setTeacher("li");
		records.add(record);
		Record record1=new Record();
		record1.setLevel("L1");
		record1.setStudent("s2");
		record1.setTeacher("wang");
		records.add(record1);
		Record record2=new Record();
		record2.setLevel("L1");
		record2.setStudent("s3");
		record2.setTeacher("wang");
		records.add(record2);
		Record record3=new Record();
		record3.setLevel("L2");
		record3.setStudent("s4");
		record3.setTeacher("li");
		records.add(record3);
		Record record4=new Record();
		record4.setLevel("L2");
		record4.setStudent("s5");
		record4.setTeacher("li");
		records.add(record4);
		Record record5=new Record();
		record5.setLevel("L2");
		record5.setStudent("s6");
		record5.setTeacher("wang");
		records.add(record5);
		Record record6=new Record();
		record6.setLevel("L3");
		record6.setStudent("s7");
		record6.setTeacher("wang");
		records.add(record6);
		Record record7=new Record();
		record7.setLevel("L3");
		record7.setStudent("s8");
		record7.setTeacher("wang");
		records.add(record7);
		return records;
	}
	/**
	 * 创建一个简单的集合
	 * 
	 */
//	List<Record> list=new ArrayList<Record>(8);
//	list.add(new Record("L1","Li","S1"));
//	list.add(new Record("L1","Wang","S2"));
//	list.add(new Record("L1","Wang","S3"));
//	list.add(new Record("L2","Li","S4"));
//	list.add(new Record("L2","Li","S5"));
//	list.add(new Record("L2","Wang","S6"));
//	list.add(new Record("L3","Wang","S7"));
//	list.add(new Record("L3","Wang","S8"));
//	public static void main(String[] args) {
//		List<Record> users=setRecord();
//		List<String> collect = users.stream().
//				filter(Record ->Record.getTeacher().indexOf("li") >-1).map(Record::getStudent).collect(Collectors.toList());
//		
//			System.out.println("李老师的学生"+collect);
		
//				filter(Record ->Record.getLevel().indexOf("L1")>-1 ||Record.getTeacher().indexOf("li")>-1 ).collect(Collectors.toList());
//		collect.stream().forEach(Record ->{
//			System.out.println(Record.getLevel()+"老师下的学生名"+Record.getStudent()+Record.getTeacher());
//		
//		});
	//}
}
