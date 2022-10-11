-- 그룹별 조건에 맞는 식당 목록 출력하기
-- JOIN문제
-- https://school.programmers.co.kr/learn/courses/30/lessons/131124

-- 코드를 입력하세요
SELECT mp.member_name, rr.review_text, rr.review_date
from member_profile mp, rest_review rr, (
    select member_id, count(*) cnt
    from rest_review
    group by member_id
) counting
where rr.member_id = counting.member_id
and mp.member_id = counting.member_id
and counting.cnt in(
    select max(sub.cnt) from (
        select member_id, count(*) cnt
        from rest_review
        group by member_id
    ) sub
)
order by review_date;