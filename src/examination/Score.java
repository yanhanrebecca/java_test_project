package examination;
/*
1. score数组存放多个人的成绩,getUpScore()方法返回高于平均分的人数,并将高于平均分的成绩存入up数组。
2. getUpScore()方法先计算score数组的平均分,然后遍历score数组,如果成绩大于平均分,就存入up数组,并统计人数count。
3. 最后返回高于平均分的人数count。
4. main()方法调用getUpScore()方法,得到高于平均分的人数和up数组,并打印输出。
5. 这样就测试了getUpScore()方法的实现,满足作业要求。
 */
public class Score {
    private int[] score = {24, 35, 88, 76, 90, 54, 59, 66, 96};

    public int getUpScore(int[] up) {
        int sum = 0;
        for (int i = 0; i < score.length; i++) {
            sum += score[i];
        }
        int avg = sum / score.length;

        int count = 0;
        for (int i = 0; i < score.length; i++) {
            if (score[i] > avg) {
                up[count++] = score[i];
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Score s = new Score();
        int[] up = new int[5];
        int count = s.getUpScore(up);

        System.out.println("高于平均分的人数:" + count);
        for (int i = 0; i < count; i++) {
            System.out.print(up[i] + "  ");
        }
    }
}