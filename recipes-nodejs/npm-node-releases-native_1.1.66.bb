SUMMARY = "NPM: node-releases"
DESCRIPTION = "Node.js releases data"
HOMEPAGE = "https://github.com/chicoxyzzy/node-releases#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=9201369490251e1be377462bd41f58eb"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/node-releases/-/node-releases-1.1.66.tgz"
SRC_URI[md5sum] = "44b9931f5970ae1b966641965cedaf48"
SRC_URI[sha256sum] = "8a6cb8262ab8e2f969ef30f598d868595f2ff9d2a9233c5407edd59eaac5f3f9"

NPM_PKGNAME = "node-releases"

inherit npmhelper
inherit native
