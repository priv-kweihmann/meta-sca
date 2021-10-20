SUMMARY = "NPM: micromark-extension-mdx-expression"
DESCRIPTION = "micromark extension to support MDX or MDX JS expressions"
HOMEPAGE = "https://github.com/micromark/micromark-extension-mdx-expression/tree/main#readme"

LICENSE = "MIT"
# does not provide a license file
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

DEPENDS = "npm-micromark-factory-mdx-expression-native \
           npm-micromark-factory-space-native \
           npm-micromark-util-character-native \
           npm-micromark-util-events-to-acorn-native \
           npm-micromark-util-symbol-native \
           npm-micromark-util-types-native \
           npm-uvu-native"

SRC_URI = "https://registry.npmjs.org/micromark-extension-mdx-expression/-/micromark-extension-mdx-expression-1.0.2.tgz"
SRC_URI[md5sum] = "c6e29387248d4c0b97ebb228fa494431"
SRC_URI[sha256sum] = "014963f465a10cf6a454d9c489ff015da3011304fed9647a415ea61d14e76354"

NPM_PKGNAME = "micromark-extension-mdx-expression"

inherit npmhelper
inherit native
