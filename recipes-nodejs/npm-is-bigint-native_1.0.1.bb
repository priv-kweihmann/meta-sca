SUMMARY = "NPM: is-bigint"
DESCRIPTION = "Is this value an ES BigInt?"
HOMEPAGE = "https://github.com/ljharb/is-bigint#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=291be6f19f64188a89ffd5180aea06f7"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/is-bigint/-/is-bigint-1.0.1.tgz"
SRC_URI[md5sum] = "4f399b8ab32402735aa13bfb6a0cc03d"
SRC_URI[sha256sum] = "0d25f04b1e5314dcc18b60a25f1add10aba942917aeb1fc90f28f57d5018a7a6"

NPM_PKGNAME = "is-bigint"

inherit npmhelper
inherit native
