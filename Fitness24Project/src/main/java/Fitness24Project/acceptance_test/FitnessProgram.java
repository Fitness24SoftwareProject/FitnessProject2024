package Fitness24Project.acceptance_test;

public class FitnessProgram {
    private String title;
    private int duration;
    private String difficulty;
    private String goals;
    private double price;
    int no;

    // Constructor
    public FitnessProgram(String title, int duration2, String difficulty, String goals, double price) {
        this.title = title;
        this.duration = duration2;
        this.difficulty = difficulty;
        this.goals = goals;
        this.price = price;
    }

    // Getters and Setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int i) {
        this.duration = i;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    public String getGoals() {
        return goals;
    }

    public void setGoals(String goals) {
        this.goals = goals;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Optionally, you can override toString() method for better printing of objects
    @Override
    public String toString() {
        return "FitnessProgram{" +
               "title='" + title + '\'' +
               ", duration=" + duration +
               ", difficulty='" + difficulty + '\'' +
               ", goals='" + goals + '\'' +
               ", price=" + price +
               '}';
    }

	public String getProgramName() {
		// TODO Auto-generated method stub
		return null;
	}
}

