SUMMARY = "NPM: remark-frontmatter"
DESCRIPTION = "remark plugin to support frontmatter (yaml, toml, and more)"
HOMEPAGE = "https://github.com/remarkjs/remark-frontmatter#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=0bbc76ececabc0216b618cfbe4d0c0e3"

DEPENDS = "npm-mdast-util-frontmatter-native \
           npm-micromark-extension-frontmatter-native \
           npm-types-mdast-native \
           npm-unified-native"

SRC_URI = "https://registry.npmjs.org/remark-frontmatter/-/remark-frontmatter-4.0.0.tgz"
SRC_URI[md5sum] = "03c2908fa6a3454383ae68441a296b08"
SRC_URI[sha256sum] = "36469367edb17a6f4b2abe1f95c032d1143ae9a3fb3fe7d1c60c10838947df35"

NPM_PKGNAME = "remark-frontmatter"

inherit npmhelper
inherit native
