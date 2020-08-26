SUMMARY = "NPM: alex"
DESCRIPTION = "Catch insensitive, inconsiderate writing"
HOMEPAGE = "https://alexjs.com"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=82fd7b0a70b89a370d3bcef312cfd54d"

DEPENDS = "npm-meow-native \
           npm-rehype-parse-native \
           npm-rehype-retext-native \
           npm-remark-frontmatter-native \
           npm-remark-mdx-native \
           npm-remark-message-control-native \
           npm-remark-parse-native \
           npm-remark-retext-native \
           npm-retext-english-native \
           npm-retext-equality-native \
           npm-retext-profanities-native \
           npm-unified-diff-native \
           npm-unified-engine-native \
           npm-unified-native \
           npm-update-notifier-native \
           npm-vfile-native \
           npm-vfile-reporter-native \
           npm-vfile-sort-native"

SRC_URI = "https://registry.npmjs.org/alex/-/alex-9.0.1.tgz"
SRC_URI[md5sum] = "b43c5247e0556742f7f8815314221292"
SRC_URI[sha256sum] = "fdc022406dd69ded7efec38ec193d1c4d3fcf325b8b9586d65dfcb3da73efde1"

NPM_PKGNAME = "alex"

inherit npmhelper
inherit native
