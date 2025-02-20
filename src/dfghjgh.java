
import com.codegym.CollectionUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class CollectionUtilsAdapter implements CollectionOperations {
    private CollectionUtils collectionUtils;

    public CollectionUtilsAdapter() {
        collectionUtils = new CollectionUtils();
    }

    @Override
    public int findMax(Set<Integer> numbers) {
        List<Integer> list = new ArrayList<>(numbers);
        return collectionUtils.findMax(list);
    }
}
