SUMMARY = "NPM: cspell-dict-ruby"
DESCRIPTION = "For ruby and ruby on rails"
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/ruby#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fd6ca8d8865d18c1a5a6696c0f841ff0"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-ruby/-/cspell-dict-ruby-1.0.8.tgz"
SRC_URI[md5sum] = "6a6182772e1d13f3f4fcf5797e519e4d"
SRC_URI[sha256sum] = "d206ab3d33b39445e40048f041ef05bf6f2c8dcdf773dc38f7022d9641d5c51f"

NPM_PKGNAME = "cspell-dict-ruby"

inherit npmhelper
inherit native
