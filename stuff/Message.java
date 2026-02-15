package stuff;

import java.util.Scanner;

public class Message {
    static Long longInput(String varName, boolean isNullable, Long upperBound, Long lowerBound) {
        Scanner sc = new Scanner(System.in);
        boolean badInput = true;
        long ret = 0L;

        String request = "Input " + varName;
        request += ": [long ";
        if (!isNullable || upperBound != null || lowerBound != null) {
            if (!isNullable) { request += "| Cannot be null "; }
            if (lowerBound != null) { request += "| >" + lowerBound.toString(); }
            if (upperBound != null) { request += "| <" + upperBound.toString(); }
        }
        request = request.stripTrailing() + "]\n>>> ";

        while (badInput) {
            try {
                System.out.print(request);
                String temp = sc.nextLine();
                if (temp.isBlank() && isNullable) {return null;}
                ret = Long.parseLong(temp);
                if (upperBound != null && ret >= upperBound) { System.out.println("Input out of range :("); }
                else if (lowerBound != null && ret <= lowerBound) { System.out.println("Input out of range :("); }
                else { badInput = false; }
            } catch (NumberFormatException e) {
                System.out.println("Bad input :(");
            }
        }
        return ret;
    }

    static Integer intInput(String varName, boolean isNullable, Integer upperBound, Integer lowerBound) {
        Scanner sc = new Scanner(System.in);
        boolean badInput = true;
        int ret = 0;

        String request = "Input " + varName;
        request += ": [int ";
        if (!isNullable || upperBound != null || lowerBound != null) {
            if (!isNullable) { request += "| Cannot be null "; }
            if (lowerBound != null) { request += "| >" + lowerBound.toString() + " "; }
            if (upperBound != null) { request += "| <" + upperBound.toString() + " "; }
        }
        request = request.stripTrailing() + "]\n>>> ";

        while (badInput) {
            try {
                System.out.print(request);
                String temp = sc.nextLine();
                if (temp.isBlank() && isNullable) {return null;}
                ret = Integer.parseInt(temp);
                if (upperBound != null && ret >= upperBound) { System.out.println("Input out of range :("); }
                else if (lowerBound != null && ret <= lowerBound) { System.out.println("Input out of range :("); }
                else { badInput = false; }
            } catch (NumberFormatException e) {
                System.out.println("Bad input :(");
            }
        }
        return ret;
    }

    static Float floatInput(String varName, boolean isNullable, Float upperBound, Float lowerBound) {
        Scanner sc = new Scanner(System.in);
        boolean badInput = true;
        float ret = 0f;

        String request = "Input " + varName;
        request += ": [float ";
        if (!isNullable || upperBound != null || lowerBound != null) {
            if (!isNullable) { request += "| Cannot be null "; }
            if (lowerBound != null) { request += "| >" + lowerBound.toString(); }
            if (upperBound != null) { request += "| <" + upperBound.toString(); }
        }
        request = request.stripTrailing() + "]\n>>> ";

        while (badInput) {
            try {
                System.out.print(request);
                String temp = sc.nextLine();
                if (temp.isBlank() && isNullable) {return null;}
                ret = Float.parseFloat(temp);
                if (upperBound != null && ret >= upperBound) { System.out.println("Input out of range :("); }
                else if (lowerBound != null && ret <= lowerBound) { System.out.println("Input out of range :("); }
                else { badInput = false; }
            } catch (NumberFormatException e) {
                System.out.println("Bad input :(");
            }
        }
        return ret;
    }


}
