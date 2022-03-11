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

SRC_URI = "https://registry.npmjs.org/unified/-/unified-10.1.2.tgz"
SRC_URI[md5sum] = "afd15a1698fe407c3bf301635f736170"
SRC_URI[sha256sum] = "fe63805f3f115a7beb343763aa89caa3dce04f42ef422dcf130671f0c471516d"

NPM_PKGNAME = "unified"

inherit npmhelper
inherit native
