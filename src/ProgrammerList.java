import java.util.List;

public class ProgrammerList {
    private static List<Programmer> programmerList;
    private static int size = 0;

    public static void add(Programmer programmer){
       ProgrammerList.add(programmer);
    }

    @Override
    public String toString() {
        String result;

        for (int i = 0; i < programmerList.size(); i++) {
            result+= programmerList.get(i).toString() + '/';
        }

        return result;
    }

    public List<Programmer> getAllProgrammers(){
        return programmerList;
    }
public static Programmer findProgrammer(Task task){
    for (int i = 0; i < programmerList.size(); i++) {
        if (programmerList.get(i).findTask(task))
            return programmerList.get(i);
    }
        return  null;
}
}

