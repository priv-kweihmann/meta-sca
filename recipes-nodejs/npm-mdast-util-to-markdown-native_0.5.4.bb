SUMMARY = "NPM: mdast-util-to-markdown"
DESCRIPTION = "mdast utility to serialize markdown"
HOMEPAGE = "https://github.com/syntax-tree/mdast-util-to-markdown#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=6a9c614ad8a32fcd51b47e458d620e48"

DEPENDS = "npm-longest-streak-native \
           npm-mdast-util-to-string-native \
           npm-parse-entities-native \
           npm-repeat-string-native \
           npm-types-unist-native \
           npm-zwitch-native"

SRC_URI = "https://registry.npmjs.org/mdast-util-to-markdown/-/mdast-util-to-markdown-0.5.4.tgz"
SRC_URI[md5sum] = "8dc054d658e3bf25d49cb184fc2113e9"
SRC_URI[sha256sum] = "ef11834418180e4857b14883a4ddd09a2775430a25c3b8e2865e72b2cb83353f"

NPM_PKGNAME = "mdast-util-to-markdown"

inherit npmhelper
inherit native
