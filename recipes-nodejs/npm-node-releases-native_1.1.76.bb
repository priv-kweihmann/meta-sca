SUMMARY = "NPM: node-releases"
DESCRIPTION = "Node.js releases data"
HOMEPAGE = "https://github.com/chicoxyzzy/node-releases#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=9201369490251e1be377462bd41f58eb"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/node-releases/-/node-releases-1.1.76.tgz"
SRC_URI[md5sum] = "e6751722a5a551083aa40779438cbd51"
SRC_URI[sha256sum] = "f6f9d438b3db3fa83d815b00f9721872bcc73742ccce09a965989c5175a811d8"

NPM_PKGNAME = "node-releases"

inherit npmhelper
inherit native
