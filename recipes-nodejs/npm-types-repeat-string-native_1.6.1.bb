SUMMARY = "NPM: @types/repeat-string"
DESCRIPTION = "TypeScript definitions for repeat-string"
HOMEPAGE = "https://github.com/DefinitelyTyped/DefinitelyTyped/tree/master/types/repeat-string"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d4a904ca135bb7bc912156fee12726f0"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@types/repeat-string/-/repeat-string-1.6.1.tgz"
SRC_URI[md5sum] = "006dd8056283c69f1c7043dbca17bdc1"
SRC_URI[sha256sum] = "6fba91fec5ea274060c7793a1b5e581488a7c356c37d149c841a331386f975ed"

NPM_PKGNAME = "@types/repeat-string"

inherit npmhelper
inherit native

S = "${WORKDIR}/repeat-string"
