package chapchap.ratio.server.model

import javax.persistence.*

@Entity
@Table(name = "aphorism")
data class AphorismDO(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Int,

    @Column(nullable = false)
    val content: String,
    @Column(nullable = false)
    val author: String
) {
}