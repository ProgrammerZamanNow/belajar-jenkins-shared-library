package programmerzamannow.jenkins;

class Output {

  static def hello(steps, String name) {
    steps.echo("Hello ${name}")
  }

}