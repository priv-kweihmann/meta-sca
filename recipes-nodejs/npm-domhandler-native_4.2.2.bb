SUMMARY = "NPM: domhandler"
DESCRIPTION = "Handler for htmlparser2 that turns pages into a dom"
HOMEPAGE = "https://github.com/fb55/domhandler#readme"

DEFAULT_PREFERENCE = "-1"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d5b9cb3bc7f6ffd7bea8661f30447c11"

DEPENDS = "npm-domelementtype-native"

SRC_URI = "https://registry.npmjs.org/domhandler/-/domhandler-4.2.2.tgz"
SRC_URI[md5sum] = "83075b91322a0696623b94f1fb6c5977"
SRC_URI[sha256sum] = "93923fd8333d875d0af9adbe5f32feec6bad78553abf454b23f7257341c17e60"

NPM_PKGNAME = "domhandler"

inherit npmhelper
inherit native
