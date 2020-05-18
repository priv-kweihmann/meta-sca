SUMMARY = "NPM: yallist"
DESCRIPTION = "Yet Another Linked List"
HOMEPAGE = "https://github.com/isaacs/yallist#readme"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=82703a69f6d7411dde679954c2fd9dca"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/yallist/-/yallist-3.1.1.tgz"
SRC_URI[md5sum] = "9e08cccb5a9b8401d82588f188288468"
SRC_URI[sha256sum] = "50f14ae6cfe8360cb2259ba3e93305e069036f13251d69d3cbee9e1d4775ca04"

NPM_PKGNAME = "yallist"

inherit npmhelper
inherit native
