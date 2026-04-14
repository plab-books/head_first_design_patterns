package org.example.week3.singleton;

import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;

public class SingletonThreadTest {
    private static final int THREAD_COUNT = 50;

    public void runAll() {
        try {
            testUnsafe();
            testSynchronized();
            testEager();
            testDcl();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("싱글톤 멀티 스레드 테스트가 중단되었습니다.");
        }
    }

    private void testUnsafe() throws InterruptedException {
        Set<Integer> instanceIds = ConcurrentHashMap.newKeySet();

        CountDownLatch readyLatch = new CountDownLatch(THREAD_COUNT);
        CountDownLatch startLatch = new CountDownLatch(1);
        CountDownLatch doneLatch = new CountDownLatch(THREAD_COUNT);

        for (int i = 0; i < THREAD_COUNT; i++) {
            Thread thread = new Thread(() -> {
                readyLatch.countDown();

                try {
                    startLatch.await();

                    UnsafeGameSettings instance = UnsafeGameSettings.getInstance();
                    instanceIds.add(System.identityHashCode(instance));
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                } finally {
                    doneLatch.countDown();
                }
            });

            thread.start();
        }

        readyLatch.await();
        startLatch.countDown();
        doneLatch.await();

        printResult("Unsafe", instanceIds);
    }

    private void testSynchronized() throws InterruptedException {
        Set<Integer> instanceIds = ConcurrentHashMap.newKeySet();

        CountDownLatch readyLatch = new CountDownLatch(THREAD_COUNT);
        CountDownLatch startLatch = new CountDownLatch(1);
        CountDownLatch doneLatch = new CountDownLatch(THREAD_COUNT);

        for (int i = 0; i < THREAD_COUNT; i++) {
            Thread thread = new Thread(() -> {
                readyLatch.countDown();

                try {
                    startLatch.await();

                    SynchronizedGameSettings instance = SynchronizedGameSettings.getInstance();
                    instanceIds.add(System.identityHashCode(instance));
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                } finally {
                    doneLatch.countDown();
                }
            });

            thread.start();
        }

        readyLatch.await();
        startLatch.countDown();
        doneLatch.await();

        printResult("Synchronized", instanceIds);
    }

    private void testEager() throws InterruptedException {
        Set<Integer> instanceIds = ConcurrentHashMap.newKeySet();

        CountDownLatch readyLatch = new CountDownLatch(THREAD_COUNT);
        CountDownLatch startLatch = new CountDownLatch(1);
        CountDownLatch doneLatch = new CountDownLatch(THREAD_COUNT);

        for (int i = 0; i < THREAD_COUNT; i++) {
            Thread thread = new Thread(() -> {
                readyLatch.countDown();

                try {
                    startLatch.await();

                    EagerGameSettings instance = EagerGameSettings.getInstance();
                    instanceIds.add(System.identityHashCode(instance));
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                } finally {
                    doneLatch.countDown();
                }
            });

            thread.start();
        }

        readyLatch.await();
        startLatch.countDown();
        doneLatch.await();

        printResult("Eager", instanceIds);
    }

    private void testDcl() throws InterruptedException {
        Set<Integer> instanceIds = ConcurrentHashMap.newKeySet();

        CountDownLatch readyLatch = new CountDownLatch(THREAD_COUNT);
        CountDownLatch startLatch = new CountDownLatch(1);
        CountDownLatch doneLatch = new CountDownLatch(THREAD_COUNT);

        for (int i = 0; i < THREAD_COUNT; i++) {
            Thread thread = new Thread(() -> {
                readyLatch.countDown();

                try {
                    startLatch.await();

                    DclGameSettings instance = DclGameSettings.getInstance();
                    instanceIds.add(System.identityHashCode(instance));
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                } finally {
                    doneLatch.countDown();
                }
            });

            thread.start();
        }

        readyLatch.await();
        startLatch.countDown();
        doneLatch.await();

        printResult("DCL", instanceIds);
    }

    private void printResult(String name, Set<Integer> instanceIds) {
        System.out.println("[" + name + "] 생성된 인스턴스 수: " + instanceIds.size());
        System.out.println("[" + name + "] 인스턴스 식별값: " + instanceIds);
        System.out.println();
    }
}
