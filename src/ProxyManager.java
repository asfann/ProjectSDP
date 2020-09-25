public class ProxyManager implements Work{
    private Manager manager;
    private String job;

    public ProxyManager(String job){
        this.job=job;
    }

    @Override
    public void doWork() {
        if (manager==null){
            manager = new Manager(job);
        }
            manager.doWork();
            }
}
