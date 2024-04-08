import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class TrainingStream extends Group implements Iterable<Student>{
    private int streamNum;
    private List<Group> groups;


    public TrainingStream(int streamNum) {
        this.streamNum = streamNum;
        this.groups = new ArrayList<>();
    }


    public void addGroup (Group group){
        this.groups.add(group);
    }


    public void removeGroup(Group studyGroup) {
        groups.remove(studyGroup);

    }


    public int getStreamNum() {
        return streamNum;
    }


    public List<Group> getGroups(){
        return groups;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("Поток ").append(streamNum).append(" из ").append(groups.size()).append(" групп").append("\n");
        for (Group group : groups) {
            result.append("Группа ").append(group.getGroupNumber()).append(" из ").append(group.getStudentList().size()).append(" человек").append("\n");
        }
        return result.toString();
    }
}