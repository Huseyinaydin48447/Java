package bilinearınterpolation;

public class BilinearInterpolation {
    public static void main(String[] args) {
        int[][] d = { { 65, 121 }, { 93, 37 } };
        int[][] resized = new int[6][6];

        int originalWidth = d[0].length;
        int originalHeight = d.length;

        int resizedWidth = resized[0].length;
        int resizedHeight = resized.length;

        for (int i = 0; i < resizedHeight; i++) {
            for (int j = 0; j < resizedWidth; j++) {
                float xOran = j / (float) (resizedWidth - 1) * (originalWidth - 1);
                float yOran = i / (float) (resizedHeight - 1) * (originalHeight - 1);

                int x = (int) xOran;
                int y = (int) yOran;

                float xFark = xOran - x;
                float yFark = yOran - y;

                int topLeft = d[y][x];
                int topRight = x < originalWidth - 1 ? d[y][x + 1] : topLeft;
                int bottomLeft = y < originalHeight - 1 ? d[y + 1][x] : topLeft;
                int bottomRight = (x < originalWidth - 1 && y < originalHeight - 1) ? d[y + 1][x + 1] : topLeft;

                int value = (int) (
                        topLeft * (1 - xFark) * (1 - yFark) +
                        topRight * xFark * (1 - yFark) +
                        bottomLeft * (1 - xFark) * yFark +
                        bottomRight * xFark * yFark
                );

                resized[i][j] = value;
            }
        }

        for (int i = 0; i < resizedHeight; i++) {
            for (int j = 0; j < resizedWidth; j++) {
                System.out.print(resized[i][j] + " ");
            }
            System.out.println();
        }
    }
}
