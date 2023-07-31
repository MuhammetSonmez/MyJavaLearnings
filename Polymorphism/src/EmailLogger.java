public class EmailLogger extends BaseLogger{
        //override
        public void Log(String message){
            System.out.println("logged to E mail : " + message);
        }
}
