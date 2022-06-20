
func longestPalindrome(s string) string {
    if len(s)<2{
        return s
    }

    ch := "#"
    input := getStr(s,ch)

    arm := []int{}

    maxLen,maxMid,armRight,armMid:=0,0,0,0

    for i:=0;i<len(input);i++{
        armLen:=0
        if armRight>i{
            point := armMid*2-armRight
            len1 := arm[point]
            len2 := armRight-i;
            if len1 > len2{
                armLen = len2
            }else{
                armLen = len1
            }
        }

        len := expand(input,i-armLen-1,i+armLen+1)

        arm = append(arm,len/2)

        if len > maxLen{
            maxLen = len
            maxMid = i
        }

        if i+len/2 > armRight{
            armRight = i+len/2
            armMid = i
        }
    }

    ans :=""
    for i:= maxMid-arm[maxMid];i<=maxMid+arm[maxMid];i++{
        if input[i]!='#'{
            ans+=string(input[i])
        }
    }
    return ans;
}

func getStr(s string, ch string) string{
    ans := ch
    for i:=0;i<len(s);i++{
        ans += string(s[i])+ch
    }
    return ans
}

func expand(s string, start int, end int) int{
    for ; start >= 0 && end < len(s) && s[start]==s[end];start,end = start-1,end+1{}
    return end-start-1;
}