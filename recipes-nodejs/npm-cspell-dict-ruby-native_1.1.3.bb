SUMMARY = "NPM: cspell-dict-ruby"
DESCRIPTION = "For ruby and ruby on rails"
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/ruby#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=62f84db3eea2ff0da5510fedd081ea0c"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-ruby/-/cspell-dict-ruby-1.1.3.tgz"
SRC_URI[md5sum] = "299fa39e5d3cd435fec0a8ad5d7172ba"
SRC_URI[sha256sum] = "f3932fdbefc9404c26ca344a3f7aedf9bf6f39115c80bb626074c635b5428002"

NPM_PKGNAME = "cspell-dict-ruby"

inherit npmhelper
inherit native
