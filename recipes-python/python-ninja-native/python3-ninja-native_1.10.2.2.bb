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

SRC_URI[md5sum] = "015ebb8cb5c4e8ac22552a112f283dfe"
SRC_URI[sha256sum] = "3f8a75acd929abb9f003d3aa5bc299cea30b9db0dfa18669877e9c02ddcf530d"

PYPI_PACKAGE = "ninja"

UPSTREAM_CHECK_REGEX ?= "/ninja/(?P<pver>\d+\.\d+\.\d+(\.\w+)*)"

inherit pypi
inherit setuptools3
inherit native

INSANE_SKIP:${PN} += "already-stripped"
