SUMMARY = "NPM: domhandler"
DESCRIPTION = "handler for htmlparser2 that turns pages into a dom"
HOMEPAGE = "https://github.com/fb55/DomHandler#readme"

DEPENDS = "npm-domelementtype-native"

LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d5b9cb3bc7f6ffd7bea8661f30447c11"

SRC_URI = "https://registry.npmjs.org/domhandler/-/domhandler-2.4.2.tgz"
SRC_URI[md5sum] = "7c6804f9e06ce0eb588bc10620fe94c1"
SRC_URI[sha256sum] = "834043152eb305bba5c9062bd3216e6956c935687e3dc645d44ca4e7ee1555f8"

NPM_PKGNAME = "domhandler"

inherit npmhelper
inherit native
