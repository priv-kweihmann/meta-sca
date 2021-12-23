SUMMARY = "NPM: unified"
DESCRIPTION = "Interface for parsing, inspecting, transforming, and serializing content through syntax trees"
HOMEPAGE = "https://unifiedjs.com"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=82fd7b0a70b89a370d3bcef312cfd54d"

DEPENDS = "npm-bail-native \
           npm-extend-native \
           npm-is-buffer-native \
           npm-is-plain-obj-native \
           npm-trough-native \
           npm-types-unist-native \
           npm-vfile-native"

SRC_URI = "https://registry.npmjs.org/unified/-/unified-10.1.1.tgz"
SRC_URI[md5sum] = "f4154cf05153a87431d40ceabb210174"
SRC_URI[sha256sum] = "ed848101e0dd662561ef0e0fa8a6ef0a8fb12cd4789799e13a443a4dbd31c312"

NPM_PKGNAME = "unified"

inherit npmhelper
inherit native
