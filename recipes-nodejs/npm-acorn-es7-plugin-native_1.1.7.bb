SUMMARY = "NPM: acorn-es7-plugin"
DESCRIPTION = "A plugin for the Acorn parser that understands the ES7 keywords async and await"
HOMEPAGE = "https://github.com/MatAtBread/acorn-es7-plugin#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=de82ae394be4a96f441a3867e71aff96"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/acorn-es7-plugin/-/acorn-es7-plugin-1.1.7.tgz"
SRC_URI[md5sum] = "0463767e244390d8736e9f5df367b4ae"
SRC_URI[sha256sum] = "b612b24e0ba1d3d29b5b056837c5f5fafcf552dd35b965ad07e1f4d2e10e1c0e"

NPM_PKGNAME = "acorn-es7-plugin"

inherit npmhelper
inherit native
