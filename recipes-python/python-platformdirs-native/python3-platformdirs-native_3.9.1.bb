SUMMARY = "A small Python module for determining appropriate platform-specific dirs"
HOMEPAGE = "https://github.com/platformdirs/platformdirs"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ea4f5a41454746a9ed111e3d8723d17a"

DEPENDS += "\
    python3-hatch-vcs-native \
    python3-setuptools-scm-native \
    python3-toml-native \
"

PYPI_PACKAGE = "platformdirs"

SRC_URI[sha256sum] = "1b42b450ad933e981d56e59f1b97495428c9bd60698baab9f3eb3d00d5822421"

inherit pypi
inherit python_hatchling
inherit_defer native

do_compile:prepend() {
    export SETUPTOOLS_SCM_PRETEND_VERSION="${PV}"
}

FILES:${PN} += "${datadir} ${prefix}"

RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-python3-core \
    nativesdk-python3-ctypes \
    nativesdk-python3-hatchling \
    nativesdk-python3-pathspec \
    nativesdk-python3-pluggy \
"
