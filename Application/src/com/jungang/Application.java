package com.jungang;

import java.util.Scanner;

public class Application {
	public static void main(String[] args) {
		
		
		/*
		 * Student[] sArr = new Student[3];
		 * 
		 * sArr[0] = new Student(3, "��ǻ��","���ϴ�",20,163,50); sArr[1] = new Student(2,
		 * "���","������",24,178,65); sArr[2] = new Student(2, "������","��ö��",23,183,70);
		 * 
		 * for(int i=0;i<sArr.length;i++){
		 * System.out.println("�̸�:\t"+sArr[i].getName()+"\n����:\t"+sArr[i].getAge()+
		 * "\nŰ:\t"+sArr[i].getHeight()+"\n������:\t"+sArr[i].getWeight()+"\n�г�:\t"+sArr[i]
		 * .getGrade()+"\n����:\t"+sArr[i].getMajor());
		 * System.out.println("===================="); }
		 */
		Scanner sc = null;
		Employee e1 = null;
		Employee[] eArr = new Employee[10];
		int count = 0;
		
		while(true) {
			e1 = new Employee(); // �����ڷ� �غ���
			sc = new Scanner(System.in);
			System.out.println("�̸��� �Է��ϼ���");
			e1.setName(sc.next());
			System.out.println("���̸� �Է��ϼ���");
			e1.setAge(sc.nextInt());
			System.out.println("Ű�� �Է��ϼ���");
			e1.setHeight(sc.nextDouble());
			System.out.println("�����Ը� �Է��ϼ���");
			e1.setWeight(sc.nextDouble());
			System.out.println("�޿��� �Է��ϼ���");
			e1.setSalary(sc.nextInt());
			System.out.println("�μ��� �Է��ϼ���");
			e1.setDept(sc.next());
			eArr[count] = e1;
			count++;
			System.out.println(count+"��° ����� �Է��Ͽ����ϴ�.\n");
			System.out.println((count+1)+"��° ����� �߰��մϱ�?");
			String how = sc.next();
			if(how.equals("Y")||how.equals("y")) {
				continue;
			}else {
				System.out.println("��� �Է��� �����մϴ�.\n");
				System.out.println("�Էµ� ��� ����� ������ �����ϴ�.");
				for(int i=0;i<count;i++) {
					System.out.println("===============================");
					System.out.println("�̸�: "+eArr[i].getName()+"\n����: "+eArr[i].getAge()+"\nŰ: "+eArr[i].getHeight()+"\n������: "+eArr[i].getWeight()+"\n�޿�: "+eArr[i].getSalary()+"\n�μ�: "+eArr[i].getDept());
					System.out.println("===============================");
				
				}
			}
			
			sc.close();
			break;
		}
		
		
		
		
		
		
	
		}
	}

