SUMMARY = "NPM: cspell-dict-ruby"
DESCRIPTION = "For ruby and ruby on rails"
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/ruby#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=62f84db3eea2ff0da5510fedd081ea0c"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-ruby/-/cspell-dict-ruby-1.1.0.tgz"
SRC_URI[md5sum] = "d7a46088cfedcd7c966e782db816af34"
SRC_URI[sha256sum] = "da18019946bd0c2b739a58d9a0d82da652ddc538b18a9e3f452dffd523c8845b"

NPM_PKGNAME = "cspell-dict-ruby"

inherit npmhelper
inherit native
