import pagination.Demo

fun main() {
    demoGenericResponse()
}

fun demoGenericResponse(){
    val demo = Demo()
    println("Getting students World!")
    val students = demo.createStudents()
    println("Getting students response list!")
    val studentsResponse = demo.createGenericResponse(students)
    demo.printResponse(studentsResponse)

    println("Getting students World!")
    val employees = demo.createEmployees()
    println("Getting students response list!")
    val employeeResponse = demo.createGenericResponse(employees)
    demo.printResponse(employeeResponse)
}