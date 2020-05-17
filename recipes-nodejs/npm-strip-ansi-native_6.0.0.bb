SUMMARY = "NPM: strip-ansi"
DESCRIPTION = "Strip ANSI escape codes from a string"
HOMEPAGE = "https://github.com/chalk/strip-ansi#readme"

DEPENDS = "npm-ansi-regex-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=915042b5df33c31a6db2b37eadaa00e3"

SRC_URI = "https://registry.npmjs.org/strip-ansi/-/strip-ansi-6.0.0.tgz"
SRC_URI[md5sum] = "767c76e38fb2bb82a3da65412b4610ad"
SRC_URI[sha256sum] = "26bc5904a8e6afdf4d2d05d69fa91fec48879917582aa892029695506a0b5653"

NPM_PKGNAME = "strip-ansi"

inherit npmhelper
inherit native
