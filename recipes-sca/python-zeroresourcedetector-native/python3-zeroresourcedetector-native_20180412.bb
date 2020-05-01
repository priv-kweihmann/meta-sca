SUMMARY = "Static code analysis tool for g11n/i18n issues in resource files"
HOMEPAGE = "https://github.com/0Cubed/ZeroResourceDetector"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=86d3f3a95c324c9479bd8986968f4327"

DEPENDS += "\
            ${PYTHON_PN}-native \
            ${PYTHON_PN}-pyparsing-native \
           "

SRC_URI = "git://github.com/0Cubed/ZeroResourceDetector.git;protocol=https;branch=master; \
           file://zrd.sca.description"
SRCREV = "117218499db07c34f072026e618546deeb682fab"
UPSTREAM_CHECK_COMMITS = "1"

inherit native
inherit sca-sanity
inherit sca-description
inherit python3-dir

S = "${WORKDIR}/git"

do_configure[noexec] = "1"
do_compile[noexec] = "1"

do_install() {
    install -d ${D}${bindir}/zrd
    install -m 0755 ${B}/resource_detector.py ${D}${bindir}/zrd/

    install -d ${D}${datadir}
    install ${WORKDIR}/zrd.sca.description ${D}${datadir}
}

FILES_${PN} = "${bindir} ${datadir}"
