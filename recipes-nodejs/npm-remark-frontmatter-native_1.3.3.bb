SUMMARY = "NPM: remark-frontmatter"
DESCRIPTION = "remark plugin to support frontmatter (yaml, toml, and more)"
HOMEPAGE = "https://github.com/remarkjs/remark-frontmatter#readme"

DEPENDS = "npm-fault-native npm-xtend-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=0bbc76ececabc0216b618cfbe4d0c0e3"

SRC_URI = "https://registry.npmjs.org/remark-frontmatter/-/remark-frontmatter-1.3.3.tgz"
SRC_URI[md5sum] = "48e77c6421aa6b265aaa5da2a2a69057"
SRC_URI[sha256sum] = "f24af1f2e430131d7504f5eae8f79d7661417c875a52002be565f03c44b78960"

NPM_PKGNAME = "remark-frontmatter"

inherit npmhelper
inherit native
