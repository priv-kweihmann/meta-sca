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

SRC_URI:append = " file://0001-Remove-console-entry-script.patch"

SRC_URI[md5sum] = "4e61b32317581e898e0499ef188cc41f"
SRC_URI[sha256sum] = "719ab357f5dc822711c1151d1b9517c5543340e23f6cc4e8508f793848a48bb1"

PYPI_PACKAGE = "ninja"

UPSTREAM_CHECK_REGEX ?= "/ninja/(?P<pver>\d+\.\d+\.\d+(\.\w+)*)"

inherit pypi
inherit setuptools3
inherit native

INSANE_SKIP:${PN} += "already-stripped"
