SUMMARY = "NPM: cspell-dict-ruby"
DESCRIPTION = "For ruby and ruby on rails"
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/ruby#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=62f84db3eea2ff0da5510fedd081ea0c"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-ruby/-/cspell-dict-ruby-1.1.4.tgz"
SRC_URI[md5sum] = "033034c9963fa8e3b830196fad30b90e"
SRC_URI[sha256sum] = "fd6e2a8a52b79cde02b3eb5f3919f9b0b6c3f5b9662bded2faa59a52f8467323"

NPM_PKGNAME = "cspell-dict-ruby"

inherit npmhelper
inherit native
