package com.labs.lab1;

public class Main {

	public static void executeFirstPart() {
		Monitor firstMonitor = new Monitor("red", 40, 70, 1920, 1080);
		firstMonitor.color = "blue";

		Monitor secondMonitor = new Monitor("green", 70, 32, 1280, 720);
		System.out.println(firstMonitor == secondMonitor);
	}

	public static void executeSecondPart() {
		University uni1 = new University("TUM", 1964);
		University uni2 = new University("Harvard", 1636);
		University uni3 = new University("SRU", 1732);

		uni1.addStudent(new Student("Ion", 20, 8));
		uni1.addStudent(new Student("Sergiu", 21, 9));
		uni1.addStudent(new Student("Grecu", 20, 7));

		uni2.addStudent(new Student("Ion", 20, 8));
		uni2.addStudent(new Student("Sergiu", 21, 9));
		uni2.addStudent(new Student("Grecu", 20, 7));

		uni3.addStudent(new Student("Ion", 20, 8));
		uni3.addStudent(new Student("Sergiu", 21, 9));
		uni3.addStudent(new Student("Grecu", 20, 10));

		System.out.print("First university: ");
		System.out.println(uni1.getAverageMedia());
		System.out.print("Second university: ");
		System.out.println(uni2.getAverageMedia());
		System.out.print("Third university: ");
		System.out.println(uni3.getAverageMedia());

		System.out.print("All universities ");
		System.out.println(University.getCrossUniversityAverageMedia());
	}

    public static void main(String[] args) {
		executeSecondPart();
    }
}

