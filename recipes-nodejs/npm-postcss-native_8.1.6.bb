SUMMARY = "NPM: postcss"
DESCRIPTION = "Tool for transforming styles with JS plugins"
HOMEPAGE = "https://postcss.org/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e0ef868fdaaba6859dcbab082c20439b"

DEPENDS = "npm-colorette-native \
           npm-line-column-native \
           npm-nanoid-native \
           npm-source-map-native"

SRC_URI = "https://registry.npmjs.org/postcss/-/postcss-8.1.6.tgz"
SRC_URI[md5sum] = "756890ff0b09d68f45add1b9eec5d911"
SRC_URI[sha256sum] = "48a916bca087361202552714d207cd7953af2b8488ceb73a6e2c90823c7f17ce"

NPM_PKGNAME = "postcss"

inherit npmhelper
inherit native
