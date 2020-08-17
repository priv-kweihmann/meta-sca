SUMMARY = "NPM: cspell-dict-ruby"
DESCRIPTION = "For ruby and ruby on rails"
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/ruby#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fd6ca8d8865d18c1a5a6696c0f841ff0"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-ruby/-/cspell-dict-ruby-1.0.5.tgz"
SRC_URI[md5sum] = "1f463432f32ccb964173df49414973fe"
SRC_URI[sha256sum] = "ded71eee5aad09df801cdcccf418818089d1b68118b6a2aaba4fb2afba842883"

NPM_PKGNAME = "cspell-dict-ruby"

inherit npmhelper
inherit native
