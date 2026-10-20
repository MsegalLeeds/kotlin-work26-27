from math import hypot

class Point:
    def __init__(self, x: float, y: float):
        self.x = x
        self.y = y

    def distance(self):
        return hypot(self.x, self.y)

    def distance_to(self, other):
        return hypot(other.x - self.x, other.y - self.y)