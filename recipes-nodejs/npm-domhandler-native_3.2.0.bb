SUMMARY = "NPM: domhandler"
DESCRIPTION = "Handler for htmlparser2 that turns pages into a dom"
HOMEPAGE = "https://github.com/fb55/domhandler#readme"

LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d5b9cb3bc7f6ffd7bea8661f30447c11"

DEPENDS = "npm-domelementtype-native"

SRC_URI = "https://registry.npmjs.org/domhandler/-/domhandler-3.2.0.tgz"
SRC_URI[md5sum] = "e7cecd66d850a603a01d5270501d5440"
SRC_URI[sha256sum] = "fbf3f4fd8148452fb2f909f015ade2baaca8bbc24f8b82ff95387d46fbba7666"

NPM_PKGNAME = "domhandler"

inherit npmhelper
inherit native
