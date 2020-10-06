SUMMARY = "NPM: domhandler"
DESCRIPTION = "Handler for htmlparser2 that turns pages into a dom"
HOMEPAGE = "https://github.com/fb55/domhandler#readme"

LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d5b9cb3bc7f6ffd7bea8661f30447c11"

DEPENDS = "npm-domelementtype-native"

SRC_URI = "https://registry.npmjs.org/domhandler/-/domhandler-3.3.0.tgz"
SRC_URI[md5sum] = "05112b87808d34ad9a26dde27a2b7844"
SRC_URI[sha256sum] = "2003bb438193c828646b33ee908b9250f0049cebd267efd1d28549369b22aa65"

NPM_PKGNAME = "domhandler"

inherit npmhelper
inherit native
