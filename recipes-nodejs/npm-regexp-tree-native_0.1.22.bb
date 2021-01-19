SUMMARY = "NPM: regexp-tree"
DESCRIPTION = "Regular Expressions parser in JavaScript"
HOMEPAGE = "https://github.com/DmitrySoshnikov/regexp-tree"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=5d06bd44b61726e8ad570f35d48bf36a"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/regexp-tree/-/regexp-tree-0.1.22.tgz"
SRC_URI[md5sum] = "3eb86e7f39a802dc6ddafc28360debb7"
SRC_URI[sha256sum] = "4bd2983d22bd963e9d4e893025ead4098ac67d71f37f3aa2a91d939b2af5ca4a"

NPM_PKGNAME = "regexp-tree"

inherit npmhelper
inherit native
