def main
  @first = {}
  @second = {}
  @third = {}
  (1..1000).each do |i|
    @first[i] = i*i
    @second[i] = i *i
    @third[i] = i*i
  end
  search
end

def reset?(current_value)
  current_value >= 1000
end

def search
  a_value = 1
  b_value = 2
  c_value = 3
  flag = true
  while flag
    c_value = c_value + 1
    if reset?(c_value)
      c_value = b_value + 2
      b_value = b_value + 1
    end
    if reset?(b_value)
      b_value = a_value + 2
      a_value = a_value + 1
    end

    puts "#{a_value} #{b_value} #{c_value}"
    # puts "#{@first[a_value]} #{@second[b_value]} #{@third[c_value]}"
    if (@first[a_value] + @second[b_value]) == @third[c_value] && (a_value + b_value + c_value) == 1000
      puts @first[a_value]
      puts @second[b_value]
      puts @third[c_value]
      puts a_value * b_value * c_value
      flag = false
    end
  end
end

main
