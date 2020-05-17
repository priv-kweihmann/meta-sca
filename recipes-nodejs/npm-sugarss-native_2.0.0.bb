SUMMARY = "NPM: sugarss"
DESCRIPTION = "Indent-based CSS syntax for PostCSS"
HOMEPAGE = "https://github.com/postcss/sugarss#readme"

DEPENDS = "npm-postcss-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=4134d402e7331fd1e7d9f294aa26def4"

SRC_URI = "https://registry.npmjs.org/sugarss/-/sugarss-2.0.0.tgz"
SRC_URI[md5sum] = "c9a570567c9af50b86638376ae92e769"
SRC_URI[sha256sum] = "094386c6b753b2476a697c10b528be37a3ca1c5e754f30a9c144ab4698eacb61"

NPM_PKGNAME = "sugarss"

inherit npmhelper
inherit native
