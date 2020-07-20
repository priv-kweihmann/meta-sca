SUMMARY = "NPM: flatted"
DESCRIPTION = "A super light and fast circular JSON parser."
HOMEPAGE = "https://github.com/WebReflection/flatted#readme"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=73d317079e156478653d02207ca984da"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/flatted/-/flatted-3.0.4.tgz"
SRC_URI[md5sum] = "444cc0d4423f4ed36d1b478b0892b69a"
SRC_URI[sha256sum] = "9f8ff04d3e56ab181a5b6f6310b550432c26fd91efc14c6260a46bca819820a6"

NPM_PKGNAME = "flatted"

inherit npmhelper
inherit native
