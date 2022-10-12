public class Runner {
    public static void main(String[] args) {
//        String str1 = "Hello!";  System.out.println(str1.length());
//
//        String str2 = " H e l l o ! ";
//        int len = str2.length();
//        System.out.println(len);
//
//        String str3 = "Is tax 8.5%?";
//        System.out.println(str3.length());
//
//        String str4 = "43";
//        int len2 = str4.length();
//        System.out.println(len2);
//
//        String str5 = "";
//        System.out.println(str5.length());
//
//        String str6 = "Cat says \"MEOW\"!";
//        System.out.println(str6.length());
//
//        String str7 = "\\\"\"\n\\\n";
//        System.out.println(str7.length());

//        String str = "good morning";
//        int strLen = str.length();
//        System.out.println(strLen);

        //practice 2

//        String str1 = "Hello how are you today?";
//        System.out.println(str1.length());
//        System.out.println(str1.indexOf("H"));
//        System.out.println(str1.indexOf("h"));
//        System.out.println(str1.indexOf("l"));
//        System.out.println(str1.indexOf("o"));
//        System.out.println(str1.indexOf("?"));
//        System.out.println(str1.indexOf("ll"));
//        System.out.println(str1.indexOf("ello"));
//        System.out.println(str1.indexOf("lo ho"));
//        System.out.println(str1.indexOf("a"));
//        System.out.println(str1.indexOf("W"));
//        System.out.println(str1.indexOf(" "));
//        System.out.println(str1.indexOf("how are"));
//        System.out.println(str1.indexOf("howare"));
//        System.out.println(str1.indexOf("Are"));
//        System.out.println(str1.indexOf("Hello how are you today?"));
//        System.out.println(str1.indexOf(""));
//
//        int x = str1.indexOf("e") + str1.indexOf("E");
//        System.out.println(x);
//
//        String str2 = "how are you?";
//        System.out.println(str1.indexOf(str2));
//
//        String str3 = "Hello how are you today?";
//        System.out.println(str3.indexOf("You")); // case sensative
//        System.out.println(str3.indexOf("you"));

        //part 3
//        String myString = "AP CSA is awesome!";
//        String subString = myString.substring(10, 13);
//        System.out.println(subString);// prints awe

//        String myString = "AP CSA is awesome!";
//        String subString = myString.substring(0, 4);
//        System.out.println(subString);
//        System.out.println(myString); // subString doesn't affect myString

//        String myString = "AP CSA is awesome!";
//        String s = myString.substring(4,5);
//        System.out.println(s); //prints S
//        String awe = myString.substring(10, 17);
//        System.out.println(awe); //prints awesome

//        String origStr = "Hello how are you today?";
//        String str1 = origStr.substring(0, 13);
//        System.out.println(str1);
//
//        String str2 = origStr.substring(8, 11);
//        System.out.println(str2);
//
//        String str3 = origStr.substring(14, 15);
//        System.out.println(str3);
//
//        String str4 = origStr.substring(0, 1);
//        System.out.println(str4);
//
//        String str5 = origStr.substring(9, 10);
//        System.out.println(str5);
//
//        String str6 = origStr.substring(18, 23);
//        System.out.println(str6);
//
//        String str7 = origStr.substring(20, 24);
//        System.out.println(str7);
//
////        String str8 = origStr.substring(10, 26);
////        System.out.println(str8);
//
//        String str9 = origStr.substring(6,9);
//        System.out.println(str9);
//
//        String blah = "What's for dinner?";
//        String ugh = blah.substring(11,17);
//        System.out.println(ugh);
//
//        String yum = "What’s for dinner?";
//        String din = yum.substring(3, 12).substring(5, 7);
//        System.out.println(din);
//
//        String today = "FRIDAY!";
//        String x = today.substring(3, 7).substring(0, 3).substring(1, 3);
//        System.out.println(x);

        //part 4
//        String blah2 = "What's for dinner?";
//        String ugh2 = blah2.substring(11);
//        System.out.println(ugh2);
//        String ugh3 = blah2.substring(11, 18);
//        System.out.println(ugh3);

//        String tired = "I'm tired!";
//        String end = "Of substrings!";
//
//        String str0 = end.substring(3);
//        System.out.println(str0);
//
//        String str1 = tired.substring(4) + end.substring(3);
//        System.out.println(str1);
//
//        String str2 = tired.substring(9) + tired.substring(6);
//        System.out.println(str2);
//
//        String str3 = end.substring(0, 1) + " " + end.substring(1, 2);
//        System.out.println(str3);
//
//        String str4 = end.substring(6).substring(2);
//        System.out.println(str4);

//        String fire = "CRACKLE!";
//        String witch = "CACKLE!";
//        String str5 = fire.substring(2);
//        System.out.println(str5);
//        String str6 = witch.substring(witch.length() - 4);
//        System.out.println(str6);
//        int loc = str5.indexOf(str6);
//        System.out.println(loc);
//        String str7 = fire.substring(loc, loc + 3);
//        System.out.println("the hidden word is: " + str7);

//        //free style
//        String one = "Computer";
//        String two = "Science";
//        String three = one.substring(3);
//        String four = two.substring(3,7);
//        System.out.println(three +" "+ four);

        //part 5 equal method

//        String str1 = "Hello!";
//        String str2 = "Hello!";
//        System.out.println(str1.equals(str2));
//
//        String str3 = "hello!";
//        System.out.println(str1.equals(str3));
//
//        String str4 = "HELLO!";
//        System.out.println(str1.equals(str4));
//
//        String str5 = "Hello";
//        System.out.println(str1.equals(str5));
//
//        String str6 = "Hello! ";
//        System.out.println(str1.equals(str6));
//
//
//        String one = "one";
//        String two = "One";
//        String three = new String("one");
//        String four = new String("One");
//        System.out.println(one == two); //false
//        System.out.println(three.equals(four)); //false
//        System.out.println(four == two);//false == only works if comparing 2 string literals
//        System.out.println(four.equals(two));//true

        //part 6
        String str1 = "Hello John!";
        String str2 = "My name is Jack.";
        String str3 = "Hello";
        String str4 = "Hello Jack";
        String str5 = "My name is jack.";
        String str6 = "Hello";

        System.out.println(str1.compareTo(str2));
        System.out.println(str2.compareTo(str1));
        System.out.println(str1.compareTo(str4));
        System.out.println(str1.compareTo(str3));
        System.out.println(str3.compareTo(str6));
        System.out.println(str2.compareTo(str5));
        System.out.println(str2.equals(str5));

        String a = "welcome";
        String b = "Welcome";
        String c = "Abc";
        String d = "ABC";

        System.out.println(a.compareTo(b));// positive
        System.out.println(b.compareTo(a));//negative
        System.out.println(c.compareTo(d));//positive
        System.out.println(d.compareTo(c));//negative




    }
}