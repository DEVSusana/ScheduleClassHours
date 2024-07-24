
Pod::Spec.new do |s|
  s.name             = 'composeApp'
  s.version          = '1.0.0'
  s.summary          = 'Módulo compartido de Kotlin para ScheduleClassHours.'
  s.description      = <<-DESC
  Este módulo contiene código compartido de Kotlin para la aplicación ScheduleClassHours, incluyendo lógica de negocio, acceso a datos y componentes de interfaz de usuario basados en Jetpack Compose.
                       DESC
  s.homepage         = 'https://github.com/DEVSusana/ScheduleClassHours'
  s.license          = { :type => 'MIT', :file => 'LICENSE' }
  s.author           = { 'Susana' => 'susanacordobaserrano@gmail.com' }
  s.source           = { :git => 'https://github.com/DEVSusana/ScheduleClassHours', :tag => s.version.to_s }
  s.ios.deployment_target = '15.0'

  s.source_files = 'build/classes/kotlin/ios/**/*'
  s.public_header_files = 'build/classes/kotlin/ios/**/*.h'
  s.vendored_frameworks = 'build/fat-framework/composeApp.framework'
  # Dependencias de Kotlin
    s.dependency 'Kotlin/stdlib'
    s.dependency 'KotlinxCoroutines-iOS'
    s.dependency 'KotlinxSerialization/KotlinxSerialization-iOS'
    s.dependency 'KotlinxDatetime-iOS'

    # Dependencias de Ktor
    s.dependency 'Ktor/Core-iOS'
    s.dependency 'Ktor/Negotiation-iOS'
    s.dependency 'Ktor/Logging-iOS'
    s.dependency 'Ktor/Serialization-iOS'
    s.dependency 'Ktor/Client/Darwin-iOS'

    # Dependencias de Koin
    s.dependency 'Koin/Core-iOS'
    s.dependency 'Koin/Compose-iOS'

    # Otras dependencias
    s.dependency 'SQLiter-iOS'
    s.dependency 'Okio-iOS'
    s.dependency 'Coil/Coil-iOS'

    # Dependencias de AndroidX (no necesarias en iOS, pero las incluyo por si acaso)
    # s.dependency 'androidx.paging:paging-common'

    # ... añade otras dependencias de Cocoapods que tu módulo necesite
  end