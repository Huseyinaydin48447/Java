
package jazari.example;

import jazari.matrix.CMatrix;

public class TestHisteqTest2 {
    
    public static void main(String[] args) {
         
        CMatrix cm = CMatrix.getInstance()
                //.rand(150, 150)
                .imread("images/artificial.jpg")
                .rgb2gray()
                .addNoise(5.5f)
                //.map(0, 255)
                .imshow();
        float[][] d = cm.toFloatArray2D();

        for (int i = 0; i < 3; i++) {
            d = meanFilter(d);
            //CMatrix.getInstance(d).imshow();
        }
        CMatrix.getInstance(d).imshow();
    }
    
    private static float[][] meanFilter(float[][] d) {
        float[][] fm = new float[d.length][d[0].length];
        float[][] kernel = {{1, 1, 1}, {1, 1, 1}, {1, 1, 1}};
        for (int i = 1; i < d.length - 1; i++) {
            for (int j = 1; j < d[0].length - 1; j++) {
                fm[i][j] = applyFilter(crop(d, i, j, kernel.length), kernel);
            }
        }
        return fm;
    }

    private static float[][] crop(float[][] d, int i, int j, int size) {
        float[][] ret = new float[size][size];
        for (int k = 0; k < size; k++) {
            for (int l = 0; l < size; l++) {
                ret[k][l] = d[i - size / 2 + k][j - size / 2 + l];
            }
        }
        return ret;
    }

    private static float applyFilter(float[][] img, float[][] kernel) {
        float sum = 0;
        for (int i = 0; i < img.length; i++) {
            for (int j = 0; j < img[0].length; j++) {
                sum += img[i][j] * kernel[i][j];
            }
        }
        float avg = sum / (img.length * img.length);
        
         return avg;
    }
}
