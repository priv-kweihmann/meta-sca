SUMMARY = "CPPLint - a static code analyzer for C/C++"
DESCRIPTION = "A Static code analyzer for C/C++ written in python"
AUTHOR = "Google Inc."
HOMEPAGE = "https://github.com/cpplint/cpplint"
BUGTRACKER = "https://github.com/cpplint/cpplint/issues"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a58572e3501e262ddd5da01be644887d"

DEPENDS += "python3-pytest-runner-native"

SRC_URI = "git://github.com/cpplint/cpplint.git;protocol=https;branch=master \
           file://cpplint.sca.description \
           file://cpplint-multi"
SRCREV = "6b1d29874dc5d7c3c9201b70e760b3eb9468a60d"

S = "${WORKDIR}/git"

inherit sca-description
inherit setuptools3
inherit native

do_configure:prepend() {
    sed -i "s#pytest-runner==5.2#pytest-runner>=5.2#g" ${S}/setup.py
}

do_install:append() {
    install -d ${D}${datadir}
    install ${WORKDIR}/cpplint.sca.description ${D}${datadir}/

    if [ ! -e ${D}${bindir}/cpplint-multi ]; then
        install -m 0755 ${WORKDIR}/cpplint-multi ${D}${bindir}/cpplint-multi
    fi
}

FILES:${PN} += "${datadir}"
