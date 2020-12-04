SUMMARY = "NPM: domhandler"
DESCRIPTION = "Handler for htmlparser2 that turns pages into a dom"
HOMEPAGE = "https://github.com/fb55/domhandler#readme"

LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d5b9cb3bc7f6ffd7bea8661f30447c11"

DEPENDS = "npm-domelementtype-native"

SRC_URI = "https://registry.npmjs.org/domhandler/-/domhandler-4.0.0.tgz"
SRC_URI[md5sum] = "877bdbf14bdfce9d2060458b62e3ab96"
SRC_URI[sha256sum] = "46bf5273c43de91f53d668f457476801183b5ef67d4eae1648bfa03d4762ee55"

NPM_PKGNAME = "domhandler"

inherit npmhelper
inherit native
