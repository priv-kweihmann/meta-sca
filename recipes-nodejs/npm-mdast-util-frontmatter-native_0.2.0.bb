SUMMARY = "NPM: mdast-util-frontmatter"
DESCRIPTION = "mdast extension to parse and serialize frontmatter (YAML, TOML, etc)"
HOMEPAGE = "https://github.com/syntax-tree/mdast-util-frontmatter#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=6a9c614ad8a32fcd51b47e458d620e48"

DEPENDS = "npm-micromark-extension-frontmatter-native"

SRC_URI = "https://registry.npmjs.org/mdast-util-frontmatter/-/mdast-util-frontmatter-0.2.0.tgz"
SRC_URI[md5sum] = "3c12f0691fe1cd7c7d6554e9eccd866c"
SRC_URI[sha256sum] = "a6228c30530895a18d1446fe34075b8a6176165236f32de82e33118f1fad6caa"

NPM_PKGNAME = "mdast-util-frontmatter"

inherit npmhelper
inherit native
