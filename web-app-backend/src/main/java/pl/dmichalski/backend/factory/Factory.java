package pl.dmichalski.backend.factory;

import java.util.Collection;
import java.util.List;

import static java.util.stream.Collectors.toList;
import static org.apache.commons.collections4.CollectionUtils.emptyIfNull;

public interface Factory<T, S> {

    T create(S source);

    default List<T> createList(Collection<S> sourceList) {
        return emptyIfNull(sourceList).stream()
                .map(this::create)
                .collect(toList());
    }
}
