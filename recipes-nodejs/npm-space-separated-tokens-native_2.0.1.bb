SUMMARY = "NPM: space-separated-tokens"
DESCRIPTION = "Parse and stringify space separated tokens"
HOMEPAGE = "https://github.com/wooorm/space-separated-tokens#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=8e9f707ac01af145c36ef2adde15d7e4"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/space-separated-tokens/-/space-separated-tokens-2.0.1.tgz"
SRC_URI[md5sum] = "9f8567547cef674ac30145a483fd4ab2"
SRC_URI[sha256sum] = "f85bde13642680f088467feca6959011638863bb54efe6f85b131dbff98c520f"

NPM_PKGNAME = "space-separated-tokens"

inherit npmhelper
inherit native
