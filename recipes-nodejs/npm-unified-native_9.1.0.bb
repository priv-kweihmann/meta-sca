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
           npm-vfile-native"

SRC_URI = "https://registry.npmjs.org/unified/-/unified-9.1.0.tgz"
SRC_URI[md5sum] = "69f304d7c0d4464d662e91554b1f28fb"
SRC_URI[sha256sum] = "057a4e7d08247e6e1d26eb9a2ad8d662123793023f85d71700c9d095b607dfb7"

NPM_PKGNAME = "unified"

inherit npmhelper
inherit native
