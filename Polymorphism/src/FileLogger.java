public class FileLogger extends BaseLogger{
        //override
        public void Log(String message){
            System.out.println("logged to file : " + message);
        }
}
