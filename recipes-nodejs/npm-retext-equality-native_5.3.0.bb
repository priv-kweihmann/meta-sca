SUMMARY = "NPM: retext-equality"
DESCRIPTION = "retext plugin to warn about possible insensitive, inconsiderate language"
HOMEPAGE = "https://github.com/retextjs/retext-equality#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=91fb5297439b32d9cd49df8a2484d3eb"

DEPENDS = "npm-nlcst-normalize-native \
           npm-nlcst-search-native \
           npm-nlcst-to-string-native \
           npm-quotation-native \
           npm-unist-util-is-native \
           npm-unist-util-visit-native"

SRC_URI = "https://registry.npmjs.org/retext-equality/-/retext-equality-5.3.0.tgz"
SRC_URI[md5sum] = "26a2486ccf81e7cc66fdef945cfe7e36"
SRC_URI[sha256sum] = "544215c06ad18e9e1f8bca3fe89861866412ad3eca9f5360c85e62f7c6963e3c"

NPM_PKGNAME = "retext-equality"

inherit npmhelper
inherit native
