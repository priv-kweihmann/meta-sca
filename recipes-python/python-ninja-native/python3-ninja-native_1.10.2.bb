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

SRC_URI[md5sum] = "21f26d7001bad4bb3e8167115ed3e1ee"
SRC_URI[sha256sum] = "bb5e54b9a7343b3a8fc6532ae2c169af387a45b0d4dd5b72c2803e21658c5791"

PYPI_PACKAGE = "ninja"

UPSTREAM_CHECK_REGEX ?= "/ninja/(?P<pver>\d+\.\d+\.\d+(\.\w+)*)"

inherit pypi
inherit setuptools3
inherit native

INSANE_SKIP_${PN} += "already-stripped"
