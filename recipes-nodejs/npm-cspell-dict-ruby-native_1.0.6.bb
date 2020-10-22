SUMMARY = "NPM: cspell-dict-ruby"
DESCRIPTION = "For ruby and ruby on rails"
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/ruby#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fd6ca8d8865d18c1a5a6696c0f841ff0"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-ruby/-/cspell-dict-ruby-1.0.6.tgz"
SRC_URI[md5sum] = "11c2e4b670f80fe9ebd3b58fd30756dd"
SRC_URI[sha256sum] = "2aeadb9764860f674278f96ec3adac02635e811a6ddbdd5c79917b1709accb9a"

NPM_PKGNAME = "cspell-dict-ruby"

inherit npmhelper
inherit native
