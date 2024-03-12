package TelevisionPrograms;

public class TelevisionProgram {
    private String name;
    private int duration;

    public TelevisionProgram(String programName, int programDuration){
        this.name = programName;
        this.duration = programDuration;
    }

    public String getName() {
        return name;
    }

    public int getDuration() {
        return duration;
    }

    public boolean isAwesome() {
        return this.name.contains("MasterChef");
    }

    public String toString() {
        return this.name + ", " + this.duration + " minutes";
    }

}
