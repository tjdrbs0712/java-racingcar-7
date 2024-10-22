package racingcar.view;

import camp.nextstep.edu.missionutils.Console;
import racingcar.validation.Validator;

public class InputView {

    public String inputCarName(){
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        return Console.readLine();
    }

    public int getAttemptCount(){
        System.out.println("시도할 횟수는 몇 회인가요?");
        String count = Console.readLine();
        return Validator.checkIfNumber(count);
    }
}
