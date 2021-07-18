SUMMARY = "NPM: @types/mdast"
DESCRIPTION = "TypeScript definitions for Mdast"
HOMEPAGE = "https://github.com/DefinitelyTyped/DefinitelyTyped/tree/master/types/mdast"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d4a904ca135bb7bc912156fee12726f0"

DEPENDS = "npm-types-unist-native"

SRC_URI = "https://registry.npmjs.org/@types/mdast/-/mdast-3.0.7.tgz"
SRC_URI[md5sum] = "aa90c63e1c9495524b6552f4fa376ca1"
SRC_URI[sha256sum] = "7c0b998d59393ac67ac286a41c92395c3c1ed7eebcd0b225d0be8ddfc2ec2331"

NPM_PKGNAME = "@types/mdast"

inherit npmhelper
inherit native

S = "${WORKDIR}/mdast"
