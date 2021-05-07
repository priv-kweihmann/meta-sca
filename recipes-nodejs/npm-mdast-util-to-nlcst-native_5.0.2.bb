SUMMARY = "NPM: mdast-util-to-nlcst"
DESCRIPTION = "mdast utility to transform to nlcst"
HOMEPAGE = "https://github.com/syntax-tree/mdast-util-to-nlcst#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=91fb5297439b32d9cd49df8a2484d3eb"

DEPENDS = "npm-nlcst-to-string-native \
           npm-repeat-string-native \
           npm-types-mdast-native \
           npm-types-repeat-string-native \
           npm-types-unist-native \
           npm-unist-util-position-native \
           npm-vfile-location-native \
           npm-vfile-native"

SRC_URI = "https://registry.npmjs.org/mdast-util-to-nlcst/-/mdast-util-to-nlcst-5.0.2.tgz"
SRC_URI[md5sum] = "09bf944f0e115902b9b09becf62a5c9e"
SRC_URI[sha256sum] = "9babd2bd256c89b4010cdc9e47649cc129ccc4e37de18d0bc9fc625d14a06109"

NPM_PKGNAME = "mdast-util-to-nlcst"

inherit npmhelper
inherit native
