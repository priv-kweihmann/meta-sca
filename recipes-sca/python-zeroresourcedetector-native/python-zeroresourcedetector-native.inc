SUMMARY = "Static code analysis tool for g11n/i18n issues in resource files."
HOMEPAGE = "https://github.com/0Cubed/ZeroResourceDetector"

SRC_URI = "git://github.com/0Cubed/ZeroResourceDetector.git;protocol=https;branch=master; \
           file://zrd.sca.description"

SRCREV = "117218499db07c34f072026e618546deeb682fab"

S = "${WORKDIR}/git"
B = "${S}"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=86d3f3a95c324c9479bd8986968f4327"

inherit native
inherit sca-sanity

DEPENDS += "${PYTHON_PN}-pyparsing-native"
FILES_${PN} = "${bindir}"

do_configure[noexec] = "1"
do_compile[noexec] = "1"

do_install() {
    mkdir -p ${D}${bindir}/zrd
    install -m 0755 ${B}/resource_detector.py ${D}${bindir}/zrd/

    install -d ${D}${datadir}
    install ${WORKDIR}/zrd.sca.description ${D}${datadir}
}
