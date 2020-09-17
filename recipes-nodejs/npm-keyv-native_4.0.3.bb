SUMMARY = "NPM: keyv"
DESCRIPTION = "Simple key-value storage with support for multiple backends"
HOMEPAGE = "https://github.com/lukechilds/keyv"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=9a2baa6947d5018096b83508bd94026e"

DEPENDS = "npm-json-buffer-native"

SRC_URI = "https://registry.npmjs.org/keyv/-/keyv-4.0.3.tgz"
SRC_URI[md5sum] = "16b6facaa1fa8fa392d1caeb7093c589"
SRC_URI[sha256sum] = "3a1ad68726855652b4a2589d9f1fd30c84aa6a79239f991800c3988955e5426d"

NPM_PKGNAME = "keyv"

inherit npmhelper
inherit native
