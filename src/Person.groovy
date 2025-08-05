

class Person {
  def steps;
  String name;
  int age;
  String gf;

  //constructor
  Person(def steps) {
    this.name=null;
    this.age=0;
    this.gf=null;
    this.steps=steps;
  }

  //custom constructor
  Person(String name,int age,String gf,def steps) {
    this.name=name;
    this.age=age;
    this.steps=steps;
    this.gf=gf;
  }

  //methods
  void details(){
    steps.echo ("Name : ${name}!")
    steps.echo ("age : ${age}!")
    steps.echo "gf : ${gf}!"
  }
}
