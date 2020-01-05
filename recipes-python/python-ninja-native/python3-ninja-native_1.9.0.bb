SUMMARY = "a small build system with a focus on speed"
DESCRIPTION = "a small build system with a focus on speed"
HOMEPAGE = "https://github.com/ninja-build/ninja"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE_Apache_20;md5=8534cc5f25cb0717c5af1b301fba20c8"

PYPI_PACKAGE = "ninja"

DEPENDS += "${PYTHON_PN}-scikit-build-native \
            ${PYTHON_PN}-six-native \
            ${PYTHON_PN}-wheel-native \
            cmake-native"

inherit pypi
inherit native
inherit setuptools3

do_install_append() {
    ## Rename bin wrapper, so that both python2+3 version can exists at the same time
    mv ${D}${bindir}/ninja ${D}${bindir}/${NINJA_BINNAME}
}

NINJA_BINNAME= "ninja3"

# Unfortunately there is some already stripped binary within the release package
INSANE_SKIP_${PN} += "already-stripped"

SRC_URI[md5sum] = "09bd59d6a4ce5787ee148e4fa0fbef4a"
SRC_URI[sha256sum] = "78c840ef1c94507956dac8810282cade2b139f0fda44c2f4706522415b990816"

