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

SRC_URI = "https://registry.npmjs.org/vfile/-/vfile-4.1.1.tgz"
SRC_URI[md5sum] = "aee15af6b83b976dd7bf3a2cb2d21481"
SRC_URI[sha256sum] = "f05da470653fde361ab9a841a4b235f2e0985ab79c728c4aa4a2cebdf64d90b8"

NPM_PKGNAME = "vfile"

inherit npmhelper
inherit native
