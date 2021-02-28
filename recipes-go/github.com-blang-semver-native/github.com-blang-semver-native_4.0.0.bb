SUMMARY = "Semantic Versioning (semver) library written in golang"
HOMEPAGE = "https://github.com/blang/semver"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=5a3ade42a900439691ebc22013660cae"

SRC_URI = "git://${GO_IMPORT};protocol=https"
SRCREV = "ba2c2ddd89069b46a7011d4106f6868f17ee1705"
GO_IMPORT = "github.com/blang/semver"

export GO111MODULE = "auto"

inherit go
inherit native

do_install_append() {
    # We don't need that
    rm -rf ${D}${bindir}/examples
}
