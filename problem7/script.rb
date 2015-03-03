require 'prime'
total = []
Prime.each(200000) do |prime|
  total.push(prime)
end
puts total[10000]