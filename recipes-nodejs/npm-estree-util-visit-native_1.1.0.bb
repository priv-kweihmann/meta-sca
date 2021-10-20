SUMMARY = "NPM: estree-util-visit"
DESCRIPTION = "esast (and estree) utility to visit nodes"
HOMEPAGE = "https://github.com/syntax-tree/estree-util-visit#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=23d8001628ed74be839cbeff9bdbe7dc"

DEPENDS = "npm-types-estree-jsx-native \
           npm-types-unist-native"

SRC_URI = "https://registry.npmjs.org/estree-util-visit/-/estree-util-visit-1.1.0.tgz"
SRC_URI[md5sum] = "d7a493d0a4b71bd48627b3a700e86f2b"
SRC_URI[sha256sum] = "3542e9a3f07fef7300aa85485c335c211a4866e3a5bd7ece698145a35aec6a43"

NPM_PKGNAME = "estree-util-visit"

inherit npmhelper
inherit native
