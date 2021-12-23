SUMMARY = "NPM: parse5"
DESCRIPTION = "HTML parser and serializer."
HOMEPAGE = "https://github.com/inikulin/parse5"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=179850e04995d6fceaf64f2dd2a851b0"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/parse5/-/parse5-6.0.1.tgz"
SRC_URI[md5sum] = "007b36b2d5ab333300ae4119f36f5b71"
SRC_URI[sha256sum] = "5a562a309cadd9e3a80c97d716f56f4ff7b30bc256c557fc733bdd68adf696f4"

NPM_PKGNAME = "parse5"

inherit npmhelper
inherit native
