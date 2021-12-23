SUMMARY = "NPM: util-deprecate"
DESCRIPTION = "The Node.js `util.deprecate()` function with browser support"
HOMEPAGE = "https://github.com/TooTallNate/util-deprecate"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b7c99ef4b0f3ad9911a52219947f8cf0"

SRC_URI = "https://registry.npmjs.org/util-deprecate/-/util-deprecate-1.0.2.tgz"
SRC_URI[md5sum] = "280e304a953ba3a89f52cc6ad616b284"
SRC_URI[sha256sum] = "79a1de983c1b393180c47456d6b73caab278a00ea6e37d5c6675f2dcdec2a3e5"

NPM_PKGNAME = "util-deprecate"

inherit npmhelper
inherit native
