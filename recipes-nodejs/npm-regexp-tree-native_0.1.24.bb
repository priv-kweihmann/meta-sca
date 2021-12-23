SUMMARY = "NPM: regexp-tree"
DESCRIPTION = "Regular Expressions parser in JavaScript"
HOMEPAGE = "https://github.com/DmitrySoshnikov/regexp-tree"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=5d06bd44b61726e8ad570f35d48bf36a"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/regexp-tree/-/regexp-tree-0.1.24.tgz"
SRC_URI[md5sum] = "7014ce6bcf0e2ed9c0fef6e4513a2b7d"
SRC_URI[sha256sum] = "ccbc7b17ff77273bfa936148a69e3425d56699f30c61fdd3fb787d7349f1c07d"

NPM_PKGNAME = "regexp-tree"

inherit npmhelper
inherit native
