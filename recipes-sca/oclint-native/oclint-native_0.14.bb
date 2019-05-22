SUMMARY = "A static source code analysis tool to improve quality and reduce defects for C, C++ and Objective-C"
DESCRIPTION = "A static source code analysis tool to improve quality and reduce defects for C, C++ and Objective-C"
HOMEPAGE = "http://oclint.org/"
LICENSE = "BSD-3-Clause"

S = "${WORKDIR}/git"
B = "${S}"

SRC_URI = "git://github.com/oclint/oclint.git;protocol=http;branch=master;tag=v${PV} \
           file://oclint.sca.description \
           file://oclint.sca.score"

LIC_FILES_CHKSUM = "file://oclint-core/LICENSE;md5=306b716fe6dadad0d53616d809e59c9d"

DEPENDS += "subversion-native cmake-native python3-native ninja-native"

inherit native

inherit pkgconfig

## we don't need debug packages
INHIBIT_PACKAGE_DEBUG_SPLIT = "1"

INSANE_SKIP_${PN} += "already-stripped"

do_compile() {
    cd oclint-scripts
	./make
    cd -
}

FILES_${PN} = "${bindir} ${datadir}"

do_install() {
    mkdir -p ${D}${bindir}/oclint
    cp -Ra ${B}/build/oclint-release/* ${D}${bindir}/oclint

    install -d ${D}${datadir}
    install ${WORKDIR}/oclint.sca.description ${D}${datadir}
    install ${WORKDIR}/oclint.sca.score ${D}${datadir}
}
