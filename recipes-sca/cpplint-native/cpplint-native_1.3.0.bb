SUMMARY = "CPPLint - a static code analyzer for C/C++"
DESCRIPTION = "A Static code analyzer for C/C++ written in python"
AUTHOR = "Google Inc."
HOMEPAGE = "https://github.com/cpplint/cpplint"
BUGTRACKER = "https://github.com/cpplint/cpplint/issues"

PV = "1.3.0"

SRC_URI = " https://github.com/cpplint/cpplint/archive/${PV}.tar.gz;name=release \
            file://cpplint.sca.description"

SRC_URI[release.md5sum] = "4bc405b4cf5e3cbd3327f976fe6552bd"
SRC_URI[release.sha256sum] = "6f4e1cf41095eb2f342d667d7e1cdf1269441598f5ac77a7885b53598f68b84c"

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a58572e3501e262ddd5da01be644887d"

inherit native
inherit sca-sanity

FILES_${PN} = "${bindir}/** ${datadir}"
## we don't need debug packages
INHIBIT_PACKAGE_DEBUG_SPLIT = "1"
DEPENDS = "python3-native"
RDEPENDS_${PN} = "python3-native"

do_install() {
    install -d ${D}${bindir}
    install -d ${D}${datadir}
    chmod 777 ${B}/cpplint.py
    install ${B}/cpplint.py ${D}${bindir}/
    install ${WORKDIR}/cpplint.sca.description ${D}${datadir}/
}

