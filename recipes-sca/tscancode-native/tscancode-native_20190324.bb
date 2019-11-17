SUMMARY = "A static code analyzer for C++, C#, Lua"
DESCRIPTION = "A static code analyzer for C++, C#, Lua"

SRC_URI = "git://github.com/Tencent/TscanCode.git;protocol=https;branch=master \
           file://tscancode.sca.description \
           file://tscancode.sca.score"
SRCREV = "4e4e5018ca59d051af5b350c09e9c1c341dbcbd0"
LIC_FILES_CHKSUM = "file://${WORKDIR}/git/LICENSE;md5=17f3d09aae7e567139cf4c67db039584"

HOMEPAGE = "https://github.com/Tencent/TscanCode"
LICENSE = "GPLv3"

S = "${WORKDIR}/git/trunk"

FILES_${PN} = "${bindir} ${datadir}"
BUILD_CXXFLAGS += "-std=c++11"

inherit autotools-brokensep
inherit native
inherit sca-sanity

do_install() {
    mkdir -p ${D}/${bindir}
    mkdir -p ${D}/${datadir}/tscancode
    install ${B}/tscancode ${D}${bindir}/
    cp -R ${B}/cfg/* ${D}/${datadir}/tscancode/

    install ${WORKDIR}/tscancode.sca.description ${D}${datadir}/
    install ${WORKDIR}/tscancode.sca.score ${D}${datadir}/
}
