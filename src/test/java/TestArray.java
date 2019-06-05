public class TestArray {


    public static void main(String args[]) {
        //原有序数组,这里约定数组是升序排列
        int[] intArray = new int[]{1, 2, 3, 5, 6, 7, 8};

        int toInsert = 4;//待插入数据
        int subscript = 0;//下标

        //确定下标位置
        if (toInsert < intArray[0]) {
            subscript = 0;
        } else if (toInsert > intArray[intArray.length - 1]) {
            subscript = intArray.length;
        } else {
            //循环，确定插入下标位置
            for (int i = 0; i < intArray.length; i++) {
                if (toInsert == intArray[i]) {
                    subscript = i;
                }
                if (toInsert > intArray[i] && toInsert < intArray[i + 1]) {
                    subscript = i + 1;
                }
            }
        }

        //定义新数组，将toInsert数据插入数组中
        int[] newArray = new int[intArray.length + 1];
        for (int i = 0; i < intArray.length + 1; i++) {
            if (i < subscript) {
                newArray[i] = intArray[i];
            }
            if (i == subscript) {
                newArray[i] = toInsert;
            }
            if (i > subscript) {
                newArray[i] = intArray[i - 1];
            }
        }
    //打印插入数据后的新数组
        for (int i : newArray) {
            System.out.println(i);
        }
        System.out.println("插入下标为：" + subscript);
    }


}
