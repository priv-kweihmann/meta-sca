SUMMARY = "NPM: alex"
DESCRIPTION = "Catch insensitive, inconsiderate writing"
HOMEPAGE = "https://alexjs.com"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=82fd7b0a70b89a370d3bcef312cfd54d"

DEPENDS = "npm-meow-native \
           npm-rehype-parse-native \
           npm-rehype-retext-native \
           npm-remark-frontmatter-native \
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

SRC_URI = "https://registry.npmjs.org/alex/-/alex-8.1.1.tgz"
SRC_URI[md5sum] = "973d26d8a0eb3a1c081c9dcf28df3dbf"
SRC_URI[sha256sum] = "04129e9131fb3f19d9880e4a34dacb8f19f96b5c373c642873ce24d699bcbe3e"

NPM_PKGNAME = "alex"

inherit npmhelper
inherit native
