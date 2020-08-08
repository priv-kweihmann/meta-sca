SUMMARY = "NPM: cspell-dict-ruby"
DESCRIPTION = "For ruby and ruby on rails"
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/ruby#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fd6ca8d8865d18c1a5a6696c0f841ff0"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-ruby/-/cspell-dict-ruby-1.0.4.tgz"
SRC_URI[md5sum] = "f6f47421c402dcccf8ffc9bd8dadcb4b"
SRC_URI[sha256sum] = "cd2ae183cd65d945e8303a590bd9f060d9b5c801f5d9b7aa54d5ab6a47fa3aa5"

NPM_PKGNAME = "cspell-dict-ruby"

inherit npmhelper
inherit native
