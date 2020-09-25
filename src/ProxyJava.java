public class ProxyJava implements Work{
    private JavaDeveloper javaDeveloper;
    private String job;

    public ProxyJava(String job){
        this.job=job;
    }



    @Override
    public void doWork() {
        if (javaDeveloper == null) {
            javaDeveloper= new JavaDeveloper(job);
        }
        javaDeveloper.doWork();


    }
}