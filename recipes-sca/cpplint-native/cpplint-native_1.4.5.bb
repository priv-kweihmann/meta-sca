SUMMARY = "CPPLint - a static code analyzer for C/C++"
DESCRIPTION = "A Static code analyzer for C/C++ written in python"
AUTHOR = "Google Inc."
HOMEPAGE = "https://github.com/cpplint/cpplint"
BUGTRACKER = "https://github.com/cpplint/cpplint/issues"

SRC_URI = " git://github.com/cpplint/cpplint.git;protocol=https;tag=${PV};nobranch=1 \
            file://cpplint.sca.description"

S = "${WORKDIR}/git"

DEPENDS += "${PYTHON_PN}-pytest-runner-native"

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a58572e3501e262ddd5da01be644887d"

inherit native
inherit sca-sanity
inherit setuptools3

FILES_${PN} += "${datadir}"

do_install_append() {
    install -d ${D}${datadir}
    install ${WORKDIR}/cpplint.sca.description ${D}${datadir}/
}

