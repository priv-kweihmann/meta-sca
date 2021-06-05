SUMMARY = "NPM: @types/node"
DESCRIPTION = "TypeScript definitions for Node.js"
HOMEPAGE = "https://github.com/DefinitelyTyped/DefinitelyTyped/tree/master/types/node"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d4a904ca135bb7bc912156fee12726f0"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@types/node/-/node-15.12.1.tgz"
SRC_URI[md5sum] = "b4a2ab9aa1f29d8b9bfdf2eebfe9adf1"
SRC_URI[sha256sum] = "be930968cc1dd3bc294acca31168ba900651e85aaaaa792c1c78da18ea8cf9b4"

NPM_PKGNAME = "@types/node"

inherit npmhelper
inherit native

S = "${WORKDIR}/node"
