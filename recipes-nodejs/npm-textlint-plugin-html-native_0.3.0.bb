SUMMARY = "NPM: textlint-plugin-html"
DESCRIPTION = "textlint HTML processsor plugin."
HOMEPAGE = "https://github.com/textlint/textlint-plugin-html"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b858910af2bca39133b1536464b54f49"

DEPENDS = "npm-hast-native \
           npm-structured-source-native \
           npm-traverse-native"

SRC_URI = "https://registry.npmjs.org/textlint-plugin-html/-/textlint-plugin-html-0.3.0.tgz"
SRC_URI[md5sum] = "742561cc16aea4aebf5be73a48121206"
SRC_URI[sha256sum] = "6e4a32a7047272f23ab4a684fc674590dd25e7f030da3a08cbc60b61a39eac77"

NPM_PKGNAME = "textlint-plugin-html"

inherit npmhelper
inherit native
