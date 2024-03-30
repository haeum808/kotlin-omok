# kotlin-omok

### UI

- [x] "오목 게임을 시작합니다" 출력.
- [x] 승자 출력
- [x] 룰 위반 시 정보를 알린다.
- [ ] 돌의 좌표를 입력받는다.
  - [x] 입력받은 X좌표는 A에서 O까지이다.
  - [x] 입력받은 Y좌표는 1에서 15까지이다.
- [x] 차례와 이전 좌표를 출력
- [x] 오목판 출력

### Domain

- [x] 흑이 먼저 돌을 둔다
- [x] 흑과 백이 번갈아 가면서 둔다
- [x] 렌주룰
  - [x] 33룰
  - [x] 44룰
  - [x] 6목 체크
- [x] 한 줄로 5개 돌이 연속되어 있을 경우 승리한다
- [x] 오목판이 꽉 차면 게임이 종료된다.
- [ ] 재시작시 오목게임 이어서 진행한다.
    - [ ] 턴 저장
    - [ ] 오목 판 저장
- [ ] 종료 시 보드 비운다.
- [ ] 종료 시 ui를 비운다.