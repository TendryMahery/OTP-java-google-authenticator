package com.OTP.OTP.entity;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ValidateCodeDto {
    private Integer code;
    private String username;
}
