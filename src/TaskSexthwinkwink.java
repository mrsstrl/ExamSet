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
    }*/
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
            for (int j = 1; j< h -1; j++){
                result.append(drawInner(w, h));
            }
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
        for (int i = 1; i < w; i++) {
            for (int j = 1; j < h - 1; j++) {
                if ((i == 1 || i == w - 1) && j > 0) {
                    result.append("|");
                } else if (j % 2 == 0 && i > 0) {
                    result.append("\\");
                } else if (j % 2 == 1 && i > 0) {
                    result.append("/");
                }
            }
        }
        result.append("\n");
        return result.toString();
    }
}


