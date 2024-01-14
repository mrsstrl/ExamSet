//Lass uns malen!
/*(4-1)*/
public class TaskSexthwinkwink {

    /*public static void main(String[] args) {
        System.out.println(draw(1, 1));
        System.out.println(draw(1, 3));
        System.out.println(draw(2, 1));
        System.out.println(draw(2, 4));
        System.out.println(draw(3, 2));
        System.out.println(draw(3, 4));
        System.out.println(draw(5, 3));
        System.out.println(draw(4, 4));
        System.out.println(draw(6, 5));
        System.out.println(draw(7, 9));
    }

    public static String draw(int h, int w) {
        if (h < 1 || w < 1) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(drawTopBottom(w));
        if (h == 1) {
            return sb.toString();
        }

        for (int i = 1; i < h - 1; i++) {
            if (i == 1 || i == h - 2) {
                sb.append(drawInner(w, true));
            } else {
                sb.append(drawInner(w, false));
            }
        }

        sb.append(drawTopBottom(w));
        return sb.toString();
    }

    public static String drawTopBottom(int w) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < w; i++) {
            sb.append("*");
        }
        sb.append("\n");
        return sb.toString();
    }

    public static String drawInner(int w, boolean isCorner) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < w; i++) {
            if (i == 0 || i == w - 1) {
                sb.append("*");
            } else if (i == 1 || i == w - 2 || isCorner) {
                sb.append("#");
            } else {
                sb.append(" ");
            }
        }
        sb.append("\n");
        return sb.toString();
    }
    //4-2
    public static void main(String[] args) {
        System.out.println(draw(1, 1));
        System.out.println(draw(1, 3));
        System.out.println(draw(6, 1));
        System.out.println(draw(2, 3));
        System.out.println(draw(5, 2));
        System.out.println(draw(3, 4));
        System.out.println(draw(5, 3));
        System.out.println(draw(4, 4));
        System.out.println(draw(6, 5));
        System.out.println(draw(5, 8));
    }

    public static String draw(int h, int w) {
        if (h < 1 || w < 1) {
            return "";
        }
        StringBuilder result = new StringBuilder();
        result.append(drawTopBottom(w));
        if (h == 1) {
            return result.toString();
        }
        for (int i = 1; i < h - 1; i++) {
            result.append(drawInner(w, i));
        }
        result.append(drawTopBottom(w));
        return result.toString();
    }

    public static String drawTopBottom(int w) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < w; i++) {
            if (i == 0 || i == w - 1) {
                result.append("*");
            } else {
                result.append("-");
            }
        }
        result.append("\n");
        return result.toString();
    }

    public static String drawInner(int w, int h) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < w; i++) {
            if (i == 0 || i == w - 1) {
                result.append("|");
            } else if (h % 2 == 1) {
                result.append("\\");
            } else if (h % 2 == 0) {
                result.append("/");
            }
        }
        result.append("\n");
        return result.toString();
    }
    public static void main(String[] args) {
        for (int i = 1; i < 7; i++) {
            System.out.println(draw(i));
        }
    }

    public static String draw(int h) {
        if (h < 1) {
            return "";
        }
        StringBuilder result = new StringBuilder();
        result.append(drawBottom(h));
        if (h == 1) {
            return result.toString();
        }
        for (int j = 1; j < h; j++) {
            result.append(drawInner(h * 2, j));
        }
        return result.toString();
    }

    public static String drawBottom(int h) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < h; i++) {
            result.append("* ");
        }
        result.append("\n");
        return result.toString();
    }

    public static String drawInner(int h, int j) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < h; i++) {//h=12 (2 times the height that was given in the task)
            if (i < j || i > h - j - 2) {
                result.append(" ");
            } else if (i == j || i == h - j - 2) {
                result.append("*");
            } else if (((i % 2 == 0) && (j % 2 == 0)) || ((i % 2 == 1) && (j % 2 == 1))) {
                result.append("@");
            } else {
                result.append(" ");
            }
        }
        result.append("\n");
        return result.toString();
    }*/
    public static void main(String[] args) {
        for (int i = 3; i <= 5; i++) {
            System.out.println(draw(i));
        }

    }

    public static String draw(int h) {
        if (h < 3) {
            return "";
        }
        StringBuilder result = new StringBuilder();
        result.append(drawTopBottom(h));
        for (int i = 1; i < h - 1; i++) {
            result.append(drawInner(h, i));
        }
        result.append(drawTopBottom(h));
        return result.toString();
    }

    public static String drawTopBottom(int h) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < h; i++) {
            if (i != 0 && i != h - 1) {
                result.append("-");
            } else {
                result.append(" ");
            }
        }
        result.append("\n");
        return result.toString();
    }

    public static String drawInner(int h, int i) {
        StringBuilder result = new StringBuilder();
        result.append("|");
        for (int j = 1; j < h - 1; j++) {
            if ((h - i - 1 > j) || (h - i - 1 < j)) {
                result.append(" ");
            } else {
                result.append("/");
            }

        }
        result.append("|");
        result.append("\n");
        return result.toString();
    }
}