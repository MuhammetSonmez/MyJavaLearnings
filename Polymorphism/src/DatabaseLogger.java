public class DatabaseLogger extends BaseLogger{
    //override
    public void Log(String message){
        System.out.println("logged to database : " + message);
    }
}
