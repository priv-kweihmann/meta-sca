SUMMARY = "NPM: isobject"
DESCRIPTION = "Returns true if the value is an object and not an array or null."
HOMEPAGE = "https://github.com/jonschlinkert/isobject"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=2f5638b0557426da0c3bd67e00a0ebde"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/isobject/-/isobject-4.0.0.tgz"
SRC_URI[md5sum] = "b97d93f537e724ca1c50109bfc525739"
SRC_URI[sha256sum] = "42d3503625c13f7a6bbfe23eccbfed68fcfaa2c19d7aa1de744b4f2ea6a7e471"

NPM_PKGNAME = "isobject"

inherit npmhelper
inherit native
