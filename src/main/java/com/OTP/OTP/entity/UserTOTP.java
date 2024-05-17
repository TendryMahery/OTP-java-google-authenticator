package com.OTP.OTP.entity;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class UserTOTP {
      private String username;
      private String secretKey;
      private int validationCode;
      private List<Integer> scratchCodes;
}
