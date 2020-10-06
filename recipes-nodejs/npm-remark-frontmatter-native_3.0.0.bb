SUMMARY = "NPM: remark-frontmatter"
DESCRIPTION = "remark plugin to support frontmatter (yaml, toml, and more)"
HOMEPAGE = "https://github.com/remarkjs/remark-frontmatter#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=0bbc76ececabc0216b618cfbe4d0c0e3"

DEPENDS = "npm-mdast-util-frontmatter-native \
           npm-micromark-extension-frontmatter-native"

SRC_URI = "https://registry.npmjs.org/remark-frontmatter/-/remark-frontmatter-3.0.0.tgz"
SRC_URI[md5sum] = "551df800465f4e9206bad51f5a3ecd4d"
SRC_URI[sha256sum] = "c52f9450b3430a34cc06f86610afc902dece7a178a50bf9a5e21dd919ef819bc"

NPM_PKGNAME = "remark-frontmatter"

inherit npmhelper
inherit native
