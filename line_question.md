```
문제
n 개의 node로 이루어진 임의의 directed graph가 주어졌을 때, 길이가 m인 cycle의 존재 여부를 출력하는 프로그램을 작성하시오.

Directed graph 란, 어떤 node A에서 다른 node B로 이동할 수 있는 edge가 존재한다고 해서, B에서 다시 A로 이동할 수 있는 edge가 항상 존재하지는 않는 graph이다.
이 문제에서의 cycle은 다음 조건을 모두 만족하는 sequence로 정의한다.
0 ≤ i < m-1 에 해당하는 i에 대해, i번째 node에서 i+1번째 node로 이동하는 edge가 존재해야 한다.
마지막 node에서 첫번째 node로 이동하는 edge가 존재해야 한다.
동일한 node가 여러번 sequence에 등장할 수 있다

구현해야 하는 method의 signature는 다음과 같다.

bool findCycle(boolean[][] graph, int m) {
 // assume graph is NxN adjacency matrix
 // TODO : Implement
}
graph[x][y]의 값이 true인 경우, x에서 y로 가는 edge가 존재하고, false인 경우, edge가 존재하지 않는다.

입력
입력의 첫 줄에는 노드의 개수 N이 주어진다.  
그 다음 N개의 줄로 각 Node와의 연관 관계가 주어진다. 줄 순서대로 node가 각 줄의  index위치의 글자를 통해  i번째 node로 이동 하는 edge가 존재 여부를  나타낸다. 이때 0은 edge가 존재하지 않음, 1은 존재 함을 의미한다.
입력의 마지막 줄은 cycle을 찾을 길이 m이 주어진다.

아래와 같은 입력이 주어질 수 있으며

4
0111
1000
1000 
0010
3
이것은 아래와 같은 실행을 의도 하는 것이다.

boolean[][] graph = {
 {false,true,true,true},
 {true,false,false,false},
 {true,false,false,false},
{false,false,true,false}
};
findCycle(graph, 3);

출력
1) Cycle이 있는 경우

첫줄에 1을 출력 한다.

1
위 입력 예제에서, graph[0][3], graph[3][2], graph[2][0]이 모두 true이므로. 0,3,2는 길이 3인 cycle의 조건을 만족한다.

2) Cycle이 없는 경우

첫줄에 0을 출력 한다.

0
```

