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

SRC_URI = "https://registry.npmjs.org/unified/-/unified-9.2.1.tgz"
SRC_URI[md5sum] = "a14217333c080bbbea47128dcf78fd44"
SRC_URI[sha256sum] = "e7ddf57de546b4c718611b1cc5ad321b43a76aff2244b1ad9d884845ed69dd3f"

NPM_PKGNAME = "unified"

inherit npmhelper
inherit native
