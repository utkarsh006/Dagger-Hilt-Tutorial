## Number 1 
`@HiltAndroidApp` : Starting point for Hilt, extends the application class. Starting from this class, Hilt
would begin to draw its dependency graph.

```
class MyApplication: Application()
```

- [Study about Dependency Graph](https://proandroiddev.com/learn-dagger-by-visualization-e41914574252)
- [ A tool to visualize Dagger 2 dependency graphs](https://github.com/arunkumar9t2/scabbard)

## Number 2
`@AndroidEntryPoint` : This annotation is given for activities/fragments.

## Number 3

`@HiltViewModel` : Avoids boilerplate code like ViewModelFactory by this annotation in ViewModel.

```
class HomeViewModel @Inject constructor(
    private val homeRepository : HomeRepository
) : ViewModel(){
    
}
```

## Number 4 

`@Singleton` : Provided in the Repository class. It's from javax.inject, not from Hilt package

## Number 5

`@Inject` : Identifies injectable constructor and whatever the constructor's dependencies we provide in the parameter, dagger would provide us.

## Number 6

`@Module` : It provides dependencies to the components that depend on them. In simple terms, A class that provides **multiple dependencies.**

## Number 7

`@InstallIn` : where we want to install the above module.

```
@Module
@InstallIn(SingletonComponent::class)
class NetworkModule{
    
    @Provides
    @Singleton
    fun provideMoshi() : Moshi{
        return Moshi.Builder().build()
    }
}
```
- In above code, since InstallIn annotation has Singleton component, hence all the dependencies inside the NetworkModule class will be of Singleton type like provideMoshi()

## Number 8

`@Provides` : It's an annotation that we use to **declare a method** that provides a dependency. Use provideMoshi() code and provide me the Instance (Moshi) whenever asked by dagger.

## Number 9

`@Binds` : Connects interface and implementation.

<br>

- Download the Annotation's [Cheatsheet](https://developer.android.com/training/dependency-injection/hilt-cheatsheet) 