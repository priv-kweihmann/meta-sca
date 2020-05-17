SUMMARY = "CPPLint - a static code analyzer for C/C++"
DESCRIPTION = "A Static code analyzer for C/C++ written in python"
AUTHOR = "Google Inc."
HOMEPAGE = "https://github.com/cpplint/cpplint"
BUGTRACKER = "https://github.com/cpplint/cpplint/issues"

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a58572e3501e262ddd5da01be644887d"

DEPENDS += "${PYTHON_PN}-pytest-runner-native"

SRC_URI = "git://github.com/cpplint/cpplint.git;protocol=https;branch=develop \
           file://cpplint.sca.description \
           file://cpplint-multi"
SRCREV = "d0465e6b7b52335d21c45b5769e9eb0d648a7ea5"

S = "${WORKDIR}/git"

inherit native
inherit sca-description
inherit setuptools3

do_install_append() {
    install -d ${D}${datadir}
    install ${WORKDIR}/cpplint.sca.description ${D}${datadir}/

    if [ ! -e ${D}${bindir}/cpplint-multi ]; then
        install -m 0755 ${WORKDIR}/cpplint-multi ${D}${bindir}/cpplint-multi
    fi
}

FILES_${PN} += "${datadir}"
