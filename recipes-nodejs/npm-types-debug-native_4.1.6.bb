SUMMARY = "NPM: @types/debug"
DESCRIPTION = "TypeScript definitions for debug"
HOMEPAGE = "https://github.com/DefinitelyTyped/DefinitelyTyped/tree/master/types/debug"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d4a904ca135bb7bc912156fee12726f0"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@types/debug/-/debug-4.1.6.tgz"
SRC_URI[md5sum] = "72635f812bbbacd9f139d6502e44387f"
SRC_URI[sha256sum] = "e1ae1d137bae6fc63029313bab07b0271d30b1939cc1bf2993941b31ae41d82f"

NPM_PKGNAME = "@types/debug"

inherit npmhelper
inherit native

S = "${WORKDIR}/debug"
