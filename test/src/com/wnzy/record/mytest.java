package com.wnzy.record;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class mytest {
	public static void main(String[] args) {
		// ����list���ϲ�����ʵ���������setRecord����
		List<Record> list = Record.setRecord();
		// ����collect���ͨ��groupingBy����Ȼ��ͨ��counting������ͳ������
		Map<String, Long> collect = list.stream()
				.collect(Collectors.groupingBy(Record::getLevel, Collectors.counting()));
		System.out.println(collect);
		// ���õڶ�������
		er();
		// ���õ�������
		san();
	}

	public static void er() {
		// ����list���ϲ�����ʵ���������setRecord����
		List<Record> users = Record.setRecord();
		// ����Seream��
		List<String> collect = users.stream().
		// ����filter���й���ɸѡ����getTeacher������ֵ������li���ж�map�����getStudent��ֵ��װ��һ����������
				filter(Record -> Record.getTeacher().indexOf("li") > -1).map(Record::getStudent)
				.collect(Collectors.toList());
		// ��ӡ
		System.out.println("����ʦ��ѧ��" + collect);

	}

	public static void san() {
		// ����list���ϲ�����ʵ���������setRecord����
		List<Record> users = Record.setRecord();
		// ����Seream�������浽һ����������
		Map<String, Map<String, List<Long>>> collect = users.stream().
		// ����groupingBy���鲢ͨ��getTeacher��������ֵ���з��鲢ͳһ����
				collect(Collectors.groupingBy(Record::getTeacher, Collectors.groupingBy(Record::getLevel,
						Collectors.collectingAndThen(Collectors.toList(), list1 -> {
							long count = list1.stream().count();
							// ����һ��Arrays��ͳһ����
							return Arrays.asList(count);

						}))));
		// ��ӡ
		System.out.println(collect);
	}
}
