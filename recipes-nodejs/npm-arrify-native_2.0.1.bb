SUMMARY = "NPM: arrify"
DESCRIPTION = "Convert a value to an array"
HOMEPAGE = "https://github.com/sindresorhus/arrify#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=915042b5df33c31a6db2b37eadaa00e3"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/arrify/-/arrify-2.0.1.tgz"
SRC_URI[md5sum] = "894bb6f7c486ee6143dc32eb89f4516a"
SRC_URI[sha256sum] = "a681828e5f54071941ef722406b2d6c3450ae920c9d2343c8b731ccad64e70fe"

NPM_PKGNAME = "arrify"

inherit npmhelper
inherit native
