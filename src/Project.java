public class Project {
    Team team = new Team();
    Work Java = new JavaDeveloper("Asfa");
    Work Cpp = new CppDeveloper("Dimka");
    Work Manager = new Manager("Rakhat");
    public void run(){

        team.addWork(Java);
        team.addWork(Cpp);
        team.addWork(Manager);
        team.createProject();
    }
}