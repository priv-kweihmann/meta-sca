SUMMARY = "Ninja is a small build system with a focus on speed"
DESCRIPTION = "This package will just provide the python bindings, but no executable"
HOMEPAGE = "http://martine.github.com/ninja/"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE_Apache_20;md5=19cbd64715b51267a47bf3750cc6a8a5"

DEPENDS += "\
            cmake-native \
            ninja-native \
            python3-distro-native \
            python3-scikit-build-native \
            python3-wheel-native \
           "

SRC_URI_append = " file://0001-Remove-console-entry-script.patch"

SRC_URI[md5sum] = "c98afcb2dc337cf46358cd88dbd7df60"
SRC_URI[sha256sum] = "8d328888b5bff8a4adc88c4f84e074e31d0b4195459395f8f3c47b07e5d3c0f9"

PYPI_PACKAGE = "ninja"

UPSTREAM_CHECK_REGEX ?= "/ninja/(?P<pver>\d+\.\d+\.\d+(\.\w+)*)"

inherit pypi
inherit setuptools3
inherit native

INSANE_SKIP_${PN} += "already-stripped"
