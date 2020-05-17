SUMMARY = "NPM: retext-english"
DESCRIPTION = "retext parser for the English language"
HOMEPAGE = "https://github.com/retextjs/retext"

DEPENDS = "npm-parse-english-native npm-unherit-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://readme.md;beginline=102;endline=103;md5=f7cd6e61bbbca39fe0e60b4899302d5a"

SRC_URI = "https://registry.npmjs.org/retext-english/-/retext-english-3.0.4.tgz"
SRC_URI[md5sum] = "2cc94e341926afedbd41d5b335449b9d"
SRC_URI[sha256sum] = "521f289fd7e18c7d195f52bcafe171ba121904f430c9456da1a9a27be14e3191"

NPM_PKGNAME = "retext-english"

inherit npmhelper
inherit native
