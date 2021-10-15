SUMMARY = "NPM: vfile"
DESCRIPTION = "Virtual file format for text processing"
HOMEPAGE = "https://github.com/vfile/vfile#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=82fd7b0a70b89a370d3bcef312cfd54d"

DEPENDS = "npm-is-buffer-native \
           npm-types-unist-native \
           npm-unist-util-stringify-position-native \
           npm-vfile-message-native"

SRC_URI = "https://registry.npmjs.org/vfile/-/vfile-5.1.1.tgz"
SRC_URI[md5sum] = "bc7c50296ed705ea42ffb4be28d0d0c4"
SRC_URI[sha256sum] = "8c112b06ede8c9f4445054982561e14e45a2b7de7ac85ad08f3742974a6d30af"

NPM_PKGNAME = "vfile"

inherit npmhelper
inherit native
