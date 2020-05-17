SUMMARY = "NPM: rimraf"
DESCRIPTION = "A deep deletion module for node (like `rm -rf`)"
HOMEPAGE = "https://github.com/isaacs/rimraf#readme"

DEPENDS = "npm-glob-native"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=82703a69f6d7411dde679954c2fd9dca"

SRC_URI = "https://registry.npmjs.org/rimraf/-/rimraf-2.6.3.tgz"
SRC_URI[md5sum] = "bd58522df35ee7b727430b41720e912d"
SRC_URI[sha256sum] = "8cb56fcabdd214cf19ce24cf82a11950093f388670d01f6b112cc2d86cf67f7e"

NPM_PKGNAME = "rimraf"

inherit npmhelper
inherit native
