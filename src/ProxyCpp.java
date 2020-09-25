public class ProxyCpp implements Work{
    private CppDeveloper cppDeveloper;
    private String job;
    public ProxyCpp(String job){
        this.job=job;
    }


    @Override
    public void doWork() {
        if (cppDeveloper==null){
            cppDeveloper= new CppDeveloper(job);
        }
        cppDeveloper.doWork();

    }
}
