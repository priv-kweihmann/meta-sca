SUMMARY = "NPM: micromark-extension-mdx-jsx"
DESCRIPTION = "micromark extension to support MDX or MDX.js JSX"
HOMEPAGE = "https://github.com/micromark/micromark-extension-mdx-jsx#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=6a9c614ad8a32fcd51b47e458d620e48"

DEPENDS = "npm-estree-util-is-identifier-name-native \
           npm-micromark-factory-mdx-expression-native \
           npm-micromark-factory-space-native \
           npm-micromark-util-character-native \
           npm-micromark-util-symbol-native \
           npm-micromark-util-types-native \
           npm-types-acorn-native \
           npm-uvu-native \
           npm-vfile-message-native"

SRC_URI = "https://registry.npmjs.org/micromark-extension-mdx-jsx/-/micromark-extension-mdx-jsx-1.0.2.tgz"
SRC_URI[md5sum] = "a0709d237f9d830331475f821af5e5c5"
SRC_URI[sha256sum] = "2084dc4cff29a81e0a2d84ce84f5f88bdf55ccba0eb2bee18a47b29caf37b1e1"

NPM_PKGNAME = "micromark-extension-mdx-jsx"

inherit npmhelper
inherit native
