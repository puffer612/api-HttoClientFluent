Feature: 获取用户验证码
  Scenario Outline: 初始化
    Given api "sc/captcha/captcha"
    When 当请求方式是post
    Then 断言结果"TrueRelust"="value"
    Examples:
      | TrueRelust | value  |
      | result     | 000000 |