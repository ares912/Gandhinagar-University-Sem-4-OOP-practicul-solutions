class p8e11 {
    public static void main(String[] args) {
        Boolean boolobj = Boolean.valueOf(true);
        Character cobj = Character.valueOf('c');
        Byte bobj = Byte.valueOf((byte) 2); // Explicitly cast to byte
        Short sobj = Short.valueOf((short) 22); // Explicitly cast to short
        Integer iobj = Integer.valueOf(234);
        Long lobj = Long.valueOf(22000L);
        Float fobj = Float.valueOf(22.3f);
        Double dobj = Double.valueOf(345d);

        System.out.println("Autoboxing Values:");
        System.out.println(boolobj + "," + cobj + "," + bobj + "," + sobj + "," + iobj + "," + lobj + "," + fobj + "," + dobj);

        boolean bool1 = boolobj.booleanValue();
        char c1 = cobj.charValue();
        byte b1 = bobj.byteValue();
        short s1 = sobj.shortValue();
        int i1 = iobj.intValue();
        long l1 = lobj.longValue();
        float f1 = fobj.floatValue();
        double d1 = dobj.doubleValue();

        System.out.println("Unboxing Values:");
        System.out.println(bool1 + "," + c1 + "," + b1 + "," + s1 + "," + i1 + "," + l1 + "," + f1 + "," + d1);
    }
}
