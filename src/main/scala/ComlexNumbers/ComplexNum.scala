package ComlexNumbers
case class ComplexNum(R : Double,I : Double) {
  private var Rel = R
  private var Img = I
  override def toString: String = {
    if(Img == 0 ){
      return Rel.toString
    }
    Rel.toString + "+" + Img.toString + "i"
  }
def +(other: ComplexNum) : ComplexNum = {new ComplexNum(this.Rel + other.Rel, this.Img + other.Img)}

  def -(other: ComplexNum) : ComplexNum = {new ComplexNum(this.Rel - other.Rel, this.Img - other.Img)}
  def *(other: ComplexNum) : ComplexNum = {
    var real: Double = this.Rel * other.Rel + (this.Img * other.Img * -1)
    var imagin: Double = this.Img * other.Rel + this.Rel * other.Img
    var res: ComplexNum = new ComplexNum(real, imagin)
    return res}
  def /(other: ComplexNum) : ComplexNum = {
    var tempMult: ComplexNum = new ComplexNum(other.Rel, other.Img * -1);
    var res: ComplexNum = this * tempMult
    var divider: Double = (other * tempMult).Rel
    if(res.Rel % divider != 0 & res.Img % divider != 0){
      var drRes  = res.Rel.toString + "/" + divider.toString + " + " + res.Img.toString + "/" + divider.toString + "i"
      println(drRes)
    }
    else if(res.Rel % divider != 0){
      var drRes  = res.Rel.toString + "/" + divider.toString + " + " + (res.Img / divider).toString + "i"
      println(drRes)
    }
    else if(res.Img % divider != 0){
      var drRes  = (res.Rel / divider).toString + " + " + res.Img.toString + "/" + divider.toString + "i"
      println(drRes)
    }

    res.Rel = res.Rel / divider
    res.Img = res.Img / divider

    return res
  }
      /*
    var real:Double  = (this.Rel * other.Rel) - (this.Img * other.Img) / (other.Rel * other.Rel) + (other.Img * other.Img)
    var imagin:Double = (this.Rel * other.Img) + (this.Img * other.Rel) / (other.Rel * other.Rel) + (other.Img * other.Img)
    var temp:ComplexNum = new ComplexNum(real ,imagin)
    return temp}
       */
}




