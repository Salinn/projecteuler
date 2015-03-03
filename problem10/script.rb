require 'prime'
total = 0
Prime.each(2000000) do |prime|
  total+=prime
end
puts total