class program2
{
    public static void main(String[] args)
    {
        Boolean b = true;
        String boolstr = Boolean.toString(b);
        System.out.println("boolToStr :"+boolstr);//boolean to string

        Boolean boolinstance = Boolean.valueOf(b);
        System.out.println("boolToInst: " +boolinstance);//boolean to boolean instance

        String strValue = "false";
        Boolean strToBool = Boolean.parseBoolean(strValue);
        System.out.println("strToBool :" +strValue);//string to boolean

        Boolean strInstance = Boolean.valueOf(strValue);
        System.out.println("strToInstance :" +strInstance);//string to boolean instance
    }
}