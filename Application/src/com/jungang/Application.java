package com.jungang;

import java.util.Scanner;

public class Application {
	public static void main(String[] args) {
		
		
		/*
		 * Student[] sArr = new Student[3];
		 * 
		 * sArr[0] = new Student(3, "컴퓨터","김하늘",20,163,50); sArr[1] = new Student(2,
		 * "목공","유개똥",24,178,65); sArr[2] = new Student(2, "디자인","김철수",23,183,70);
		 * 
		 * for(int i=0;i<sArr.length;i++){
		 * System.out.println("이름:\t"+sArr[i].getName()+"\n나이:\t"+sArr[i].getAge()+
		 * "\n키:\t"+sArr[i].getHeight()+"\n몸무게:\t"+sArr[i].getWeight()+"\n학년:\t"+sArr[i]
		 * .getGrade()+"\n전공:\t"+sArr[i].getMajor());
		 * System.out.println("===================="); }
		 */
		Scanner sc = null;
		Employee e1 = null;
		Employee[] eArr = new Employee[10];
		int count = 0;
		
		while(true) { // 생성자로 해보자
			sc = new Scanner(System.in);
			System.out.println("이름을 입력하세요");
			String name= (sc.next());
			System.out.println("나이를 입력하세요");
			int age = (sc.nextInt());
			System.out.println("키를 입력하세요");
			double height = (sc.nextDouble());
			System.out.println("몸무게를 입력하세요");
			double weight = (sc.nextDouble());
			System.out.println("급여를 입력하세요");
			int salary = (sc.nextInt());
			sc.nextLine();
			System.out.println("부서를 입력하세요");
			String dept = (sc.nextLine());
			e1 = new Employee(name,age,height,weight,salary,dept);
			eArr[count] = e1;
			count++;
			System.out.println(count+"번째 사원을 입력하였습니다.\n");
			System.out.println((count+1)+"번째 사원을 추가합니까?");
			String how = sc.next();
			if(how.equals("Y")||how.equals("y")) {
				continue;
			}else {
				System.out.println("사원 입력을 종료합니다.\n");
				System.out.println("입력된 사원 목록은 다음과 같습니다.");
				for(int i=0;i<count;i++) {
					System.out.println("===============================");
					System.out.println("이름: "+eArr[i].getName()+"\n나이: "+eArr[i].getAge()+"\n키: "+eArr[i].getHeight()+"\n몸무게: "+eArr[i].getWeight()+"\n급여: "+eArr[i].getSalary()+"\n부서: "+eArr[i].getDept());
					System.out.println("===============================");
				
				}
			}
			
			sc.close();
			break;
		}
		
		
		
		
		
		
	
		}
	}

