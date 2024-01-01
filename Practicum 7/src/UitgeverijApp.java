public class UitgeverijApp {
    public static void main(String[] args) {
        StringProcessor processor = new StringProcessor();
        processor.voegProcesToe(new VervangProces("hij", "hij/zij"));
        processor.voegProcesToe(new HoofdletterProces());
        String inputString = "Een student loopt meestal in het derde jaar stage. Dan moet hij zelf een stageplek vinden.";
        String result = processor.verwerk(inputString);
        System.out.println(result);

        StringProcessor processorCustom = new StringProcessor();
        processorCustom.voegProcesToe(new VervangProces("hij", "hij/zij"));
        processorCustom.voegProcesToe(new KleineLetterProces());
        String inputCustomString = "Een student loopt meestal in het derde jaar stage. Dan moet hij zelf een stageplek vinden.";
        String customResult = processorCustom.verwerk(inputCustomString);
        System.out.println(customResult);
    }
}