SUMMARY = "NPM: mdast-util-to-string"
DESCRIPTION = "mdast utility to get the plain text content of a node"
HOMEPAGE = "https://github.com/syntax-tree/mdast-util-to-string#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=91fb5297439b32d9cd49df8a2484d3eb"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/mdast-util-to-string/-/mdast-util-to-string-2.0.0.tgz"
SRC_URI[md5sum] = "d010f571c381db7ceca9b313454b83cf"
SRC_URI[sha256sum] = "2980ab3668659cfd12bbbaf8175c64e553962c2d91ce30cfd523077d64c5680b"

NPM_PKGNAME = "mdast-util-to-string"

inherit npmhelper
inherit native
