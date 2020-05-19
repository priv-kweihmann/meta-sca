SUMMARY = "NPM: yallist"
DESCRIPTION = "Yet Another Linked List"
HOMEPAGE = "https://github.com/isaacs/yallist#readme"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=82703a69f6d7411dde679954c2fd9dca"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/yallist/-/yallist-4.0.0.tgz"
SRC_URI[md5sum] = "c5b22eec3cd51b2d9e6500976965f815"
SRC_URI[sha256sum] = "a80c78aa276536615891ef66efbc17d3bd07c8cb14e3bd5298eed3006bfa4d49"

NPM_PKGNAME = "yallist"

inherit npmhelper
inherit native
