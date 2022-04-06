package ejercicio12;

public class FacturaCompleta {
private double desc;
private double iva;
private double bi;
public FacturaCompleta() {

}
public FacturaCompleta(double desc,double iva, double bi) {
	super();
	this.desc = desc;
	this.iva = iva;
	this.bi = bi;
}
public void setiva1(double iva) {
	this.iva = 0.21;
}
public double getiva1() {
	return this.iva = this.bi*.021; 
}
public double getiva2() {
	return this.iva = 0.1;
}
public double getiva3() {
	return this.iva = 0.04;
}
public double getdesc1() {
	return this.desc = this.bi/2;
}
public double getdesc2() {
	return this.desc = this.bi-5;
}
public double getdesc3() {
	return this.desc = (this.bi*.05)-this.desc;
}
public double getDesc() {
	return desc;
}
public void setDesc(double desc) {
	this.desc = desc;
}
public double getIva() {
	return iva;
}
public void setIva(double iva) {
	this.iva = iva;
}
public double getBi() {
	return bi;
}
public void setBi(double bi) {
	this.bi = bi;
}

}
