SUMMARY = "NPM: write-file-atomic"
DESCRIPTION = "Write files in an atomic fashion w/configurable ownership"
HOMEPAGE = "https://github.com/npm/write-file-atomic"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=68705ba56afdf6710c9187ed9a9cdd03"

DEPENDS = "npm-imurmurhash-native \
           npm-signal-exit-native"

SRC_URI = "https://registry.npmjs.org/write-file-atomic/-/write-file-atomic-4.0.1.tgz"
SRC_URI[md5sum] = "98c1ae142cd7f09d8a7e1cfd34baa9ac"
SRC_URI[sha256sum] = "144e45aa73a1dde4340e7cd9c4d6a9029ca9c25a03a1eb2fd800ddd53b1b89e8"

NPM_PKGNAME = "write-file-atomic"

inherit npmhelper
inherit native
