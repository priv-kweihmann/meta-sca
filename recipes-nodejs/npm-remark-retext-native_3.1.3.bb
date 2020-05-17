SUMMARY = "NPM: remark-retext"
DESCRIPTION = "remark plugin to transform to retext"
HOMEPAGE = "https://github.com/remarkjs/remark-retext#readme"

DEPENDS = "npm-mdast-util-to-nlcst-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=8e9f707ac01af145c36ef2adde15d7e4"

SRC_URI = "https://registry.npmjs.org/remark-retext/-/remark-retext-3.1.3.tgz"
SRC_URI[md5sum] = "8412aa73dc889be05c51585afee26604"
SRC_URI[sha256sum] = "3877b14765fd313c0ed4fa31ea32cb782b5834adeabea4b3baec532ac3da213b"

NPM_PKGNAME = "remark-retext"

inherit npmhelper
inherit native
