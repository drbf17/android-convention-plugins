import br.gov.drbf.conventions.plugins.jacoco.setupJacoco
import com.android.build.api.dsl.LibraryExtension
import com.android.build.api.variant.LibraryAndroidComponentsExtension
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.apply
import org.gradle.kotlin.dsl.getByType

class AndroidLibraryJacocoConventionPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        with(target) {
            apply(plugin = "jacoco")

            val androidExtension = extensions.getByType<LibraryExtension>()

            androidExtension.buildTypes.configureEach {
                enableAndroidTestCoverage = true
                enableUnitTestCoverage = true
            }

            setupJacoco(extensions.getByType<LibraryAndroidComponentsExtension>())
        }
    }
}
