package chapchap.ratio.server.bo

import chapchap.ratio.server.model.AphorismDO
import chapchap.ratio.server.repositories.AphorismRepository
import org.springframework.stereotype.Service
import kotlin.random.Random

@Service
class AphorismBO (
    val aphorismRepository: AphorismRepository
        ){

    fun getAphorism() : AphorismDO{
        val aphorism: List<AphorismDO> = aphorismRepository.findAll().toList()

        val randomIndex  = Random.nextInt(aphorism.size)
        return aphorism.get(randomIndex)
    }
}