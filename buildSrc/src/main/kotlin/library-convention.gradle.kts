plugins {
    java
}

dependencies {
    // 共通で使うライブラリをつらつら書く
    val lombokVersion = "1.18.22"
    compileOnly("org.projectlombok:lombok:${lombokVersion}")
    annotationProcessor("org.projectlombok:lombok:${lombokVersion}")

    testCompileOnly("org.projectlombok:lombok:${lombokVersion}")
    testAnnotationProcessor("org.projectlombok:lombok:${lombokVersion}")
}