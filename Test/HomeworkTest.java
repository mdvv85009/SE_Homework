import org.junit.Assert;
import org.junit.jupiter.api.Test;

class HomeworkTest {


    @Test
    void TestPartitionOfScore() {
        Assert.assertEquals('A', Homework.letterGrade(95));
        Assert.assertEquals('B', Homework.letterGrade(85));
        Assert.assertEquals('C', Homework.letterGrade(75));
        Assert.assertEquals('D', Homework.letterGrade(65));
        Assert.assertEquals('F', Homework.letterGrade(30));
        Assert.assertEquals('X', Homework.letterGrade(-10));
        Assert.assertEquals('X', Homework.letterGrade(110));
    }

    @Test
    void TestBoundaryOfScore() {
        Assert.assertEquals('A', Homework.letterGrade(100));
        Assert.assertEquals('A', Homework.letterGrade(90));
        Assert.assertEquals('B', Homework.letterGrade(80));
        Assert.assertEquals('C', Homework.letterGrade(70));
        Assert.assertEquals('D', Homework.letterGrade(60));
        Assert.assertEquals('F', Homework.letterGrade(0));
    }
}













