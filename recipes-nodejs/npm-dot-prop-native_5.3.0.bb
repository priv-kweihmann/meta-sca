SUMMARY = "NPM: dot-prop"
DESCRIPTION = "Get, set, or delete a property from a nested object using a dot path"
HOMEPAGE = "https://github.com/sindresorhus/dot-prop#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=915042b5df33c31a6db2b37eadaa00e3"

DEPENDS = "npm-is-obj-native"

SRC_URI = "https://registry.npmjs.org/dot-prop/-/dot-prop-5.3.0.tgz"
SRC_URI[md5sum] = "d42e0b2e48f62ca66a99aded470533a2"
SRC_URI[sha256sum] = "af3e20d7ce34edd734aef01ae1a05960db108499d1b45a68666b45caedf8e65c"

NPM_PKGNAME = "dot-prop"

inherit npmhelper
inherit native
