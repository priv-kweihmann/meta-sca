SUMMARY = "NPM: domhandler"
DESCRIPTION = "Handler for htmlparser2 that turns pages into a dom"
HOMEPAGE = "https://github.com/fb55/DomHandler#readme"

LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d5b9cb3bc7f6ffd7bea8661f30447c11"

DEPENDS = "npm-domelementtype-native"

SRC_URI = "https://registry.npmjs.org/domhandler/-/domhandler-3.0.0.tgz"
SRC_URI[md5sum] = "b2bebe8602fa3e6762a63a2f5dea4c0b"
SRC_URI[sha256sum] = "c059da1a898cfd244f946d2d4601812d3ae4ff0357d32cceb2f7c7fa07d28d77"

NPM_PKGNAME = "domhandler"

inherit npmhelper
inherit native
