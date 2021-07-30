SUMMARY = "NPM: unified"
DESCRIPTION = "Interface for parsing, inspecting, transforming, and serializing content through syntax trees"
HOMEPAGE = "https://unifiedjs.com"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=82fd7b0a70b89a370d3bcef312cfd54d"

DEPENDS = "npm-bail-native \
           npm-extend-native \
           npm-is-buffer-native \
           npm-is-plain-obj-native \
           npm-trough-native \
           npm-types-unist-native \
           npm-vfile-native"

SRC_URI = "https://registry.npmjs.org/unified/-/unified-10.1.0.tgz"
SRC_URI[md5sum] = "e9987fca79e8adb0650bf3c637b9fa1b"
SRC_URI[sha256sum] = "8e346ca2374a0d2fe98d54f5c6f368d6712bf8608a4e79aa6df36904280810d3"

NPM_PKGNAME = "unified"

inherit npmhelper
inherit native
