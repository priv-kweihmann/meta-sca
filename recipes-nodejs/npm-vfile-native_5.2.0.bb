SUMMARY = "NPM: vfile"
DESCRIPTION = "Virtual file format for text processing"
HOMEPAGE = "https://github.com/vfile/vfile#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=82fd7b0a70b89a370d3bcef312cfd54d"

DEPENDS = "npm-is-buffer-native \
           npm-types-unist-native \
           npm-unist-util-stringify-position-native \
           npm-vfile-message-native"

SRC_URI = "https://registry.npmjs.org/vfile/-/vfile-5.2.0.tgz"
SRC_URI[md5sum] = "0f1255e8dd40a7056cb1496774254f0c"
SRC_URI[sha256sum] = "16e62b1f0cfbcacd106ff40386d3ceb8d77cdb91569770748e8de99e775b5ed7"

NPM_PKGNAME = "vfile"

inherit npmhelper
inherit native
