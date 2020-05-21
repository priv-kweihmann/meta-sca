SUMMARY = "NPM: remark-retext"
DESCRIPTION = "remark plugin to transform to retext"
HOMEPAGE = "https://github.com/remarkjs/remark-retext#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=8e9f707ac01af145c36ef2adde15d7e4"

DEPENDS = "npm-mdast-util-to-nlcst-native"

SRC_URI = "https://registry.npmjs.org/remark-retext/-/remark-retext-4.0.0.tgz"
SRC_URI[md5sum] = "f9b64ce87076c9470ac82bd297d5c803"
SRC_URI[sha256sum] = "8fb8dc578e12fd56af505e8bd1a8d159ed73ddc8fa9e842fadba12d740ed03ee"

NPM_PKGNAME = "remark-retext"

inherit npmhelper
inherit native
