SUMMARY = "NPM: textextensions"
DESCRIPTION = "A package that contains an array of every single file extension there is for text files"
HOMEPAGE = "https://github.com/bevry/textextensions"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=10f8378cf9409df9bd8015af40a24b59"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/textextensions/-/textextensions-5.12.0.tgz"
SRC_URI[md5sum] = "766395f907aeb2b1406c568f930c04be"
SRC_URI[sha256sum] = "1d7f2906c212b185b42156515203be4ec8e6e935537e665bda54d7b5ea955297"

NPM_PKGNAME = "textextensions"

inherit npmhelper
inherit native
