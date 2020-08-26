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

SRC_URI = "https://registry.npmjs.org/retext-equality/-/retext-equality-5.2.0.tgz"
SRC_URI[md5sum] = "a037af43294d7bb55b3f3e8bdc4c7fd6"
SRC_URI[sha256sum] = "24e2d24cd08f742df8a5513fd7b87568afb7b4c0db5e3dba4d951ef4deb4661b"

NPM_PKGNAME = "retext-equality"

inherit npmhelper
inherit native
