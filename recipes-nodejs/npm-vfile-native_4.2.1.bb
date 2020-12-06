SUMMARY = "NPM: vfile"
DESCRIPTION = "Virtual file format for text processing"
HOMEPAGE = "https://github.com/vfile/vfile#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=82fd7b0a70b89a370d3bcef312cfd54d"

DEPENDS = "npm-is-buffer-native \
           npm-types-unist-native \
           npm-unist-util-stringify-position-native \
           npm-vfile-message-native"

SRC_URI = "https://registry.npmjs.org/vfile/-/vfile-4.2.1.tgz"
SRC_URI[md5sum] = "5904ec1873a0c42877dbed5379c7b004"
SRC_URI[sha256sum] = "cff48812536f28aa619d42244ddf917c6fe8cafacbe3fcc2e44fa233bec2bf74"

NPM_PKGNAME = "vfile"

inherit npmhelper
inherit native
