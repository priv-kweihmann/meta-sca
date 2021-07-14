SUMMARY = "NPM: vfile"
DESCRIPTION = "Virtual file format for text processing"
HOMEPAGE = "https://github.com/vfile/vfile#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=82fd7b0a70b89a370d3bcef312cfd54d"

DEPENDS = "npm-is-buffer-native \
           npm-types-unist-native \
           npm-unist-util-stringify-position-native \
           npm-vfile-message-native"

SRC_URI = "https://registry.npmjs.org/vfile/-/vfile-5.0.2.tgz"
SRC_URI[md5sum] = "f678dec6da0b5fdc900063df17bc53fa"
SRC_URI[sha256sum] = "7b5e71dbf0c108296d09e33e2f9dbb1e6335cdcc0e1fb21ca17de4bd7b72207a"

NPM_PKGNAME = "vfile"

inherit npmhelper
inherit native
