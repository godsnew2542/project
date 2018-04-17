/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project1;

/**
 *
 * @author Asus
 */
import java.util.Scanner;
abstract class Project1 {
    public static void main (String[] args){
    System.out.println("Welcome to the airline");
    Customer cu = new Customer();
    cu.Customer();
}
public abstract void Customer1();
}
abstract class Costmer2 extends Project1{
public abstract void Customer();
}
class Customer extends Costmer2{
    public static String name2,zx1;
      public void Customer(){
        Scanner sc = new Scanner(System.in);
        System.out.print("User Name : ");
name2 =sc.nextLine();
 Customer1();
}
public void Customer1(){
        pcx pc = new pcx();
pc.msxing();
}
}
class CustomerCheck extends Customer{
    private String a1="new",a2="mean";
    public static int sale;
    static double sale1;
    public void check(){
        String aa = this.a1;  String ab = this.a2;
        nation N = new nation();
        SelectRegion S = new SelectRegion();
switch(name2){
   case "new" : System.out.println("\t**VIP** ");break;
    case "mean" : System.out.println("\t**VIP** ");break;
    default:System.out.println("\t\t**Normal**");break;}
if (name2.equals(aa) || name2.equals(ab)) {sale=5; sale1=0.95; zx1="null"; System.out.println("************************"); S.selectregion();}
else {sale=0; sale1=1.00; N.national();}
    }
}
class nation {
    public static String zx,na,thai;
    public static void national(){
Scanner sc = new Scanner(System.in);//String
char check;
do{ System.out.print("Thai nation = y  \nForeigner nation = n "+ "\nYou Enter : ");
na = sc.nextLine();
check = na.charAt(0);
System.out.println("************************");
}while(check!='y'&&check!='Y'&&check!='n'&&check!='N');
if (check =='Y' || check=='y'){zx="Thai";}
else {zx="Foreigner";}
SelectRegion S = new SelectRegion();
S.selectregion();
}
}
class SelectRegion{
    public static String Select,zx1;
    public static int A,select;
    static pcx pc = new pcx();
    static Scanner sc = new Scanner(System.in); //int
public static void selectregion(){
         do{  System.out.println("    --------------------");
         System.out.println("\tเลือกภาคที่จะไป");
         System.out.println("North :\t\t1"+"\nNortheast :\t2"+"\nCentral Region :3"+"\nSouthern :\t4");
         System.out.println("------------------------------");
         System.out.print("Number is : ");
     select = sc.nextInt();
    }while(select !=1&&select !=2&&select !=3&&select !=4);
    if (select == 1){  Select="North"; North(); }
    else if (select == 2){  Select="Northeast"; Northeast(); }
    else if (select == 3){  Select="CentralRegion"; CentralRegion(); }
    else if (select == 4){  Select="Southern"; Southern(); }
}
public static void North(){ 
do{  System.out.println("\t*****North*****");
    System.out.println("Chiang Mai(1,500)  : \t1"+"\nMae Hong Son(1,400)  : \t2"+"\nPhitsanulok(1,200)  : \t3");
    System.out.println("------------------------------");
    System.out.print("Number is : ");
 select = sc.nextInt();
}while (select!=1 && select!=2 && select!=3);
if (select==1){zx1="Chiang Mai";   A=1500;}
else if (select==2){zx1="Mae Hong Son";   A=1400;}
else {zx1="Phitsanulok";   A=1200;}
pc.pcx();
}
public static void Northeast(){
do{  System.out.println("\t*****Northeast*****");
System.out.println("Roi Et(1,600)  : \t1"+"\nNakhon Phanom(1,400)  : 2"+"\nKhon Kaen(1,000)  : \t3");
System.out.println("------------------------------");
System.out.print("Number is : ");
select = sc.nextInt();
}while (select !=1 && select !=2 && select !=3);
if ( select==1){zx1="Roi Et";   A=1600;}
else if (select==2){zx1="Nakhon Phanom";   A=1400;}
else {zx1="Khon Kaen";   A=1400;}
pc.pcx();
}
public static void CentralRegion(){ 
do{  System.out.println("\t*****CentralRegion*****");
System.out.println("Bangkok(1,200)  : 1"+"\nPattaya(1,400)  : 2");
System.out.println("------------------------------");
System.out.print("Number is : ");
select = sc.nextInt();
}while (select !=1 && select !=2);
if ( select==1){zx1="Bangkok";   A=1200;}
else {zx1="Pattaya";   A=1400;}
pc.pcx();
}
public static void Southern(){
do{  System.out.println("\t*****Southern*****");
System.out.println("Hat Yai(1,000)  : \t1"+"\nPhuket(1,400)  : \t2"+"\nSurat Thani(1,200)  : \t3"+"\nTrang(1,400)  : \t4");
System.out.println("------------------------------");
System.out.print("Number is : ");
select = sc.nextInt();
}while (select !=1 && select !=2 && select !=3 && select !=4);
if ( select==1){zx1="Hat Yai ";   A=1000;}
else if (select==2){zx1="Phuket";   A=1400;}
else if (select==3){zx1="Surat Thani";   A=1200;}
else {zx1="Trang";   A=1400;}
pc.pcx();
}
}
class Population implements Adult{
    public static  int a,b,c;
     static char ceat;
 public void Adulting(){
 SelectRegion Se = new SelectRegion();
     Scanner sc = new Scanner(System.in);    //int
     Scanner sc1 = new Scanner(System.in);    //String
   System.out.println("\t****จำนวนผู้โดยสาร****");
   System.out.print("Number Adult : "); 
  a=sc.nextInt();
   System.out.print("Number Child : ");
   b=sc.nextInt();
  System.out.print("Number Baby :  ");
  c=sc.nextInt();
do{  System.out.println("*** Ok ป่าว \tOk กด y \tNo กด n ***");
System.out.print("Enter : ");
   String pop=sc1.nextLine();
      ceat=pop.charAt(0);
       System.out.println("------------------------------");
   }while (ceat!='y' && ceat!='Y' && ceat!='n' && ceat!='N');
       Print p = new Print();
   if (ceat!='Y'&&  ceat!='y'){Adulting();}//ขึ้นไปเลือกภาคใหม่
   else{ p.print();} //ไปถามจำนวนคน
}
}
interface Adult{
abstract void Adulting();
}
interface pcr{
abstract void pcx();
}
interface pci{
abstract void pcx1();
}
interface msx{
abstract void msxing();
}
interface sms{
abstract void smsing();
}
class pcx implements pcr,pci,msx,sms{
    static Scanner sc1 = new Scanner(System.in);// String
    private char ceat;
    static SelectRegion Se = new SelectRegion();
    static Customer cu = new Customer();
public void pcx(){ // checkว่าไป ไหม ของ จังหวันนั้น  
    Population P = new Population();
do {  System.out.println("<<< Ok ป่าว \tOk กด y \tNo กด n >>>");
System.out.print("Enter : ");
   String gosc=sc1.nextLine();
      ceat=gosc.charAt(0);
}while (ceat!='Y' && ceat!='y' && ceat!='N' && ceat!='n');
   if (ceat=='N' || ceat=='n'){Se.selectregion();}//ขึ้นไปเลือกภาคใหม่
   else{P.Adulting();} //ไปถามจำนวนคน
}
public void pcx1(){//ตอนจบ ใส่เงินไม่เกิน 5 รอบ
System.out.print("จะเอาอีกไหม : ถ้าไม่เอาเพิ่มกด N แต่ถ้าเพื่มกด Y : ");
   String go=sc1.nextLine();
   ceat=go.charAt(0);
   if (ceat>='y'&&  ceat>='Y'){smsing();}
   else if (ceat>='n'&&  ceat>='N'){ System.out.println("***********Thank you***********");}
   else {pcx1();}
}
public void msxing(){ //check ใช่ป่าวของ Usuer
    CustomerCheck ch = new CustomerCheck();
     while (ceat!='y' && ceat!='Y' && ceat!='n' && ceat!='N'){
System.out.print(">>You Sure<< Yes=y and No=n "+"\nEnter : ");
   String go=sc1.nextLine();
    ceat=go.charAt(0);
     System.out.println("--------------------");
     }
   if (ceat=='n' || ceat=='N'){cu.Customer();} //ไปใส่ใหม่
   else {ch.check();} // ไปส่วนของ สมาชิก กับ ไม่เป็นสมาชิก 
}
public void smsing(){
    do{   System.out.print("Will you be the same name? \nSure : y \tNo : n \nEnter : ");
   String gosc=sc1.nextLine();
    ceat=gosc.charAt(0);
  System.out.println("********************");
    }while (ceat!='y' && ceat!='Y' && ceat!='n' && ceat!='N');
   if(ceat!='y' && ceat!='Y'){cu.Customer();}
   else {Se.selectregion();}
}
}
abstract class PO{
  static int po;
public static int po1(int po){
Population P = new Population();
po =P.a+P.b+P.c;
return po;
}
}
class SSD extends Print {
    public static double pay;
public static void hbd(){
Scanner sc = new Scanner(System.in);//double
    int ass=0,g=0;
    System.out.println("------------------------------");
    for (int f=5 ; ass<f ; ass++){
        System.out.print("Enter money to pay : ");  //รับเงินมา5ครั้ง
pay=sc.nextDouble();
if (pay >= sum){ass=5; g=1;} 
else{System.out.println("<<<<<Try again>>>>>"+"\n------------------------------");}  
    }
    double money = pay-sum;
    pcx pc = new pcx();  
    if (g==1){System.out.println("เงินทอน =\t " + money + "฿");
        System.out.println("<<<<<Thank you>>>>>"+"\n------------------------------");   pc.pcx1();}
    else{Error();}
}
public static void Error(){
    char ceat;
    Scanner sc1 = new Scanner(System.in);//String
    Customer cu = new Customer();
    do{  System.out.print("Error \tPress:y to try again  Press:n to stop the program \nEnter : ");
   String go=sc1.nextLine();
    ceat=go.charAt(0);
  System.out.println("********************");
    }while(ceat!='y'&&ceat!='Y'&&ceat!='n'&&ceat!='N');
   if(ceat!='N' && ceat!='n'){cu.Customer(); }
   else {System.out.println("<<<<<Thank you>>>>>");}
}
}
class Print extends PO{
    public static double sum = 0, sum1 = 0, sum2 = 0;
    public static Customer cu= new Customer();
    public static Population P = new Population();
    public static SelectRegion S = new SelectRegion();
     public static CustomerCheck ch = new CustomerCheck();
     public static nation N = new nation();
    public static double salary(){
    sum1= ch.sale1*(P.a*S.A);
    sum2= ch.sale1*((P.b*S.A)-(P.b*400));
    sum = sum1+sum2;
    System.out.println("\t>>ผู้โดยสาร<<");
    System.out.println("Adult is : "+P.a+"คน"+"\t"+sum1+"฿");
    System.out.println("Child is : "+P.b+"คน"+"\t"+sum2+"฿");
    System.out.println("Baby  is : "+P.c+"คน"+"\tFree.0฿");
   return sum;
    }
    public static void print(){
        String a1 = "new",a2="mean";
        System.out.println("\t\t>>>>>slip<<<<<");
        System.out.println("User Name : " +cu.name2);
        System.out.println("You have a discount : "+ch.sale +"%");
     if(cu.name2.equals(a1)||cu.name2.equals(a2)){ System.out.println("nationality : "+ch.zx1);}
     else { System.out.println("nationality : "+N.zx);}
     System.out.println("Go to : "+S.Select+"\t>>"+S.zx1+"\t"+S.A+"฿");
     System.out.println("<<Promotion for children and baby>>" );
     System.out.println("Children : decrease 400฿/1    \nBaby \t : Free฿");
     System.out.println("Total is : "+po1(po)+"คน\t"+salary()+"฿");
      SSD d = new SSD();
      d.hbd(); //ใส่เงิน
    }
}