# @param {String} s
# @return {Boolean}
def is_valid(s)
  bracket_hash = { ')' => '(', '}' => '{', ']' => '[' }
  stack = []
  s.chars.each do |char|
      if bracket_hash.values.include?(char)
          stack.push(char)
      elsif bracket_hash.keys.include?(char)
          if stack.empty?
              return false
          elsif stack.pop != bracket_hash[char]
              return false
          end
      end
  end

  stack.empty?
end