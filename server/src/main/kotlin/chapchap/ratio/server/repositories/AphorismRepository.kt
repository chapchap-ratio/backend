package chapchap.ratio.server.repositories

import chapchap.ratio.server.model.AphorismDO
import org.springframework.data.querydsl.QuerydslPredicateExecutor
import org.springframework.data.repository.PagingAndSortingRepository
import org.springframework.stereotype.Repository

@Repository
interface AphorismRepository: PagingAndSortingRepository<AphorismDO, Int?>, QuerydslPredicateExecutor<AphorismDO> {

}