SUMMARY = "NPM: strip-final-newline"
DESCRIPTION = "Strip the final newline character from a string/buffer"
HOMEPAGE = "https://github.com/sindresorhus/strip-final-newline#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=915042b5df33c31a6db2b37eadaa00e3"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/strip-final-newline/-/strip-final-newline-2.0.0.tgz"
SRC_URI[md5sum] = "100d1b69056c923fd5565a282f09ce44"
SRC_URI[sha256sum] = "691ffb2c808d6f64d02565f0e8e1e1cd25eace1e32c065e93d6c1aa24e2b0075"

NPM_PKGNAME = "strip-final-newline"

inherit npmhelper
inherit native
