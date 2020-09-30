SUMMARY = "NPM: postcss"
DESCRIPTION = "Tool for transforming styles with JS plugins"
HOMEPAGE = "https://postcss.org/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e0ef868fdaaba6859dcbab082c20439b"

DEPENDS = "npm-colorette-native \
           npm-line-column-native \
           npm-nanoid-native \
           npm-source-map-native"

SRC_URI = "https://registry.npmjs.org/postcss/-/postcss-8.1.1.tgz"
SRC_URI[md5sum] = "13ee13b32fdea0456cc89fa0af2c6a95"
SRC_URI[sha256sum] = "4693c2c71f1896dd6699c7eb716e6c8f33aa34ddbd4ce58ad997ec2d5f4454b4"

NPM_PKGNAME = "postcss"

inherit npmhelper
inherit native
