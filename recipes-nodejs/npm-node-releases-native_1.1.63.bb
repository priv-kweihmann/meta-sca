SUMMARY = "NPM: node-releases"
DESCRIPTION = "Node.js releases data"
HOMEPAGE = "https://github.com/chicoxyzzy/node-releases#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=9201369490251e1be377462bd41f58eb"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/node-releases/-/node-releases-1.1.63.tgz"
SRC_URI[md5sum] = "13e763bac17d58b465e40886540e8cde"
SRC_URI[sha256sum] = "954f2f371a600cadf8bc298c8fea7c3579cc818eed7892838a9a275e15bfed4b"

NPM_PKGNAME = "node-releases"

inherit npmhelper
inherit native
