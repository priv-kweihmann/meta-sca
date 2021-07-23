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

SRC_URI = "https://registry.npmjs.org/unified/-/unified-10.0.1.tgz"
SRC_URI[md5sum] = "1a7f4df0cff5ad6959cc216ef6a1f998"
SRC_URI[sha256sum] = "2c071d54882b032743a68c33089bc72915d003504c706408232cc345fe105d43"

NPM_PKGNAME = "unified"

inherit npmhelper
inherit native
