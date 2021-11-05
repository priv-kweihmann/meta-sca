SUMMARY = "NPM: clone"
DESCRIPTION = "deep cloning of objects and arrays"
HOMEPAGE = "https://github.com/pvorb/node-clone#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=411e33109fa516d190d232100fdc7f8e"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/clone/-/clone-2.1.2.tgz"
SRC_URI[md5sum] = "d8ce7a9ea1460c467a3b07abd6996bd9"
SRC_URI[sha256sum] = "7df63a618a362185c642f0a65db6f654e586fa727543872b5ba65e59d604e93d"

NPM_PKGNAME = "clone"

inherit npmhelper
inherit native
