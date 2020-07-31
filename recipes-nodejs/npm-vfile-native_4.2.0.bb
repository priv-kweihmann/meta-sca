SUMMARY = "NPM: vfile"
DESCRIPTION = "Virtual file format for text processing"
HOMEPAGE = "https://github.com/vfile/vfile#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=82fd7b0a70b89a370d3bcef312cfd54d"

DEPENDS = "npm-is-buffer-native \
           npm-replace-ext-native \
           npm-types-unist-native \
           npm-unist-util-stringify-position-native \
           npm-vfile-message-native"

SRC_URI = "https://registry.npmjs.org/vfile/-/vfile-4.2.0.tgz"
SRC_URI[md5sum] = "1217f81ffb2718262360d934b122b80c"
SRC_URI[sha256sum] = "35d034ecb1701a1626573a824be55c66c8911db42c02a4ad639fc653ab2b4ada"

NPM_PKGNAME = "vfile"

inherit npmhelper
inherit native
