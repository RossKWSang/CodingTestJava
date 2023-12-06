package HyunJun.character.week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class baekjoon10431 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int dataCnt = br.read();
        int backWalkCnt;
        for(int i=0; i< dataCnt; i++){
            List<Integer> list = Arrays.stream(br.readLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .boxed()
                    .collect(Collectors.toCollection(LinkedList::new));

            backWalkCnt = 0;
            for(int j=1; j<dataCnt; j++){
                if (list.get(j) > list.get(i) ){
                    list.set(j, list.get(i));
                    list.remove(list.get(i));
                    backWalkCnt += (dataCnt- j);
                }

                System.out.println(list.get(0)+" "+backWalkCnt);
            }
        }

    }}
