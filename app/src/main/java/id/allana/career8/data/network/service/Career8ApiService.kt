package id.allana.career8.data.network.service

import com.chuckerteam.chucker.api.ChuckerInterceptor
import id.allana.career8.BuildConfig
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.PATCH
import retrofit2.http.POST
import java.util.concurrent.TimeUnit

interface Career8ApiService {

    @GET("alumni/:all")
    fun getAllAlumni()

    @GET("lowongan/:all")
    fun getAlLLowonganKerja()

    @GET("jurusan/:all")
    fun getAllJurusan()

    @POST()
    fun postAlumni()

    @PATCH
    fun updateLowonganKerja()

    @POST()
    fun postLowonganKerja()

    @DELETE("alumni/:id")
    fun deleteAlumni()

    @DELETE("lowongan/:id")
    fun deleteLowonganKerja()


    companion object {
        @JvmStatic
        operator fun invoke(chuckerInterceptor: ChuckerInterceptor): Career8ApiService {
            val okHttpClient = OkHttpClient.Builder()
                .addInterceptor(chuckerInterceptor)
                .connectTimeout(120, TimeUnit.SECONDS)
                .readTimeout(120, TimeUnit.SECONDS)
                .build()

            val retrofit = Retrofit.Builder()
                .baseUrl(BuildConfig.BASE_URL_HUMAS)
                .addConverterFactory(GsonConverterFactory.create())
                .client(okHttpClient)
                .build()
            return retrofit.create(Career8ApiService::class.java)
        }
    }
}