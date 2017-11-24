package fi.academy;

import org.springframework.data.repository.PagingAndSortingRepository;

public interface SortRepository extends PagingAndSortingRepository <Country,String> {

}
