SUMMARY = "NPM: node-releases"
DESCRIPTION = "Node.js releases data"
HOMEPAGE = "https://github.com/chicoxyzzy/node-releases#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=9201369490251e1be377462bd41f58eb"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/node-releases/-/node-releases-2.0.1.tgz"
SRC_URI[md5sum] = "2a2991fcb6a9b3206edc6980b97cbb3f"
SRC_URI[sha256sum] = "1328a7a95d200c858c1aa1a7a1c99ba5833968b9d63aed82a57c01205be6b38f"

NPM_PKGNAME = "node-releases"

inherit npmhelper
inherit native
