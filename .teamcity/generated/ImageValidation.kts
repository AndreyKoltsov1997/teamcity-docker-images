// NOTE: THIS IS AN AUTO-GENERATED FILE. IT HAD BEEN CREATED USING TEAMCITY.DOCKER PROJECT. ...
// ... IF NEEDED, PLEASE, EDIT DSL GENERATOR RATHER THAN THE FILES DIRECTLY. ... 
// ... FOR MORE DETAILS, PLEASE, REFER TO DOCUMENTATION WITHIN THE REPOSITORY.
package generated

import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.ui.*
import jetbrains.buildServer.configs.kotlin.v2019_2.buildSteps.script
import jetbrains.buildServer.configs.kotlin.v2019_2.vcs.GitVcsRoot
import jetbrains.buildServer.configs.kotlin.v2019_2.buildFeatures.dockerSupport
import jetbrains.buildServer.configs.kotlin.v2019_2.buildFeatures.freeDiskSpace
import jetbrains.buildServer.configs.kotlin.v2019_2.buildFeatures.swabra
import jetbrains.buildServer.configs.kotlin.v2019_2.buildSteps.dockerCommand
import common.TeamCityDockerImagesRepo.TeamCityDockerImagesRepo

import jetbrains.buildServer.configs.kotlin.v2019_2.buildSteps.kotlinFile
object image_validation: BuildType(
{
name = "Validation (post-push) of Docker images"
buildNumberPattern="%dockerImage.teamcity.buildNumber%-%build.counter%"
steps {
kotlinFile {
name = "Image Verification - %docker.deployRepository%teamcity-server:2022.10-linux"
path = ".teamcity/automation/ImageValidation.kts"
arguments = "%docker.deployRepository%teamcity-server:2022.10-linux" }

kotlinFile {
name = "Image Verification - %docker.deployRepository%teamcity-agent:2022.10-linux-arm64-sudo"
path = "automation/ImageValidation.kts"
arguments = "%docker.deployRepository%teamcity-agent:2022.10-linux-arm64-sudo" }

kotlinFile {
name = "Image Verification - %docker.deployRepository%teamcity-agent:2022.10-linux-arm64"
path = "automation/ImageValidation.kts"
arguments = "%docker.deployRepository%teamcity-agent:2022.10-linux-arm64" }

kotlinFile {
name = "Image Verification - %docker.deployRepository%teamcity-agent:2022.10-linux"
path = "automation/ImageValidation.kts"
arguments = "%docker.deployRepository%teamcity-agent:2022.10-linux" }

kotlinFile {
name = "Image Verification - %docker.deployRepository%teamcity-agent:2022.10-linux-sudo"
path = "automation/ImageValidation.kts"
arguments = "%docker.deployRepository%teamcity-agent:2022.10-linux-sudo" }

kotlinFile {
name = "Image Verification - %docker.deployRepository%teamcity-minimal-agent:2022.10-linux"
path = "automation/ImageValidation.kts"
arguments = "%docker.deployRepository%teamcity-minimal-agent:2022.10-linux" }

kotlinFile {
name = "Image Verification - %docker.deployRepository%teamcity-server:2022.10-nanoserver-1809"
path = "automation/ImageValidation.kts"
arguments = "%docker.deployRepository%teamcity-server:2022.10-nanoserver-1809" }

kotlinFile {
name = "Image Verification - %docker.deployRepository%teamcity-agent:2022.10-windowsservercore-1809"
path = "automation/ImageValidation.kts"
arguments = "%docker.deployRepository%teamcity-agent:2022.10-windowsservercore-1809" }

kotlinFile {
name = "Image Verification - %docker.deployRepository%teamcity-agent:2022.10-nanoserver-1809"
path = "automation/ImageValidation.kts"
arguments = "%docker.deployRepository%teamcity-agent:2022.10-nanoserver-1809" }

kotlinFile {
name = "Image Verification - %docker.deployRepository%teamcity-minimal-agent:2022.10-nanoserver-1809"
path = "automation/ImageValidation.kts"
arguments = "%docker.deployRepository%teamcity-minimal-agent:2022.10-nanoserver-1809" }

kotlinFile {
name = "Image Verification - %docker.deployRepository%teamcity-server:2022.10-nanoserver-2004"
path = "automation/ImageValidation.kts"
arguments = "%docker.deployRepository%teamcity-server:2022.10-nanoserver-2004" }

kotlinFile {
name = "Image Verification - %docker.deployRepository%teamcity-agent:2022.10-windowsservercore-2004"
path = "automation/ImageValidation.kts"
arguments = "%docker.deployRepository%teamcity-agent:2022.10-windowsservercore-2004" }

kotlinFile {
name = "Image Verification - %docker.deployRepository%teamcity-agent:2022.10-nanoserver-2004"
path = "automation/ImageValidation.kts"
arguments = "%docker.deployRepository%teamcity-agent:2022.10-nanoserver-2004" }

kotlinFile {
name = "Image Verification - %docker.deployRepository%teamcity-minimal-agent:2022.10-nanoserver-2004"
path = "automation/ImageValidation.kts"
arguments = "%docker.deployRepository%teamcity-minimal-agent:2022.10-nanoserver-2004" }

}
dependencies {
dependency(AbsoluteId("PROJECT_EXT_774")) {
snapshot { onDependencyFailure = FailureAction.FAIL_TO_START }
}
}
})

