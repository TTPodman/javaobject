package my;

public class Fraction
{
	public int fenzi;
	public int fenmu;
	
	public String value()//显示分数的值
	{
		return (this.fenzi+"/"+this.fenmu);
	}
	
	// 分数的乘法 ( 小学算术 )
	public Fraction mul(Fraction other) // 参数other指向另一个Fraction对象 （参照网盘里第8章的补充教程)
	{
		// 分子分母交叉相乘相加, 分母相乘
		Fraction result = new Fraction();
		result.fenzi = this.fenzi * other.fenzi;
		result.fenmu = this.fenmu * other.fenmu;
		return result;
	}
}
