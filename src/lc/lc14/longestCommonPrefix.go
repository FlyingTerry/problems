func longestCommonPrefix(strs []string) string {
	if len(strs) == 0 {
		return ""
	}
	for col := 0; col < len(strs[0]); col++ {
		for row := 1; row < len(strs); row++ {
			if col == len(strs[row]) || strs[row][col] != strs[0][col] {
				return strs[0][:col]
			}
		}
	}
	return strs[0]
}