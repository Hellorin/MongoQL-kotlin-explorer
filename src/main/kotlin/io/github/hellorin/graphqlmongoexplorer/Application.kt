package io.github.hellorin.graphqlmongoexplorer

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import javax.servlet.http.HttpServletResponse

@SpringBootApplication
@RestController
class Application {
    @GetMapping("/")
    @CrossOrigin
    fun homeRedirect(response: HttpServletResponse) {
        response.sendRedirect("https://hellorin.github.io/MongoQL-kotlin-explorer/");
    }
}

fun main(args: Array<String>) {
    runApplication<Application>(*args)
}