SUMMARY = "NPM: write-file-atomic"
DESCRIPTION = "Write files in an atomic fashion w/configurable ownership"
HOMEPAGE = "https://github.com/npm/write-file-atomic"

DEPENDS = "npm-imurmurhash-native npm-is-typedarray-native npm-signal-exit-native npm-typedarray-to-buffer-native"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=68705ba56afdf6710c9187ed9a9cdd03"

SRC_URI = "https://registry.npmjs.org/write-file-atomic/-/write-file-atomic-3.0.3.tgz"
SRC_URI[md5sum] = "53e54080c22253705daa1c3115c02220"
SRC_URI[sha256sum] = "e960a6846f713b6b0d16b6a7d98d47f6fc29610f6e59eb5587fd9d48d455fa66"

S = "${WORKDIR}/package"

NPM_PKGNAME = "write-file-atomic"

inherit npmhelper
inherit native
