class program5 {
    public static void main(String[] args) {
        
        Byte b = new Byte("42");
        
        byte byteValue = b.byteValue();
        System.out.println("Byte value: " + byteValue);
        
        short shortValue = b.shortValue();
        System.out.println("Short value: " + shortValue);
        
        int intValue = b.intValue();
        System.out.println("Int value: " + intValue);
        
        long longValue = b.longValue();
        System.out.println("Long value: " + longValue);
        
        float floatValue = b.floatValue();
        System.out.println("Float value: " + floatValue);
        
        double doubleValue = b.doubleValue();
        System.out.println("Double value: " + doubleValue);
    }
}
