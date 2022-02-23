SUMMARY = "A static code analyzer for C++, Lua"
HOMEPAGE = "https://github.com/Tencent/TscanCode"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "GPL-3.0-only"
LIC_FILES_CHKSUM = "file://${WORKDIR}/git/LICENSE;md5=17f3d09aae7e567139cf4c67db039584"

SRC_URI = "git://github.com/Tencent/TscanCode.git;protocol=https;branch=master"

SRCREV = "4e4e5018ca59d051af5b350c09e9c1c341dbcbd0"
UPSTREAM_CHECK_COMMITS = "1"

S = "${WORKDIR}/git/trunk"

inherit autotools-brokensep
inherit sca-description
inherit native

SCA_TOOL_DESCRIPTION = "tscancode"

BUILD_CXXFLAGS += "-std=c++11"

do_configure:prepend() {
    # SIGSTKSZ isn't a constant in newer gcc's so we override
    # the value here
    # it should be done as a patch, but due to line ending
    # messed up in the project a sed call is more convenient
    sed -i "s#SIGSTKSZ;#8192;#g" ${S}/cli/tscexecutor.cpp
}

do_install() {
    install -d ${D}/${bindir}
    install -d ${D}/${datadir}/tscancode
    install ${B}/tscancode ${D}${bindir}/
    cp -R ${B}/cfg/* ${D}/${datadir}/tscancode/
}

FILES:${PN} = "${bindir} ${datadir}"
