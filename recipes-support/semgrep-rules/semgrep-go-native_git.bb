SUMMARY = "This repo holds patterns for finding odd Go code"
HOMEPAGE = "https://github.com/dgryski/semgrep-go.git"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=cceb70c3f326568ccff13faee2f67113"

SRC_URI = "git://github.com/dgryski/semgrep-go.git;protocol=https"
SRCREV = "20ceee4610737a32cc08c1fbdefa9ad0e51b30a0"
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
