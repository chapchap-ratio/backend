
plugins {
    id("org.springframework.boot") version "2.5.4"
    id("io.spring.dependency-management") version "1.0.11.RELEASE"
    kotlin("jvm") version "1.5.21"
    kotlin("plugin.spring") version "1.5.21"
    kotlin("plugin.jpa") version "1.5.21"
    kotlin("kapt") version "1.3.61 "
}

group = "chapchap.ratio"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_11

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.springframework.boot:spring-boot-starter-aop")
    implementation("org.springframework.boot:spring-boot-starter-data-jpa") // <-- 추가됨
    implementation("org.springframework.boot:spring-boot-starter-jdbc")     // <-- 추가됨
    implementation("com.querydsl:querydsl-jpa")

    implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
    implementation("org.jetbrains.kotlin:kotlin-reflect")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")

    implementation("org.mariadb.jdbc:mariadb-java-client")

    kapt(group = "com.querydsl", name = "querydsl-apt", classifier = "jpa")
    // implementation("org.mybatis.spring.boot:mybatis-spring-boot-starter:2.2.0")
    testImplementation("org.springframework.boot:spring-boot-starter-test")

}

allOpen {
    annotation("javax.persistence.Entity")
    annotation("javax.persistence.MappedSuperclass")
    annotation("javax.persistence.Embeddable")
}

tasks.withType<Test> {
    useJUnitPlatform()
}
