import java.util.ArrayList;
import java.util.List;

public class Team {
    private List<Work> works = new ArrayList<Work>();
    public void addWork(Work work){
        works.add(work);
    }
    public void removeWork(Work work){
        works.remove(work);
    }
    public void createProject(){
        System.out.println("Team creates project");
        for(Work work: works){
            work.doWork();
        }
    }
}
