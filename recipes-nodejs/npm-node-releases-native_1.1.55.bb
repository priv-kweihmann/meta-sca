SUMMARY = "NPM: node-releases"
DESCRIPTION = "Node.js releases data"
HOMEPAGE = "https://github.com/chicoxyzzy/node-releases#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=9201369490251e1be377462bd41f58eb"

SRC_URI = "https://registry.npmjs.org/node-releases/-/node-releases-1.1.55.tgz"
SRC_URI[md5sum] = "a48cb7634428a1f1bee316fe2c79e02d"
SRC_URI[sha256sum] = "696eca3a89bc19ef592bf71d51c6f1da0972ba1cefcd9f75c4581be51e161ab0"

NPM_PKGNAME = "node-releases"

inherit npmhelper
inherit native
