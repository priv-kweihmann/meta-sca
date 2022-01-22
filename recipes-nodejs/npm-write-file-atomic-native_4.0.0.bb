SUMMARY = "NPM: write-file-atomic"
DESCRIPTION = "Write files in an atomic fashion w/configurable ownership"
HOMEPAGE = "https://github.com/npm/write-file-atomic"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=68705ba56afdf6710c9187ed9a9cdd03"

DEPENDS = "npm-imurmurhash-native \
           npm-is-typedarray-native \
           npm-signal-exit-native \
           npm-typedarray-to-buffer-native"

SRC_URI = "https://registry.npmjs.org/write-file-atomic/-/write-file-atomic-4.0.0.tgz"
SRC_URI[md5sum] = "2ef681ccdcf3342e33d8930b4c55e148"
SRC_URI[sha256sum] = "0c10bb4b970e945cba392d89d15548e391976cc93aa85fc39cc13f32ae84ab03"

NPM_PKGNAME = "write-file-atomic"

inherit npmhelper
inherit native
