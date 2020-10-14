SUMMARY = "NPM: mdast-util-to-string"
DESCRIPTION = "mdast utility to get the plain text content of a node"
HOMEPAGE = "https://github.com/syntax-tree/mdast-util-to-string#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=91fb5297439b32d9cd49df8a2484d3eb"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/mdast-util-to-string/-/mdast-util-to-string-1.1.0.tgz"
SRC_URI[md5sum] = "bf01b0521475c584261e3c29ff395437"
SRC_URI[sha256sum] = "43856f1734503aaa28a410183a1a544f5b709370d46d920873c26867eccc82ab"

NPM_PKGNAME = "mdast-util-to-string"

inherit npmhelper
inherit native
