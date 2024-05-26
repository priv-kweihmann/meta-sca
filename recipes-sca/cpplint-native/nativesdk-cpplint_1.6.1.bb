SUMMARY = "CPPLint - a static code analyzer for C/C++"
DESCRIPTION = "A Static code analyzer for C/C++ written in python"
AUTHOR = "Google Inc."
HOMEPAGE = "https://github.com/cpplint/cpplint"
BUGTRACKER = "https://github.com/cpplint/cpplint/issues"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a58572e3501e262ddd5da01be644887d"

DEPENDS += "\
    nativesdk-python3-pip \
    nativesdk-python3-setuptools \
    python3-pytest-runner-native \
"

SRC_URI = "git://github.com/cpplint/cpplint.git;protocol=https;branch=master \
           file://cpplint-multi"
SRCREV = "adfa11cf7584ae3c57cb77489b5af1681002f47d"

UNPACKDIR ??= "${WORKDIR}"
S = "${UNPACKDIR}/git"

inherit sca-description
inherit setuptools3
inherit_defer nativesdk
SCA_TOOL_DESCRIPTION = "cpplint"
do_configure:prepend() {
    sed -i "s#pytest-runner==5.2#pytest-runner>=5.2#g" ${S}/setup.py
}
do_install:append() {
    if [ ! -e ${D}${bindir}/cpplint-multi ]; then
        install -m 0755 ${UNPACKDIR}/cpplint-multi ${D}${bindir}/cpplint-multi
    fi
}
RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-make \
    nativesdk-python3-core \
    nativesdk-python3-pip \
    nativesdk-python3-setuptools \
    nativesdk-python3-stringold \
    nativesdk-python3-xml \
"
