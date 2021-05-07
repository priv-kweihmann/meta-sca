SUMMARY = "NPM: vfile"
DESCRIPTION = "Virtual file format for text processing"
HOMEPAGE = "https://github.com/vfile/vfile#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=82fd7b0a70b89a370d3bcef312cfd54d"

DEPENDS = "npm-is-buffer-native \
           npm-types-unist-native \
           npm-unist-util-stringify-position-native \
           npm-vfile-message-native"

SRC_URI = "https://registry.npmjs.org/vfile/-/vfile-5.0.1.tgz"
SRC_URI[md5sum] = "693bcfab3de6e47f3c9478c349878964"
SRC_URI[sha256sum] = "5c4b7b673eb4ec0a8aff6c6d41e37ae6662bb4cbe68eea796953720f8f407f20"

NPM_PKGNAME = "vfile"

inherit npmhelper
inherit native
