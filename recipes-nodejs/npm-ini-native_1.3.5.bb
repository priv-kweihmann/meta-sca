SUMMARY = "NPM: ini"
DESCRIPTION = "An ini encoder/decoder for node"
HOMEPAGE = "https://github.com/isaacs/ini#readme"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=82703a69f6d7411dde679954c2fd9dca"

SRC_URI = "https://registry.npmjs.org/ini/-/ini-1.3.5.tgz"
SRC_URI[md5sum] = "c8ec3146ed3fd62cfba96b970fd2c355"
SRC_URI[sha256sum] = "fe8ebd87cc87404eeb3ec89880bc49d83df337f8b95a504366c4674f3646785d"

NPM_PKGNAME = "ini"

inherit npmhelper
inherit native
