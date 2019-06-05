package huarongdao;


import com.alibaba.fastjson.JSONObject;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class HuaRongDao {


    //多线程执行
    public Object getUserInfo() throws ExecutionException, InterruptedException {
        //Callable
        Callable<JSONObject> userinfoCallable = new Callable() {
            @Override
            public Object call() throws Exception {
                //要执行的方法  和业务逻辑
                return null;
            }
        };
        Callable<JSONObject> userinfoCallable1 = new Callable() {
            @Override
            public Object call() throws Exception {
                //要执行的方法  和业务逻辑
                return null;
            }
        };
        //包装为
        FutureTask<JSONObject> userInfoTask = new FutureTask<JSONObject>(userinfoCallable);
        FutureTask<JSONObject> userInfoTask1 = new FutureTask<JSONObject>(userinfoCallable1);
        //多线程运行
        new Thread(userInfoTask).start();
        new Thread(userInfoTask1).start();

        JSONObject result = new JSONObject();
        //get方法会让main线程执行完毕
        result.putAll(userInfoTask.get());
        result.putAll(userInfoTask1.get());
        return null;

    }

    // 定义方向
    public static final int LEFT = 1;
    public static final int RIGHT = 2;
    public static final int UP = 3;
    public static final int DOWN = 4;

    // 3x3的九宫格
    private int[][] arr;

    // 记录空格的位置
    private int x;
    private int y;

    // 定义移动的数组
    private List<Integer> moveArr = new LinkedList<Integer>();

    // 初始化，数字0代表空格，先遍历，找出空格的位置
    public HuaRongDao(int[][] arr) {
        this.arr = arr;
        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr.length; j++) {
                if(arr[i][j] == 0) {
                    x = i;
                    y = j;
                }
            }
        }
    }

    // 判断是否可以朝某个方向进行移动
    public boolean canMove(int direction) {
        switch (direction) {
            // y > 0才能左移
            case LEFT:
                return y > 0;
            // y < 2才能右移
            case RIGHT:
                return y < 2;
            // x > 0才能上移
            case UP:
                return x > 0;
            // x < 2才能下移
            case DOWN:
                return x < 2;
        }
        return false;
    }

    // 朝某个方向进行移动，该函数不作判断，直接移动
    // 调用前请自行用canMove先行判断
    public void move(int direction) {
        int temp;
        switch (direction) {
            // 空格和左侧数字交换
            case LEFT:
                temp = arr[x][y - 1];
                arr[x][y - 1] = 0;
                arr[x][y] = temp;
                y = y - 1;
                break;
            // 空格和右侧数字交换
            case RIGHT:
                temp = arr[x][y + 1];
                arr[x][y + 1] = 0;
                arr[x][y] = temp;
                y = y + 1;
                break;
            // 空格和上方数字交换
            case UP:
                temp = arr[x - 1][y];
                arr[x - 1][y] = 0;
                arr[x][y] = temp;
                x = x - 1;
                break;
            // 空格和下方数字交换
            case DOWN:
                temp = arr[x + 1][y];
                arr[x + 1][y] = 0;
                arr[x][y] = temp;
                x = x + 1;
                break;
        }
    }

    // 打印当前华容道的状态
    public void print() {
        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr.length; j++) {
                System.out.print(arr[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }

}