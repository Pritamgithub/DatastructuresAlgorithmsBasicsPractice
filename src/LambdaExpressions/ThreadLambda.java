package LambdaExpressions;

// public class ThreadLambda {
/*
 *
 * public static void main(String[] args) throws InterruptedException {
 *
 * Runnable runn = new Runnable() {
 *
 * @Override public void run() {
 *
 * for (int i = 0; i < 3; i++) {
 *
 * System.out.println("hello I am your current thread" +
 * Thread.currentThread().getName()); } } };
 *
 * Runnable runnlambda = () -> {
 *
 * for (int i = 0; i < 10; i++) {
 *
 * System.out.println("hello I am your current thread " +
 * Thread.currentThread().getId()); } };
 *
 * Thread t = new Thread(runnlambda); t.start(); t.join();
 *
 * }
 *
 */

// Using extending thread class
// public class ThreadLambda extends Thread {
//
// // @Override
// // public void run() {
// // for (int i = 0; i < 2; i++) {
// // System.out.println("thread");
// // }
// // }
// //
//
// // ThreadLambda t = ()
// public static void main(String[] args) throws InterruptedException {
// //
// // ThreadLambda t = new ThreadLambda();
// // t.start();
// // t.join();
// //
//
// ThreadLambda t = () -> {
// for (int i = 0; i < 2; i++) {
// System.out.println("THread");
// }
// };
//
// t.start();
// t.join();
//
// }
//// }
////
//// }
//// }