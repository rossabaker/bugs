object WompWomp {
  object SadTrombone extends Exception

  try "jazz"
  catch {
    case SadTrombone => "womp" * 3
  }
}
