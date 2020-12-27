class MorseToTextTest extends org.scalatest.funsuite.AnyFunSuite {
  test(".--- ..- .-. .- ... .. -.-. --- .-.-.  debe ser 'jurasico'"){
    var expected = "jurasico";
    var actual = ".--- ..- .-. .- ... .. -.-. --- .-.-."
    assert(Morse.Morse.MorseToTextTest(actual)== expected)
  }

  
}
