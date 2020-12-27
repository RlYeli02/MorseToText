class MorseToTextTest extends org.scalatest.funsuite.AnyFunSuite {
  test(".--- ..- .-. .- ... .. -.-. --- .-.-.  debe ser 'jurasico'"){
    var expected = "jurasico";
    var actual = ".--- ..- .-. .- ... .. -.-. --- .-.-."
    assert(Morse.Morse.MorseToTextTest(actual)== expected)
  }
  test("..-. .-. .- -. -.-- . .-.. .. --.. .- ..--- ----- ----- ----- .-.-. debe ser 'franyeliza2000'"){
    var expected = "franyeliza2000";
    var actual = "..-. .-. .- -. -.-- . .-.. .. --.. .- ..--- ----- ----- ----- .-.-."
    assert(Morse.Morse.MorseToTextTest(actual)== expected)
  }
  test(".---- ----- ----- --..-- ----- ----- ----- .-.-.- ----- ----- .-.-. debe ser '100,000.00'"){
    var expected = "100,000.00";
    var actual = ".---- ----- ----- --..-- ----- ----- ----- .-.-.- ----- ----- .-.-."
    assert(Morse.Morse.MorseToTextTest(actual)== expected)
  }
  test(".--. .- .-. --.- ..- . .-.-. debe ser 'parque'"){
    var expected = "parque";
    var actual = ".--. .- .-. --.- ..- . .-.-."
    assert(Morse.Morse.MorseToTextTest(actual)== expected)
  }

  
}
