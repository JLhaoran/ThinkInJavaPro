package fastec.com.rrcc.reflect;


import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonToken;

import java.lang.reflect.Type;

public class MyClass {
    static class Response<T> {
        T data;
        int code;
        String message;

        @Override
        public String toString() {
            return "Response{" +
                    "data=" + data +
                    ", code=" + code +
                    ", message='" + message + '\'' +
                    '}';
        }

        public Response(T data, int code, String message) {

            this.data = data;
            this.code = code;
            this.message = message;
        }
    }

    static class Data {
        String result;

        public Data(String result) {
            this.result = result;
        }

        @Override
        public String toString() {
            return "Data{" +
                    "result=" + result +
                    '}';
        }
    }




    public static void main(String[] args) {
        //序列化
        Response<Data> dataResponse = new Response(new Data("数据"), 1, "成功");
        Gson gson = new Gson();
        String json = gson.toJson(dataResponse);
        System.out.println(json);
        //反序列化
        //1.使用Gosn提供的TypeToken 获取泛型的真实类型
        Type type1 = new TypeToken<Response<Data>>(){}.getType();

        Type type2 = new TypeRefrence<Response<Data>>(){}.getType();


        Response<Data> response = gson.fromJson(json,type2);
        System.out.println(response.data.getClass());
    }


}
