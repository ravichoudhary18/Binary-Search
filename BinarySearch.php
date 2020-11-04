<?php
function BinarySearch($arr,$l,$r,$x)
{
    while($l <= $r)
    {
        $mid = $l+($r-$l)/2;
        if($arr[$mid]==$x){
            return floor($mid);
        }
        if($arr[$mid] < $x){
            $l = $mid + 1;
        }
        else{
            $l = $mid-1;
        }
    }
    return -1;
}
$arr = array(12,22,24,52,63,64,57,58,96,98,100);
$x = 63;
$n = count($arr);
$result = BinarySearch($arr,0,$n-1,$x);

if($result == -1){
echo "Element is not Present";
}else{
echo $x," is present at index ",$result;
}
?> 