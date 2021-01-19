SUMMARY = "NPM: flatted"
DESCRIPTION = "A super light and fast circular JSON parser."
HOMEPAGE = "https://github.com/WebReflection/flatted#readme"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=73d317079e156478653d02207ca984da"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/flatted/-/flatted-3.1.1.tgz"
SRC_URI[md5sum] = "85dc100872deeddee62dfeafbf2870e9"
SRC_URI[sha256sum] = "30d7f6d3fb0e560e4eb7b75868d7b0e0e6605104855a5953afad84fd1fef588a"

NPM_PKGNAME = "flatted"

inherit npmhelper
inherit native
