import net.minecraft.SharedConstants;

import javax.annotation.CheckForNull;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

import static com.google.common.base.Preconditions.checkArgument;

abstract class SerializableDemo<T> {
    final Type capture(){
        Type superclass=getClass().getGenericSuperclass();
        checkArgument(superclass instanceof ParameterizedType,"%s isn't parameterized", superclass);
        return ((ParameterizedType) superclass).getActualTypeArguments()[0];
    }

    public abstract int hasCode();
}


public abstract class TypeParameter<T> extends SerializableDemo<T> {
    final TypeVariable<?> typeVariable;

    protected  TypeParameter(){
        Type type = capture();
        checkArgument(type instanceof  TypeVariable,"%s should be a type variable.", type);
        this.typeVariable=(TypeVariable<?>) type;
    }

    @Override
    public final int hasCode(){
        return  typeVariable.hashCode();
    }

    @Override
    public final boolean equals(@CheckForNull Object o){
        if(o instanceof TypeParameter<?> that){
            return typeVariable.equals(that.typeVariable);
        }
        return false;
    }
   @Override
    public String toString() { return typeVariable.toString();}


    public static void main(String[] args) {
        if(SharedConstants.IS_RUNNING_IN_IDE){
            System.out.println("运行在IDE了");
        }

    }

}