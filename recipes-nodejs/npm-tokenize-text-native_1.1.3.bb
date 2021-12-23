SUMMARY = "NPM: tokenize-text"
DESCRIPTION = "Javascript text tokenizer that is easy to use and compose"
HOMEPAGE = "https://github.com/GitbookIO/tokenize-text"

DEPENDS = "npm-lodash-native"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fa818a259cbed7ce8bc2a22d35a464fc"

SRC_URI = "https://registry.npmjs.org/tokenize-text/-/tokenize-text-1.1.3.tgz"
SRC_URI[md5sum] = "a7b31b8a7ac791430d4fd6a8818722eb"
SRC_URI[sha256sum] = "b02c725e035b1f53f552b57de3ff6186097b8b1ae76f73cf5a0213c7f8d8742f"

NPM_PKGNAME = "tokenize-text"

inherit npmhelper
inherit native
