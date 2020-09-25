public class CppDeveloper extends Team implements Work{
    private String job;

    public CppDeveloper(String job){
        this.job=job;
        jo();
    }

    private void jo() {
        System.out.println("Cpp Developer is " + job);
    }

    @Override
    public void doWork() {
        System.out.println(job + " writes code");
    }
}
