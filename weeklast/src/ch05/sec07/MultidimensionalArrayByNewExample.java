package ch05.sec07;

// “반마다 학생 수가 같은 경우(mathScores)와 다른 경우(englishScores) 모두 2차원 배열로 생성하여 전체 학생의 평균 점수를 계산하는 예제.”


public class MultidimensionalArrayByNewExample {
    public static void main(String[] args) {
        // 수학 반별 학생 점수 저장을 위한 2차원 배열 생성
        int[][] mathScores = new int[2][3];

        // 2차원 배열의 기본값(초기화 상태) 출력
        for (int i = 0; i < mathScores.length; i++) {           // 반의 수만큼 반복
            for (int k = 0; k < mathScores[i].length; k++) {    // 해당 반의 학생 수만큼 반복
                System.out.println("mathScores[" + i + "][" + k + "]: " + mathScores[i][k]);
            }
        }

        System.out.println();

        // 각 반의 학생 점수 대입
        mathScores[0][0] = 80;
        mathScores[0][1] = 83;
        mathScores[0][2] = 85;
        mathScores[1][0] = 86;
        mathScores[1][1] = 90;
        mathScores[1][2] = 92;

        // 전체 수학 평균 점수 구하기
        int totalMathStudent = 0;
        int totalMathSum = 0;

        for (int i = 0; i < mathScores.length; i++) {          // 반 반복
            totalMathStudent += mathScores[i].length;          // 학생 수 합산
            for (int k = 0; k < mathScores[i].length; k++) {   // 학생 점수 합산
                totalMathSum += mathScores[i][k];
            }
        }

        double totalMathAvg = (double) totalMathSum / totalMathStudent;
        System.out.println("전체 학생의 수학 평균 점수: " + totalMathAvg);
        System.out.println();

        // 영어 점수를 위한 2차원 배열 생성 (반마다 학생 수 다름)
        int[][] englishScores = new int[2][];
        englishScores[0] = new int[2];   // 1반: 2명
        englishScores[1] = new int[3];   // 2반: 3명

        // 2차원 배열 구조 확인
        for (int i = 0; i < englishScores.length; i++) {
            for (int k = 0; k < englishScores[i].length; k++) {
                System.out.println("englishScores[" + i + "][" + k + "]: " + englishScores[i][k]);
            }
        }

        System.out.println();

        // 각 반의 영어 점수 대입
        englishScores[0][0] = 90;
        englishScores[0][1] = 91;
        englishScores[1][0] = 92;
        englishScores[1][1] = 93;
        englishScores[1][2] = 94;

        // 전체 영어 평균 점수 구하기
        int totalEnglishStudent = 0;
        int totalEnglishSum = 0;

        for (int i = 0; i < englishScores.length; i++) {          // 반 반복
            totalEnglishStudent += englishScores[i].length;       // 학생 수 합산
            for (int k = 0; k < englishScores[i].length; k++) {   // 학생 점수 합산
                totalEnglishSum += englishScores[i][k];
            }
        }

        double totalEnglishAvg = (double) totalEnglishSum / totalEnglishStudent;
        System.out.println("전체 학생의 영어 평균 점수: " + totalEnglishAvg);
    }
}
