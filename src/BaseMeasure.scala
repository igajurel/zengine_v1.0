/**
  * Created by GajjuVai on 2/21/2017.
  */
object BaseMeasure extends App{
  println("BaseMeasure")
  var AG : Int = 1
  var PL : Int = 1
  var ED : Int = 1
  var AD : Int = 1
  var CE : Int = 1
  var BE : Int = 1

  var Deno : Int = AG+PL+ED+AD+CE+BE
  var Nume : Int = 5

  var Rate : Int = ((Nume.toFloat/Deno.toFloat)*100).toInt
  println("Percentage of Numerator Compliant Members =")
  print(Rate)
}
