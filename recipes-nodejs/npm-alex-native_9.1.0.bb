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

SRC_URI = "https://registry.npmjs.org/alex/-/alex-9.1.0.tgz"
SRC_URI[md5sum] = "cf09b9fa48fa8dc915c52aaed4a80250"
SRC_URI[sha256sum] = "99748d3262823a59b1e157c45f8d427c69a09d671c1f8606178b42a8baf5e8af"

NPM_PKGNAME = "alex"

inherit npmhelper
inherit native
