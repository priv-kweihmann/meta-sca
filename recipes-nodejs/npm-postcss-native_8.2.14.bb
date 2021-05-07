SUMMARY = "NPM: postcss"
DESCRIPTION = "Tool for transforming styles with JS plugins"
HOMEPAGE = "https://postcss.org/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e0ef868fdaaba6859dcbab082c20439b"

DEPENDS = "npm-colorette-native \
           npm-nanoid-native \
           npm-source-map-native"

SRC_URI = "https://registry.npmjs.org/postcss/-/postcss-8.2.14.tgz"
SRC_URI[md5sum] = "a23e4bd258b50394c85265eafa1b1c57"
SRC_URI[sha256sum] = "783428715094f4a5bd1ba35a1e42e39495fd9f8107b2e97072b349da0f31b46f"

NPM_PKGNAME = "postcss"

inherit npmhelper
inherit native
