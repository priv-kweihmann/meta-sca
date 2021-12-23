SUMMARY = "NPM: remark-frontmatter"
DESCRIPTION = "remark plugin to support frontmatter (yaml, toml, and more)"
HOMEPAGE = "https://github.com/remarkjs/remark-frontmatter#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=0bbc76ececabc0216b618cfbe4d0c0e3"

DEPENDS = "npm-mdast-util-frontmatter-native \
           npm-micromark-extension-frontmatter-native \
           npm-types-mdast-native \
           npm-unified-native"

SRC_URI = "https://registry.npmjs.org/remark-frontmatter/-/remark-frontmatter-4.0.1.tgz"
SRC_URI[md5sum] = "14a2dae82e91ec77025d79dea76720d7"
SRC_URI[sha256sum] = "89485afd464acd3afb13c00a8c66c2fcdbc9d196129e2f32711ae4fa2d706534"

NPM_PKGNAME = "remark-frontmatter"

inherit npmhelper
inherit native
