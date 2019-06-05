package arithmetic;

/**
 * Created by Administrator on 2018/11/5 0005.
 */
public class Main {

    public static void main(String[] args) {

        //深度搜索
        deepSearch();

        //广度搜索
        breadSearch();

        //动态规划
        dynamicProgramming();

        //动态规划 空间优化 状态压缩
        DpCompressed();

        String aaa;


    }

    private static void DpCompressed(){
        int[][] matrix1 = {
                {300, 500, 560, 400, 160},
                {1000, 100, 200, 340, 690},
                {600, 500, 500, 460, 320},
                {300, 400, 250, 210, 760}
        };

        int[][] matrix2 = {
                {300, 500, 2560, 400},
                {1000, 100, 200, 340},
                {600, 500, 500, 460},
                {300, 400, 250, 210},
                {860, 690, 320, 760}
        };

        DpCompressed dp = new DpCompressed();

        System.out.println(dp.getMaxAward(matrix1));

        System.out.println(dp.getMaxAward(matrix2));

    }


    private static void dynamicProgramming() {
        int[][] matrix1 = {
                {300, 500, 560, 400, 160},
                {1000, 100, 200, 340, 690},
                {600, 500, 500, 460, 320},
                {300, 400, 250, 210, 760}
        };

        int[][] matrix2 = {
                {300, 500, 2560, 400},
                {1000, 100, 200, 340},
                {600, 500, 500, 460},
                {300, 400, 250, 210},
                {860, 690, 320, 760}
        };

        DynamicProgramming dp = new DynamicProgramming();

        System.out.println(dp.getMaxAward(matrix1));
        dp.printBestPath();

        System.out.println(dp.getMaxAward(matrix2));
        dp.printBestPath();
    }

    private static void breadSearch() {
        int[][] matrix1 = {
                {300, 500, 560, 400, 160},
                {1000, 100, 200, 340, 690},
                {600, 500, 500, 460, 320},
                {300, 400, 250, 210, 760}
        };

        int[][] matrix2 = {
                {300, 500, 2560, 400},
                {1000, 100, 200, 340},
                {600, 500, 500, 460},
                {300, 400, 250, 210},
                {860, 690, 320, 760}
        };

        BreadthFirstSearch dp = new BreadthFirstSearch();

        System.out.println(dp.getMaxAward(matrix1));
        dp.printBestPath();

        System.out.println(dp.getMaxAward(matrix2));
        dp.printBestPath();
    }

    private static void deepSearch() {
        int[][] matrix1 = {
                {300, 500, 560, 400, 160},
                {1000, 100, 200, 340, 690},
                {600, 500, 500, 460, 320},
                {300, 400, 250, 210, 760}
        };

        int[][] matrix2 = {
                {300, 500, 2560, 400},
                {1000, 100, 200, 340},
                {600, 500, 500, 460},
                {300, 400, 250, 210},
                {860, 690, 320, 760}
        };

        DeepFirstSearch dp = new DeepFirstSearch();

        System.out.println(dp.getMaxAward(matrix1));
        dp.printBestPath();

        System.out.println(dp.getMaxAward(matrix2));
        dp.printBestPath();
    }
}