import com.mojang.datafixers.kinds.Applicative;
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Lifecycle;

import java.util.function.Function;

interface K1{
}
interface App<F extends K1,A>{
}

class Result<R> implements App<Result.Mu, R> {


    private final Either<R,PartialResult<R>> result;

    private Result(final Either<R, PartialResult<R>> result,final Lifecycle lifecycle){
        this.result=result;
    }
    public static final class Mu implements K1 {}
    //拆箱
    public static <R> Result<R> unbox(final  App<Mu,R> box) {return (Result<R>) box;}

//    public static Instance instance(){
//        return  Instance.Inst
//    }
    public static <R>Result<R> success(final R result){
        return success(result, Lifecycle.experimental());
    }
    public static <R> Result<R> success(final R result, final Lifecycle experimental) {
        return new Result<>(Either.left(result), experimental);
    }
    public <R2> Result<R2> ap(final Result<Function<R,R2>> functionResult){
        return null;
    }

    public enum Instance implements Applicative<Mu,Instance.Mu> {
        INSTANCE;

        @Override
        public <A> App<Result.Mu, A> point(final A a) {
            return success(a);
        }

        @Override
        public <A, R> Function<App<Result.Mu, A>, App<Result.Mu, R>> lift1(final App<Result.Mu, Function<A, R>> function) {
            return fa -> ap(function,fa);
        }

        @Override
        public  <A,R> App<Result.Mu,R> ap(final App<Result.Mu,Function<A,R>> func,final App<Result.Mu,A>arg){
            return unbox(arg).ap(unbox(func));
        }


//        @Override
//        public <T, R> App<Result.Mu, R> map(Function<? super T, ? extends R> func, App<Result.Mu, T> ts) {
//            return null;
//        }
    }

    public static class PartialResult<R>{
        private final String message;

        public PartialResult(String message) {
            this.message = message;
        }
    }
}

public class GenericsDemo{

    public static void main(String[] args) {

       Result<Integer> i= Result.unbox()
    }
}












//    public static Instance instance(){
//        return Instance.INSTANCE;
//    }
//
//    public <R2> Result<R2> ap(final Result<Function<R,R2>> functionResult){
//        return (Result<R2>) functionResult;
//    }
//    public enum Instance implements Applicative<Mu,Instance.Mu>{
//        INSTANCE;
//        @Override
//        public <A> App<Result.Mu, A> point(A a) {
//            return null;
//        }
//        @Override
//        public <A, R> Function<App<Result.Mu, A>, App<Result.Mu, R>> lift1(App<Result.Mu, Function<A, R>> function) {
//            return null;
//        }
//        @Override
//        public <T, R> App<Result.Mu, R> map(Function<? super T, ? extends R> func, App<Result.Mu, T> ts) {
//            return null;
//        }
//        @Override
//        public <A, R> App<Result.Mu, R> ap(Function<A, R> func, App<Result.Mu, A> arg) {
//            return unbox(arg).ap(func)
//        }
//
//
//    }