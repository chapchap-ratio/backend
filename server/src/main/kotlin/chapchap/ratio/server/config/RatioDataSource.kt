package chapchap.ratio.server.config

import com.zaxxer.hikari.HikariConfig
import com.zaxxer.hikari.HikariDataSource
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.jdbc.datasource.DriverManagerDataSource
import org.springframework.transaction.annotation.EnableTransactionManagement
import javax.sql.DataSource

@Configuration
@EnableTransactionManagement
class RatioDataSource {

    @Bean
    fun dataSource(): DataSource {
        val url = "jdbc:mariadb://ratio-db.cnzcedoxfdus.us-east-2.rds.amazonaws.com:3306/ratio"
        val userName = "admin"
        val password = "10dnjf13dlf!"
        val dataSource = DriverManagerDataSource(url, userName, password);
        dataSource.setDriverClassName("org.mariadb.jdbc.Driver")

        val config = HikariConfig()
        config.driverClassName = "org.mariadb.jdbc.Driver"
        config.jdbcUrl = url
        config.username = userName
        config.password = password

        return HikariDataSource(config)
    }
}