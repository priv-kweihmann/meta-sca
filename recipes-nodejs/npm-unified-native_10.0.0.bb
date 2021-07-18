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

SRC_URI = "https://registry.npmjs.org/unified/-/unified-10.0.0.tgz"
SRC_URI[md5sum] = "1fe3460a62f71730b60c03dfa356f9d8"
SRC_URI[sha256sum] = "7df551c72bd40a245f0213f0ea4837ea000eafa374aa3c50fac687afc1e4bd5d"

NPM_PKGNAME = "unified"

inherit npmhelper
inherit native
