//package blog
//import io.ktor.application.*
//import io.ktor.features.*
//import io.ktor.http.*
//import io.ktor.response.*
//import io.ktor.routing.*
//import io.ktor.server.engine.*
//import io.ktor.server.netty.*
//
////fun Application.module() {
////    install(DefaultHeaders)
////    install(CallLogging)
////    install(Routing) {
////        get("/") {
////            call.respondText("My Example Blog2 3", ContentType.Text.Html)
////        }
////    }
////}
//
////fun main(args: Array<String>) {
////    embeddedServer(Netty, 8080, watchPaths = listOf("BlogAppKt"), module = Application::module).start()
////}
//
//
//fun main(args: Array<String>) {
//    embeddedServer(
//            Netty, watchPaths = listOf("BlogAppKt"), port = 8080,
//            // GOOD!, it will work
//            module = Application::mymodule
//    ).start(true)
//}
//
//// Body extracted to a function acting as a module
//fun Application.mymodule() {
//    install(DefaultHeaders)
//    install(CallLogging)
//    routing {
//        get("/") {
//            call.respondText("Hello World!!!")
//        }
//    }
//}