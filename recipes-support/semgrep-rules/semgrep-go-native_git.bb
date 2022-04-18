SUMMARY = "This repo holds patterns for finding odd Go code"
HOMEPAGE = "https://github.com/dgryski/semgrep-go.git"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=cceb70c3f326568ccff13faee2f67113"

SRC_URI = "git://github.com/dgryski/semgrep-go.git;branch=master;protocol=https"
SRCREV = "cf22ff421d48b255b6bbe9770226d23e253cbd9e"
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
