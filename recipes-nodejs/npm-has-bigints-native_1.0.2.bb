SUMMARY = "NPM: has-bigints"
DESCRIPTION = "Determine if the JS environment has BigInt support."
HOMEPAGE = "https://github.com/ljharb/has-bigints#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=375dc7ca936a14e9c29418d5263bd066"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/has-bigints/-/has-bigints-1.0.2.tgz"
SRC_URI[md5sum] = "df87410ab4558f7e29b52e8733c1a3e6"
SRC_URI[sha256sum] = "207b82f1fa30704c5cd488074a29582f64e20c3ceb29d78f2295d68268570ce3"

NPM_PKGNAME = "has-bigints"

inherit npmhelper
inherit native
