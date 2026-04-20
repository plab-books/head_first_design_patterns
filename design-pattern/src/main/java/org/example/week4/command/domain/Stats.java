package org.example.week4.command.domain;

public record Stats(int max, int value) {
    public Stats {
        if (value > max)
            throw new IllegalArgumentException("value는 max를 초과할 수 없습니다." + "max : " + max + ", value : " + value);
        if (max < 0)
            throw new IllegalArgumentException("max는 음수일 수 없습니다." + "max : " + max);
        if (value < 0)
            throw new IllegalArgumentException("value는 음수일 수 없습니다." + "value : " + value);
    }

    public Stats increase(int amount) {
        validateAmount(amount);
        return new Stats(max, Math.min(value + amount, max));
    }

    public Stats decrease(int amount) {
        validateAmount(amount);
        return new Stats(max, Math.max(value - amount, 0));
    }

    public Stats consume(int amount) {
        if(value < amount) throw new IllegalStateException("자원이 부족합니다." + currentStatus());
        return decrease(amount);
    }

    private void validateAmount(int amount) {
        if (amount < 0) throw new IllegalArgumentException("amount는 음수일 수 없습니다." + "amount : " + amount);
    }

    public boolean isZero() { return value == 0; }
    public boolean isFull() { return value == max; }
    public String currentStatus() { return value + "/" + max; }
}
