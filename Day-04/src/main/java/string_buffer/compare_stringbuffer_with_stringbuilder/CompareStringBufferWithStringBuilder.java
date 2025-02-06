package string_buffer.compare_stringbuffer_with_stringbuilder;

public class CompareStringBufferWithStringBuilder {
    public static void main(String[] agrs){
        String input="Nancy";
        int Iteration=1000000;

        //measure string buffer performance
        StringBuffer stringBuffer=new StringBuffer();
        long startTime=System.nanoTime();

        for(int i=0;i<=Iteration;i++){
            stringBuffer.append(input);
        }

        long endTime=System.nanoTime();
        long stringBufferTime=endTime-startTime;
        System.out.println("Time taken by StringBuffer:"+stringBufferTime);

        //measure StringBuilder performance
        StringBuilder stringBuilder=new StringBuilder();
        startTime=System.nanoTime();

        for(int i=0;i<Iteration;i++){
            stringBuilder.append(i);
        }
        endTime=System.nanoTime();
        long StringBuilderTime=endTime-startTime;
        System.out.println("Time taken by StringBuilder:"+StringBuilderTime);

        //compare
        if(stringBufferTime>StringBuilderTime){
            System.out.println("StringBuffer is faster by "+ (stringBufferTime-StringBuilderTime)+"ms");
        }
        System.out.println("StringBuilder is Faster by "+(StringBuilderTime-stringBufferTime)+"ms");
    }
}
