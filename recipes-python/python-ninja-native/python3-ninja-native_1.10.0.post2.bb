SUMMARY = "Ninja is a small build system with a focus on speed"
DESCRIPTION = "This package will just provide the python bindings, but no executable"
HOMEPAGE = "http://martine.github.com/ninja/"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE_Apache_20;md5=8534cc5f25cb0717c5af1b301fba20c8"

DEPENDS += "\
            cmake-native \
            ninja-native \
            python3-distro-native \
            python3-scikit-build-native \
            python3-wheel-native \
           "

SRC_URI_append = " file://0001-Remove-console-entry-script.patch"

SRC_URI[md5sum] = "c3d5728e0ec71ea8f87fe722d0470e91"
SRC_URI[sha256sum] = "621fd73513a9bef0cb82e8c531a29ef96580b4d6e797f833cce167054ad812f8"

PYPI_PACKAGE = "ninja"

UPSTREAM_CHECK_REGEX ?= "/ninja/(?P<pver>\d+\.\d+\.\d+(\.\w+)*)"

inherit pypi
inherit setuptools3
inherit native

INSANE_SKIP_${PN} += "already-stripped"
