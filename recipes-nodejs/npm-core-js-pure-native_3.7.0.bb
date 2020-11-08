SUMMARY = "NPM: core-js-pure"
DESCRIPTION = "Standard library"
HOMEPAGE = "https://github.com/zloirock/core-js#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=04ddc8a943888569f9012c4a420f4b09"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/core-js-pure/-/core-js-pure-3.7.0.tgz"
SRC_URI[md5sum] = "cff9d08a74b72e7d2e3c1bb7435a052e"
SRC_URI[sha256sum] = "431f2fa35ccda536a0578571d98956ee7ad210f3506b94b34916993c0c758903"

NPM_PKGNAME = "core-js-pure"

inherit npmhelper
inherit native
