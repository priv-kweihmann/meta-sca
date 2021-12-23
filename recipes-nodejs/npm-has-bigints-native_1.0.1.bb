SUMMARY = "NPM: has-bigints"
DESCRIPTION = "Determine if the JS environment has BigInt support."
HOMEPAGE = "https://github.com/ljharb/has-bigints#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=375dc7ca936a14e9c29418d5263bd066"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/has-bigints/-/has-bigints-1.0.1.tgz"
SRC_URI[md5sum] = "3d1a6fa2571c73144e864272fd5e2e75"
SRC_URI[sha256sum] = "7bd053a7d11cfd00367859ca9d06020f643cb6b305a400e424dfd872ebcc223a"

NPM_PKGNAME = "has-bigints"

inherit npmhelper
inherit native
