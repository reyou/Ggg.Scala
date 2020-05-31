object Demo extends App {
  case class Stud(rollno: Int, name : String, marks : Int) { }

  val students = List(Stud(1, "Navin", 40), Stud(2, "Pooja", 80), Stud(3, "Nadeem", 60), Stud(4, "Mohini", 50))
  val (part1: List[Stud], part2: List[Stud]) = students.partition(s => s.marks >= 60)
  println(part1)
  println(part2)
}

