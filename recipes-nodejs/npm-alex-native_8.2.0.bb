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

SRC_URI = "https://registry.npmjs.org/alex/-/alex-8.2.0.tgz"
SRC_URI[md5sum] = "23bdb85d58d288dbc56cce6438c2db65"
SRC_URI[sha256sum] = "85770cebc0158406b446065f7832ddd7fb9304bf03def4efc657ebc85d130716"

NPM_PKGNAME = "alex"

inherit npmhelper
inherit native
