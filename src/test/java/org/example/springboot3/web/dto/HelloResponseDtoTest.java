package org.example.springboot3.web.dto;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.assertj.core.api.Assertions;
import static org.assertj.core.api.Assertions.assertThat;
/**
 * packageName    : org.example.springboot3.web.dto
 * fileName       : HelloResponseDtoTest
 * author         : Yeong-Huns
 * date           : 2024-06-09
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-06-09        Yeong-Huns       최초 생성
 */
class HelloResponseDtoTest {

    @Test
    @DisplayName("롬복_기능_테스트")
    void getName() {
        //GIVEN
        String name = "Test";
        int amount = 1000;

        //when
        HelloResponseDto helloResponseDto = new HelloResponseDto(name, amount);

        //then
        assertThat(helloResponseDto.getName()).isEqualTo(name);
        assertThat(helloResponseDto.getAmount()).isEqualTo(amount);
    }
}