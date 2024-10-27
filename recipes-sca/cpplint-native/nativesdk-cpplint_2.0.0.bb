SUMMARY = "CPPLint - a static code analyzer for C/C++"
DESCRIPTION = "A Static code analyzer for C/C++ written in python"
AUTHOR = "Google Inc."
HOMEPAGE = "https://github.com/cpplint/cpplint"
BUGTRACKER = "https://github.com/cpplint/cpplint/issues"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a58572e3501e262ddd5da01be644887d"

SRC_URI = "git://github.com/cpplint/cpplint.git;protocol=https;nobranch=1 \
           file://cpplint-multi"
SRCREV = "f4363d7fc0d5f38c4fd41b658e069e96583da0d5"

UNPACKDIR ??= "${WORKDIR}/sources-unpack"
S = "${UNPACKDIR}/git"

inherit sca-description
inherit python_setuptools_build_meta
inherit_defer nativesdk
SCA_TOOL_DESCRIPTION = "cpplint"

do_install:append() {
    if [ ! -e ${D}${bindir}/cpplint-multi ]; then
        install -m 0755 ${UNPACKDIR}/cpplint-multi ${D}${bindir}/cpplint-multi
    fi
}
RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-make \
    nativesdk-python3-core \
    nativesdk-python3-stringold \
    nativesdk-python3-xml \
"
