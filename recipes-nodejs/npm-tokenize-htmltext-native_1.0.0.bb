SUMMARY = "NPM: tokenize-htmltext"
DESCRIPTION = "Tokenize HTML into a list of text tokens"
HOMEPAGE = "https://github.com/GitbookIO/tokenize-htmltext"

DEPENDS = "npm-htmlparser2-native"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fa818a259cbed7ce8bc2a22d35a464fc"

SRC_URI = "https://registry.npmjs.org/tokenize-htmltext/-/tokenize-htmltext-1.0.0.tgz"
SRC_URI[md5sum] = "46ef4710126b26bea4f6ae815e396a10"
SRC_URI[sha256sum] = "5cf904f84e6e019ab7664af1825ba71de34130b76d4fe189bb7029fccb1fb9a0"

NPM_PKGNAME = "tokenize-htmltext"

inherit npmhelper
inherit native
