SUMMARY = "NPM: domhandler"
DESCRIPTION = "Handler for htmlparser2 that turns pages into a dom"
HOMEPAGE = "https://github.com/fb55/domhandler#readme"

LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d5b9cb3bc7f6ffd7bea8661f30447c11"

DEPENDS = "npm-domelementtype-native"

SRC_URI = "https://registry.npmjs.org/domhandler/-/domhandler-4.2.0.tgz"
SRC_URI[md5sum] = "08090db85693498934635e5e6b794423"
SRC_URI[sha256sum] = "7d6127eb7f3a8d0127076070135d4b58d042dcf870d28996831ccfc15d84c863"

NPM_PKGNAME = "domhandler"

inherit npmhelper
inherit native
