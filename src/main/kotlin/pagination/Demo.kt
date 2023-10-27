package pagination

class Demo {

    fun main(args: Array<String>) {
        println("Getting students World!")
        val students = createStudents()
        println("Getting students response list!")
        val studentsResponse = createGenericResponse(students)
        printResponse(studentsResponse)

        println("Getting students World!")
        val employees = createEmployees()
        println("Getting students response list!")
        val employeeResponse = createGenericResponse(employees)
        printResponse(employeeResponse)

    }

    fun createStudents(): List<Student>{
        val student1= Student(1, "Adam", 11)
        val student2= Student(2, "Eve", 11)
        return listOf(student1, student2)
    }

    fun createEmployees(): List<Employee>{
        val emp1= Employee(1, "Adam", "CEO")
        val emp2= Employee(2, "Eve", "CFO")
        return listOf(emp1, emp2)
    }

    fun <T> createGenericResponse(list: List<T>): ResponseList<T>{
        return ResponseList( list, Page(1,list.size,1) )
    }

    fun <T> printResponse(response: ResponseList<T>){
        response.list.stream().forEach(System.out::println)
    }
}