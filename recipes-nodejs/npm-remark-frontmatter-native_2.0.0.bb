SUMMARY = "NPM: remark-frontmatter"
DESCRIPTION = "remark plugin to support frontmatter (yaml, toml, and more)"
HOMEPAGE = "https://github.com/remarkjs/remark-frontmatter#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=0bbc76ececabc0216b618cfbe4d0c0e3"

DEPENDS = "npm-fault-native"

SRC_URI = "https://registry.npmjs.org/remark-frontmatter/-/remark-frontmatter-2.0.0.tgz"
SRC_URI[md5sum] = "f055977e5588cf29bfbf34af30c8a137"
SRC_URI[sha256sum] = "f941f474cf3b7563d8fc0847062c563531d71b44281e62a7398633f852e6a81f"

NPM_PKGNAME = "remark-frontmatter"

inherit npmhelper
inherit native
