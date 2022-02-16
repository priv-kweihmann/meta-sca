SUMMARY = "NPM: minimatch"
DESCRIPTION = "a glob matcher in javascript"
HOMEPAGE = "https://github.com/isaacs/minimatch#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=82703a69f6d7411dde679954c2fd9dca"

DEPENDS = "npm-brace-expansion-native"

SRC_URI = "https://registry.npmjs.org/minimatch/-/minimatch-3.1.2.tgz"
SRC_URI[md5sum] = "7b4ad790ecb6bd5eef2fa305b3b4c19f"
SRC_URI[sha256sum] = "13964b10b60a3b66dd6eec90a2d39af28590721b8c9d1df8ff754f90b081a34d"

NPM_PKGNAME = "minimatch"

inherit npmhelper
inherit native
