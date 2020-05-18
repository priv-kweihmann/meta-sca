SUMMARY = "NPM: defer-to-connect"
DESCRIPTION = "The safe way to handle the `connect` socket event"
HOMEPAGE = "https://github.com/szmarczak/defer-to-connect#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=78fd36a7284eb85369521bcb6e863186"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/defer-to-connect/-/defer-to-connect-2.0.0.tgz"
SRC_URI[md5sum] = "860878b20cd9dc962002e260c80f3787"
SRC_URI[sha256sum] = "dad0a1842eb6ed39477416ca4d47a6da1a9732523b3d1b2501d45a55c4aec673"

NPM_PKGNAME = "defer-to-connect"

inherit npmhelper
inherit native
