class program4 {
    public static void main(String[] args) {
        
        byte b = 42;
        String strByte = Byte.toString(b);
        System.out.println("Byte to String: " + strByte);

        Byte byteInstance = Byte.valueOf(b);
        System.out.println("Byte to Byte instance: " + byteInstance);

        String strValue = "100";
        Byte byteToString = Byte.valueOf(strValue);
        System.out.println("String to Byte instance: " + byteToString);
    }
}
