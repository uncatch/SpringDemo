plugins {
    id("java")
    kotlin("jvm") version "1.4.21"
    id("org.springframework.boot") version "2.2.6.RELEASE"
    id("io.spring.dependency-management") version "1.0.9.RELEASE"
}

group = "me.sean"
version = "1.0-SNAPSHOT"

allprojects {
    repositories {
        mavenCentral()
    }

    tasks.withType<JavaCompile>{
        java{
            sourceCompatibility=JavaVersion.VERSION_1_8
            targetCompatibility=JavaVersion.VERSION_1_8
        }
    }

    tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
        kotlinOptions {
            freeCompilerArgs = listOf("-Xjsr305=strict")
            jvmTarget = "1.8"
        }
    }

    tasks.withType<Test> {
        useJUnitPlatform()
    }
}

subprojects {
    apply {
        plugin("java")
        plugin("kotlin")
        plugin("org.springframework.boot")
        plugin("io.spring.dependency-management")
    }

    dependencies {
        implementation(kotlin("stdlib-jdk8"))
        implementation("org.jetbrains.kotlin:kotlin-reflect")

        implementation("org.springframework.boot:spring-boot-starter-web")
        testImplementation("junit", "junit", "4.12")
        testImplementation("org.springframework.boot:spring-boot-starter-test")
    }

    dependencyManagement {
        imports { mavenBom("org.springframework.boot:spring-boot-dependencies:2.2.2.RELEASE") }
        imports { mavenBom("org.springframework.cloud:spring-cloud-dependencies:Hoxton.SR1") }
    }
}



