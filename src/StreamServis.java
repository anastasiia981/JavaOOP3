import java.util.List;

public class StreamServis {
    public void sort(List<TrainingStream> streamList){
        StreamComparator sortStream = new StreamComparator();
        streamList.sort(sortStream);
    }
}