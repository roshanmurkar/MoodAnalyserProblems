package main;

public class Main {
	public static void main(String[] args) {
		MoodFind moodAnalyser = new MoodFind();
		System.out.println(moodAnalyser.analyseMood("happy"));
		System.out.println(moodAnalyser.analyseMood("sad"));
		System.out.println(moodAnalyser.analyseMood("normal"));

	}
}