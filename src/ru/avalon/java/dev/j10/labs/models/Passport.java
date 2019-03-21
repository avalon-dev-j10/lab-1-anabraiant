package ru.avalon.java.dev.j10.labs.models;

/**
 * Представление о паспортных данных человека.
 * <p>
 * Паспортные данные должны включать:
 * <ol>
 *  <li> серию и номер документа;
 *  <li> имя;
 *  <li> фамилию;
 *  <li> отчество;
 *  <li> второе имя;
 *  <li> день рождения;
 *  <li> дату выдачи;
 *  <li> орган, выдавший документ.
 * </ol>
 */ 
public class Passport {
    public String serialAndNumber;
    public String name;
    public String surname;
    public String patronymic;
    public String secondName;
    public String birthday;
    public String dateOfIssue;
    public String authority;
    
    public Passport (String name, String surname){
        this.name = name;
        this.surname = surname;
    }
    public Passport (String surname, String name, String patronymic){
        this(surname, name);
        this.patronymic = patronymic;
    }
    public Passport (String surname,String name, String patronymic, String secondName){
        this( surname,name, patronymic);
        this.secondName = secondName;
    }
    public Passport (String serialAndNumber, String name, String surname, String patronymic, String secondName, String birthday,String dateOfIssue, String authority ){
        this.serialAndNumber = serialAndNumber;
        this.name= name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.secondName = secondName;
        this.birthday = birthday;
        this.dateOfIssue = dateOfIssue;
        this.authority = authority;
        
    }
    
    public String getFullName() {
        
        String fullName = null;
        if ( (name!=null) && (surname!=null) && (patronymic!=null))
            fullName = name + " " + surname +" "+ patronymic;
        if ((patronymic == null) && (secondName!=null))
            fullName = name + " " + secondName.charAt(0) + " " + surname;
        if ((patronymic ==null) && (secondName==null))
            fullName = name + " " + surname;
        
        return fullName;
    }
    public void setSerialAndNumber (String serialAndNumber){
        this.serialAndNumber = serialAndNumber;
    }
    public void setName (String name){
        this.name = name;
    }
    public void setSurname(String surname){
        this.surname = surname;
    }
    public void setPatronymic(String patronymic){
        this.patronymic = patronymic;
    }
    public void setSecondName(String secondName){
        this.secondName = secondName;
    }
    public void setBirthday(String birthday){
        this.birthday = birthday;
    }
    public void setDateOfIssue(String dateOfIssue){
        this.dateOfIssue = dateOfIssue;
    }
    public void setAuthority( String authority){
        this.authority = authority;  
    }
    public String getSerialAndNumber(){
        return serialAndNumber;
    }
    public String getName(){
        return name;
    }
    public String getSurname(){
        return surname;
    }
    public String getPatronymic(){
        return patronymic;
    }
    public String getSecondName(){
        return secondName;
    }
    public String getBirthday(){
        return birthday;
    }
    public String getDateOfIssue(){
        return dateOfIssue;
    }
    public String getAuthority(){
        return authority;
    }
    
    

    /*
     * TODO(Студент): Закончить определение класса.
     *
     * 1. Объявить атрибуты класса.
     *
     * 2. Определить необходимые методы класса. Подумайте о
     *    том, какие методы должны существовать в классе,
     *    чтобы обеспечивать получение всей необходимой
     *    информации о состоянии объектов данного класса.
     *    Все ли поля обязательно будут проинициализированы
     *    при создании экземпляра?
     *
     * 3. Создайте все необходимые конструкторы класса.
     *
     * 4. Помните о возможности существования перегруженных
     *    конструкторов.
     *
     * 5. Обеспечте возможность использования класса за
     *    пределами пакета.
     */
}
