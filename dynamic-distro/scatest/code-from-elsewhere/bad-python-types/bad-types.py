from typing import Iterator


def fib(n: int) -> Iterator[int]:
    a, b = "abc", 1
    while a < n:
        yield a
        a, b = b, a + b


fib(10)
fib("10")
