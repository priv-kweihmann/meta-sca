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

SRC_URI = "https://registry.npmjs.org/unified/-/unified-9.2.2.tgz"
SRC_URI[md5sum] = "29a7752849e7ea27a93d782ab53c35a6"
SRC_URI[sha256sum] = "af3a7e782c1c6869bf4ed2dd11c484a2d0ac56724fd85e7e71af4dc06fa59718"

NPM_PKGNAME = "unified"

inherit npmhelper
inherit native
