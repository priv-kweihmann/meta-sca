SUMMARY = "NPM: cspell-dict-ruby"
DESCRIPTION = "For ruby and ruby on rails"
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/ruby#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fd6ca8d8865d18c1a5a6696c0f841ff0"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-ruby/-/cspell-dict-ruby-1.0.3.tgz"
SRC_URI[md5sum] = "86cd41ee65539dd0b1131cd89ed15f78"
SRC_URI[sha256sum] = "126b2767ba1e4325dd07ca2303763370a58ee140b37f259dd8e10a2df1194b70"

NPM_PKGNAME = "cspell-dict-ruby"

inherit npmhelper
inherit native
