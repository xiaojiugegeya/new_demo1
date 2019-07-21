package com.wnzy.record;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class mytest {
	public static void main(String[] args) {
		// 创建list集合并调用实体类里面的setRecord方法
		List<Record> list = Record.setRecord();
		// 根据collect组合通过groupingBy分组然后通过counting方法来统计人数
		Map<String, Long> collect = list.stream()
				.collect(Collectors.groupingBy(Record::getLevel, Collectors.counting()));
		System.out.println(collect);
		// 调用第二个方法
		er();
		// 调用第三方法
		san();
	}

	public static void er() {
		// 创建list集合并调用实体类里面的setRecord方法
		List<Record> users = Record.setRecord();
		// 调用Seream流
		List<String> collect = users.stream().
		// 根据filter进行过滤筛选根据getTeacher传来的值并根据li来判断map里面的getStudent的值并装在一个集合里面
				filter(Record -> Record.getTeacher().indexOf("li") > -1).map(Record::getStudent)
				.collect(Collectors.toList());
		// 打印
		System.out.println("李老师的学生" + collect);

	}

	public static void san() {
		// 创建list集合并调用实体类里面的setRecord方法
		List<Record> users = Record.setRecord();
		// 调用Seream流并储存到一个集合里面
		Map<String, Map<String, List<Long>>> collect = users.stream().
		// 根据groupingBy分组并通过getTeacher传过来的值进行分组并统一计数
				collect(Collectors.groupingBy(Record::getTeacher, Collectors.groupingBy(Record::getLevel,
						Collectors.collectingAndThen(Collectors.toList(), list1 -> {
							long count = list1.stream().count();
							// 返回一个Arrays并统一计数
							return Arrays.asList(count);

						}))));
		// 打印
		System.out.println(collect);
	}
}
