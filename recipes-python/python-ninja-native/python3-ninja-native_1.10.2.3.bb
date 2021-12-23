SUMMARY = "Ninja is a small build system with a focus on speed"
DESCRIPTION = "This package will just provide the python bindings, but no executable"
HOMEPAGE = "http://martine.github.com/ninja/"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE_Apache_20;md5=19cbd64715b51267a47bf3750cc6a8a5"

DEPENDS += "\
            cmake-native \
            ninja-native \
            python3-distro-native \
            python3-scikit-build-native \
            python3-wheel-native \
           "

SRC_URI:append = " file://0001-Remove-console-entry-script.patch"

SRC_URI[md5sum] = "2763eec12beca5db94f7aa289b869175"
SRC_URI[sha256sum] = "e1b86ad50d4e681a7dbdff05fc23bb52cb773edb90bc428efba33fa027738408"

PYPI_PACKAGE = "ninja"

UPSTREAM_CHECK_REGEX ?= "/ninja/(?P<pver>\d+\.\d+\.\d+(\.\w+)*)"

inherit pypi
inherit setuptools3
inherit native

INSANE_SKIP:${PN} += "already-stripped"
