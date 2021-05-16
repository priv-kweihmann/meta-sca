SUMMARY = "NPM: node-releases"
DESCRIPTION = "Node.js releases data"
HOMEPAGE = "https://github.com/chicoxyzzy/node-releases#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=9201369490251e1be377462bd41f58eb"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/node-releases/-/node-releases-1.1.72.tgz"
SRC_URI[md5sum] = "d01e86f4905a0a16f5fe03431efb0cb8"
SRC_URI[sha256sum] = "a9f17747d6111aca60599c7e490d947cf0daf21f60303b6cd93082e9261e186d"

NPM_PKGNAME = "node-releases"

inherit npmhelper
inherit native
