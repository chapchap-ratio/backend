package chapchap.ratio.server.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

/**
 * 오늘의 격언
 */
@RestController
@RequestMapping("/aphorism")
class AphorismController {
    // 오늘의 격언은 사람마다 같아야하나?
    // 이전에 나왔던 격언은 나올 필요가 없나?
    // 격언을 따로 DB 에 저장할지 말지..

    // 나의 격언 추가하기 해서 따로 추가할 수도 있으면 좋겠음
   @GetMapping("/today")
   fun getMyAphorism() : String {
       return "hi"
   }

}