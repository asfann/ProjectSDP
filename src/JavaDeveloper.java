public class JavaDeveloper extends Team implements Work{
    private String job;

    public JavaDeveloper(String job){
        this.job=job;
        jo();
    }

    private void jo() {
        System.out.println("Java Develpoer is " + job);
    }

    @Override
    public void doWork() {
        System.out.println(job + " writing code");
    }
}
