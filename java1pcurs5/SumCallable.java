import java.util.concurrent.*;
import java.util.*;

public class SumCallable implements Callable<Integer> {
    private List<Integer> list;
    
    public SumCallable(List<Integer> list) {
        this.list = list;
    }

    @Override
    public Integer call() {
        return list.stream()
                   .mapToInt(nr -> nr)
                   .sum();
    }
}