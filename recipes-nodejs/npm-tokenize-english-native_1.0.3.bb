SUMMARY = "NPM: tokenize-english"
DESCRIPTION = "Tokenizer for english sentences"
HOMEPAGE = "https://github.com/GitbookIO/tokenize-english"

DEPENDS = "npm-lodash-native"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fa818a259cbed7ce8bc2a22d35a464fc"

SRC_URI = "https://registry.npmjs.org/tokenize-english/-/tokenize-english-1.0.3.tgz"
SRC_URI[md5sum] = "941450780e4ed2f7dae25ece77ae62b1"
SRC_URI[sha256sum] = "b2db7cef7ac5b61f009d6991429ac0dcd70f5bd18a56ab757dba446447eb8e0c"

NPM_PKGNAME = "tokenize-english"

inherit npmhelper
inherit native
