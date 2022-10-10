package Programmers;

import java.util.LinkedList;
import java.util.Queue;

public class Test39 {
	
	// 백준 코딩테스트 - 프린터
	// Queue 구현 문제
	// https://school.programmers.co.kr/learn/courses/30/lessons/42587

	public static void main(String[] args) {
		
	}
	
	public static int solution(int[] priorities, int location) {

        Queue<priorObject> queue = new LinkedList<>();

        for (int i = 0; i < priorities.length; i++) {
            queue.add(new priorObject(priorities[i], i));
        }
        int cnt = 0;
        while(!queue.isEmpty()) {
            int top = 0;
            for (priorObject prior : queue) {
                int val = prior.getValue();
                if(top < val) {
                    top = val;
                }
            }
            priorObject peek = queue.peek();
            if(peek.getValue() >= top) {
                priorObject poll = queue.poll();
                cnt++;
                if(poll.getIndex() == location) {
                    return cnt;
                }
            } else {
                queue.offer(queue.poll());
            }
        }	
        return 0;
	}
	
    static class priorObject {
        Integer value;
        int index;

        public priorObject(Integer value, int index) {
            this.value = value;
            this.index = index;
        }

        public Integer getValue() {
            return value;
        }

        public void setValue(Integer value) {
            this.value = value;
        }

        public int getIndex() {
            return index;
        }

        public void setIndex(int index) {
            this.index = index;
        }
    }

}
