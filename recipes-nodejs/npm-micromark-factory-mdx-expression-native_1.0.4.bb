SUMMARY = "NPM: micromark-factory-mdx-expression"
DESCRIPTION = "micromark factory to parse MDX expressions (found in JSX attributes, flow, text)"
HOMEPAGE = "https://github.com/micromark/micromark-extension-mdx-expression/tree/main#readme"

LICENSE = "MIT"
# does not provide a license file
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

DEPENDS = "npm-micromark-factory-space-native \
           npm-micromark-util-character-native \
           npm-micromark-util-events-to-acorn-native \
           npm-micromark-util-symbol-native \
           npm-micromark-util-types-native \
           npm-unist-util-position-from-estree-native \
           npm-uvu-native \
           npm-vfile-message-native"

SRC_URI = "https://registry.npmjs.org/micromark-factory-mdx-expression/-/micromark-factory-mdx-expression-1.0.4.tgz"
SRC_URI[md5sum] = "2efe0fba22af2fd61f9c3801837f563c"
SRC_URI[sha256sum] = "e9f010bcf35eac35c43bb2b7fc69b1c22beafb8507b6d32368161e2f20f82447"

NPM_PKGNAME = "micromark-factory-mdx-expression"

inherit npmhelper
inherit native
