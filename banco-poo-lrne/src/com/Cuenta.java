package com;

public class Cuenta {

 double saldoDisponible;
 String tipoCuenta;
 String numCuenta;
 String clabe;

 
 double min;
 double max;
 
 public Cuenta() {
  
 }

 public Cuenta(double saldoDisponible, String tipoCuenta, String numCuenta, String clabe, double min, double max) {
  this.saldoDisponible = saldoDisponible;
  this.tipoCuenta = tipoCuenta;
  this.numCuenta = numCuenta;
  this.clabe = clabe;
  this.min = min;
  this.max = max;
 }

 public double getSaldoDisponible() {
  return saldoDisponible;
 }

 public void setSaldoDisponible(double saldoDisponible) {
  this.saldoDisponible = saldoDisponible;
 }

 public String getTipoCuenta() {
  return tipoCuenta;
 }

 public void setTipoCuenta(String tipoCuenta) {
  this.tipoCuenta = tipoCuenta;
 }

 public String getNumCuenta() {
  return numCuenta;
 }

 public void setNumCuenta(String numCuenta) {
  this.numCuenta = numCuenta;
 }

 public String getClabe() {
  return clabe;
 }

 public void setClabe(String clabe) {
  this.clabe = clabe;
 }

 public double getMin() {
  return min;
 }

 public void setMin(double min) {
  this.min = min;
 }

 public double getMax() {
  return max;
 }

 public void setMax(double max) {
  this.max = max;
 }

 @Override
 public String toString() {
  return "Cuenta [saldoDisponible=" + saldoDisponible + ", tipoCuenta=" + tipoCuenta + ", numCuenta=" + numCuenta
    + ", clabe=" + clabe + ", min=" + min + ", max=" + max + "]";
 }
 
 
}