SUMMARY = "NPM: cspell-dict-ruby"
DESCRIPTION = "For ruby and ruby on rails"
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/ruby#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=62f84db3eea2ff0da5510fedd081ea0c"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-ruby/-/cspell-dict-ruby-1.0.11.tgz"
SRC_URI[md5sum] = "fc13790ab3a32805a7fcf29df411a045"
SRC_URI[sha256sum] = "aba227a0a0f2adcfb0fdd0803b3937da29ae2b165942479cc8dd86998947f2e3"

NPM_PKGNAME = "cspell-dict-ruby"

inherit npmhelper
inherit native
