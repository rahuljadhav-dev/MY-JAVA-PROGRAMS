package com.polymorphism.tasks;

public class Attendee {
	public static void main(String[] args) {
		AttendLecture a=new AttendLecture();
		a.Info();
		a.Info("Recording", "Rahul", true, false);
		a.Info(2);
		a.Info("Kunal", true, false, "Offline");
		a.Info("Shubham", true, "Recording", false);
	}

}
