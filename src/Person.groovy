

class Person {
  def steps;
  String name;
  int age;

  //constructor
  Person(def steps) {
    this.name=null;
    this.age=0;
    this.steps=steps;
  }

  //custom constructor
  Person(String name,int age,def steps) {
    this.name=name;
    this.age=age;
    this.steps=steps;
  }

  //methods
  void details(){
    steps.echo ("Name : ${name}!")
    steps.echo ("age : ${age}!")
  }
}
