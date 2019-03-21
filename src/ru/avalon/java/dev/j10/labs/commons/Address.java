/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.avalon.java.dev.j10.labs.commons;

/*
 * TODO(Студент): Создайте класс Address.
 *
 * 1. Добавте файл в пакет ru.avalon.java.dev.j10.labs.commons.
 *
 * 2. Создайте класс, видимый из пакета. Подумайте о том
 *    Какое имя должен иметь класс, если он объявленн в этом
 *    файле.
 *
 * 3. Подумайте над тем, какие переменные должены быть
 *    определены в классе.
 *
 * 4. Подумайте над тем, какие методы должны быть объявлены
 *    в классе.
 */
public class Address {

public String country;
public String city;
public String street;
public String build;
public String apartament;
public String zip;

public Address (String country, String city, String street, String build, String apartament, String zip){

    this.country = country;
    this.city = city; 
    this.street = street;
    this.build = build;
    this.apartament = apartament;
    this.zip = zip;
} 
 
public String getAddress(){
    return country + ", " + city  + ", " + street  + ", " + build  + ", " + apartament  + ", " + zip;
}

public void setCountry(String country){
    this.country = country;
}
public void setCity(String city){
    this.city = city;
}
public void setStreet(String street){
    this.street = street;
}
public void setBuild(String build){
    this.build = build;
}
public void setApartament(String apartament){
    this.apartament = apartament;
}
public void setZip(String zip){
    this.zip = zip;
}

public String getCountry (){
    return country;
}
public String getCity(){
    return city;
}
public String getStreet(){
    return street;
}
public String getBuild(){
    return build;
}
public String getApartament(){
    return apartament;
}
public String getZip(){
    return zip;
}
}