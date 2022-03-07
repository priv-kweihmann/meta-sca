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

SRC_URI = "https://registry.npmjs.org/vfile/-/vfile-5.3.2.tgz"
SRC_URI[md5sum] = "4b972cb4243bda6e382d1a09e54c5b57"
SRC_URI[sha256sum] = "8ab05648cd7324a53f07d50bbfc2437d1551853bae465e7492bdcc8137c1d19e"

NPM_PKGNAME = "vfile"

inherit npmhelper
inherit native
