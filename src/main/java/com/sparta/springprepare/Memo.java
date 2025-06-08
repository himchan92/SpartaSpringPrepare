package com.sparta.springprepare;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor //모든 필드 생성자
@NoArgsConstructor //기본 생성자
public class Memo {
    private String username;
    private String contents;
}
