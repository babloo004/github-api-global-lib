

class Person {
  String name;
  int age;

  //constructor
  Person() {
    this.name=null;
    this.age=0;
  }

  //custom constructor
  Person(String name,int age) {
    this.name=name;
    this.age=age;
  }

  //methods
  void details(){
    println("Name : ${name}!");
    println("age : ${age}!");
  }
}
