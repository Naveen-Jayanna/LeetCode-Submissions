# @param {Integer[]} nums
# @return {Integer}
def max_sub_array(a)
	return 0 if a.empty?
	max_sum = a[0]
	current_sum = a[0]
	(1...a.length).each do |i|
		current_sum = [a[i], current_sum + a[i]].max
		max_sum = [max_sum, current_sum].max
	end
	return max_sum
end