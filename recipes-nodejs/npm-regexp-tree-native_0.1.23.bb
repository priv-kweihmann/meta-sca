SUMMARY = "NPM: regexp-tree"
DESCRIPTION = "Regular Expressions parser in JavaScript"
HOMEPAGE = "https://github.com/DmitrySoshnikov/regexp-tree"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=5d06bd44b61726e8ad570f35d48bf36a"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/regexp-tree/-/regexp-tree-0.1.23.tgz"
SRC_URI[md5sum] = "e23d486f334cbb25a887943b8b3d13a6"
SRC_URI[sha256sum] = "45ddb8b8bce5a1798859ee1600d11c259a10479d4b1a478a9f38a0463f14e147"

NPM_PKGNAME = "regexp-tree"

inherit npmhelper
inherit native
