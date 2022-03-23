SUMMARY = "NPM: domhandler"
DESCRIPTION = "Handler for htmlparser2 that turns pages into a dom"
HOMEPAGE = "https://github.com/fb55/domhandler#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d5b9cb3bc7f6ffd7bea8661f30447c11"

DEPENDS = "npm-domelementtype-native"

SRC_URI = "https://registry.npmjs.org/domhandler/-/domhandler-4.3.1.tgz"
SRC_URI[md5sum] = "e16d5ccfbd528e8e7771bc36dcad8d22"
SRC_URI[sha256sum] = "9fa6e03e76ad49293c68740aa0a4db462cc2b87cbc1e020a6467b3a86d1bdca9"

NPM_PKGNAME = "domhandler"

inherit npmhelper
inherit native
