-- 코드를 작성해주세요
select fi.id as ID, fni.fish_name as FISH_NAME, fi.length as LENGTH
from fish_info fi
join fish_name_info fni on fni.fish_type = fi.fish_type
where (fi.fish_type, fi.length) in (
select fish_type, max(length)
from fish_info
group by fish_type)
order by id;