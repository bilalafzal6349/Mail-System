public class Account {
    private String userName;
    private String password;
    private String mailServer;

    Account (String userName,String password,String mailServer){
        this.userName=userName;
        this.password=password;
        this.mailServer=mailServer;
    }
//Account(){
//        this.userName="";
//        this.password= 0;
//        this.mailServer="";
//}
    public String getuserName() {
        return userName;
    }
    public void setuserName(String userName){
        this.userName=userName;
    }
    public String getPassword(){
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMailServer() {
        return mailServer;
    }

    public void setMailServer(String mailServer) {
        this.mailServer = mailServer;
    }
    public void display(){
        System.out.println("the user name is : " + userName);
        System.out.println("the password  is : " + password);
        System.out.println("Mail server is  : " + mailServer);

    }
}
