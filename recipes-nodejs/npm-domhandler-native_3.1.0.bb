SUMMARY = "NPM: domhandler"
DESCRIPTION = "Handler for htmlparser2 that turns pages into a dom"
HOMEPAGE = "https://github.com/fb55/domhandler#readme"

LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d5b9cb3bc7f6ffd7bea8661f30447c11"

DEPENDS = "npm-domelementtype-native"

SRC_URI = "https://registry.npmjs.org/domhandler/-/domhandler-3.1.0.tgz"
SRC_URI[md5sum] = "1902042eca2642e0ad55cf6a62094353"
SRC_URI[sha256sum] = "6387876b34201cded541f84cf13f0cccc5fa28855ad6aaac12996f9fb1d7837c"

NPM_PKGNAME = "domhandler"

inherit npmhelper
inherit native
