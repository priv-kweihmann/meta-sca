SUMMARY = "NPM: js-xxhash"
DESCRIPTION = "Pure JS implementation of xxhash"
HOMEPAGE = "https://github.com/Jason3S/xxhash#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d6c2f216355cbd3a4d1d54e29f56a409"

SRC_URI = "https://registry.npmjs.org/js-xxhash/-/js-xxhash-1.0.4.tgz"
SRC_URI[md5sum] = "415566a41a7d17355b3e71882e99892c"
SRC_URI[sha256sum] = "3642f723f4c122c4ff85eaeae5d8d7be2541abf209916c72251eb9db2d4a3c62"

S = "${WORKDIR}/package"

NPM_PKGNAME = "js-xxhash"

inherit npmhelper
inherit native
