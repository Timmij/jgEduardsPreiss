package homework4;

//ctrl + alt + l
public class LightColorDetectorTest {

    public static void main(String[] args) {

        LightColorDetectorTest test = new LightColorDetectorTest();

        test.shouldDetectRed();
        test.shouldDetectOrange();
        test.shouldDetectYelow();
        test.shouldDetectGreen();
        test.shouldDetectBlue();
        test.shouldDetectViolet();
//lieka rinda
    }

    public void shouldDetectRed (){
//lieka rinda
            LightColorDetector detector = new LightColorDetector();
            String result = detector.detect(650);
            compareResult(result.equals("Red"),"shouldDetectRed");
        }
    public void shouldDetectOrange (){
//lieka rinda
        LightColorDetector detector = new LightColorDetector();
        String result = detector.detect(619);
        compareResult(result.equals("Orange"),"shouldDetectOrange");
    }
    public void shouldDetectYelow (){ //Yellow
//lieka rinda
        LightColorDetector detector = new LightColorDetector();
        String result = detector.detect(590);
        compareResult(result.equals("Yelow"),"shouldDetectYelow");
    }
    public void shouldDetectGreen (){
//lieka rinda
        LightColorDetector detector = new LightColorDetector();
        String result = detector.detect(500);
        compareResult(result.equals("Green"),"shouldDetectGreen");
    }
    public void shouldDetectBlue (){
//lieka rinda
        LightColorDetector detector = new LightColorDetector();
        String result = detector.detect(460);
        compareResult(result.equals("Blue"),"shouldDetectBlue");
    }
    public void shouldDetectViolet (){
//lieka rinda
        LightColorDetector detector = new LightColorDetector();
        String result = detector.detect(380);
        compareResult(result.equals("Violet"),"shouldDetectViolet");
    }

    //šim jābūt private
        void compareResult (boolean result, String testname){ //testName = camelCase parametriem
            if (result){
                System.out.println(testname + " OK ");
            } else {
                System.out.println(testname + " FAIL");
            }
        }
    }






