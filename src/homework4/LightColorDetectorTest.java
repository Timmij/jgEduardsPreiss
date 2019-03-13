package homework4;

public class LightColorDetectorTest {

    public static void main(String[] args) {

        LightColorDetectorTest test = new LightColorDetectorTest();

        test.shouldDetectRed();
        test.shouldDetectOrange();
        test.shouldDetectYelow();
        test.shouldDetectGreen();
        test.shouldDetectBlue();
        test.shouldDetectViolet();

    }

    public void shouldDetectRed (){

            LightColorDetector detector = new LightColorDetector();
            String result = detector.detect(650);
            compareResult(result.equals("Red"),"shouldDetectRed");
        }
    public void shouldDetectOrange (){

        LightColorDetector detector = new LightColorDetector();
        String result = detector.detect(619);
        compareResult(result.equals("Orange"),"shouldDetectOrange");
    }
    public void shouldDetectYelow (){

        LightColorDetector detector = new LightColorDetector();
        String result = detector.detect(590);
        compareResult(result.equals("Yelow"),"shouldDetectYelow");
    }
    public void shouldDetectGreen (){

        LightColorDetector detector = new LightColorDetector();
        String result = detector.detect(500);
        compareResult(result.equals("Green"),"shouldDetectGreen");
    }
    public void shouldDetectBlue (){

        LightColorDetector detector = new LightColorDetector();
        String result = detector.detect(460);
        compareResult(result.equals("Blue"),"shouldDetectBlue");
    }
    public void shouldDetectViolet (){

        LightColorDetector detector = new LightColorDetector();
        String result = detector.detect(380);
        compareResult(result.equals("Violet"),"shouldDetectViolet");
    }

        void compareResult (boolean result, String testname){
            if (result){
                System.out.println(testname + " OK ");
            } else {
                System.out.println(testname + " FAIL");
            }
        }
    }






