public class Manager extends Team implements Work{
private String job;

public Manager(String job){
    this.job=job;
    jo();
}

    private void jo() {
        System.out.println("Manager is " + job);
    }

    @Override
    public void doWork() {
        System.out.println(job + " manage project");
    }


}
