SUMMARY = "This repo holds patterns for finding odd Go code"
HOMEPAGE = "https://github.com/dgryski/semgrep-go.git"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=cceb70c3f326568ccff13faee2f67113"

SRC_URI = "git://github.com/dgryski/semgrep-go.git;branch=master;protocol=https"
SRCREV = "b14e2f07411c22cadaab3a5d7df2346a99e7b36d"
UPSTREAM_CHECK_COMMITS = "1"

S = "${WORKDIR}/git"

inherit native

do_configure[noexec] = "1"
do_compile[noexec] = "1"

do_install() {
    install -d ${D}${datadir}/semgrep/semgrep-go
    install -m 0644 ${S}/*.yml ${D}${datadir}/semgrep/semgrep-go/
}

FILES:${PN} = "${datadir}"
