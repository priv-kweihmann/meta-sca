SUMMARY = "A static source code analysis tool to improve quality and reduce defects for C, C++ and Objective-C"
DESCRIPTION = "A static source code analysis tool to improve quality and reduce defects for C, C++ and Objective-C"
HOMEPAGE = "http://oclint.org/"
LICENSE = "BSD-3-Clause"

S = "${WORKDIR}/git"
B = "${S}"

SRC_URI = "git://github.com/oclint/oclint.git;protocol=http;branch=master;tag=v${PV}"

LIC_FILES_CHKSUM = "file://oclint-core/LICENSE;md5=5ecaa320936c751d876affd32feff035"

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

FILES_${PN} = "${bindir}"


do_install() {
    mkdir -p ${D}${bindir}/oclint
    cp -Ra ${B}/build/oclint-release/* ${D}${bindir}/oclint
}
