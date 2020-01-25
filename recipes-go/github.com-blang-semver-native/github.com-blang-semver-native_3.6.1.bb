SUMMARY = "Semantic Versioning (semver) library written in golang"
HOMEPAGE = "https://github.com/blang/semver"

SRC_URI = "git://${GO_IMPORT};protocol=https;tag=v${PV}"
GO_IMPORT = "github.com/blang/semver"

LICENSE = "MIT"
LIC_FILES_CHKSUM  = "file://src/${GO_IMPORT}/LICENSE;md5=5a3ade42a900439691ebc22013660cae"

inherit go
inherit native

do_install_append() {
    # We don't need that
    rm -rf ${D}${bindir}/examples
}