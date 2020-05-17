SUMMARY = "NPM: unified"
DESCRIPTION = "Interface for parsing, inspecting, transforming, and serializing content through syntax trees"
HOMEPAGE = "https://unifiedjs.com"

DEPENDS = "npm-bail-native npm-extend-native npm-is-buffer-native npm-is-plain-obj-native npm-trough-native npm-vfile-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=82fd7b0a70b89a370d3bcef312cfd54d"

SRC_URI = "https://registry.npmjs.org/unified/-/unified-9.0.0.tgz"
SRC_URI[md5sum] = "8194da603e8580e0e937acf42a1c7543"
SRC_URI[sha256sum] = "de29b715571bd8ccc33b3ba409a5ec7637b1c367d0a1f0e741bf560342747609"

NPM_PKGNAME = "unified"

inherit npmhelper
inherit native
