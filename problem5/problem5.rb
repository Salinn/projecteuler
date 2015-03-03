numbers = []
(1..20).each do |num|
  numbers.push(num)
end
puts numbers.reduce(:lcm)
