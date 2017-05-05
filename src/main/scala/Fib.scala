package ryama0

object Fib {
  def calculate(num: Integer): Integer = {
    if (num <= 0)
      return 0
    else if (num == 1)
      return 1
    else
      return this.calculate(num - 2) + this.calculate(num - 1)

  }

  def execute(args: String): String = {
    this.calculate(args.split(",").head.toInt)
  }
}
