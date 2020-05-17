SUMMARY = "NPM: vfile"
DESCRIPTION = "Virtual file format for text processing"
HOMEPAGE = "https://github.com/vfile/vfile#readme"

DEPENDS = "npm-is-buffer-native npm-replace-ext-native npm-types-unist-native npm-unist-util-stringify-position-native npm-vfile-message-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=82fd7b0a70b89a370d3bcef312cfd54d"

SRC_URI = "https://registry.npmjs.org/vfile/-/vfile-4.1.0.tgz"
SRC_URI[md5sum] = "a8f6dc08134f6f844ee8c8c0a4460255"
SRC_URI[sha256sum] = "19092699ea572563a81bc7067dfa7e765662ca06aec135a5868bfc5bdbd76425"

NPM_PKGNAME = "vfile"

inherit npmhelper
inherit native
