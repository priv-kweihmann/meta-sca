SUMMARY = "NPM: is-descriptor"
DESCRIPTION = "Returns true if a value has the characteristics of a valid JavaScript descriptor. Works for data descriptors and accessor descriptors."
HOMEPAGE = "https://github.com/jonschlinkert/is-descriptor"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b561e0a423bedc9d9ca9c8c67d40abb9"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/is-descriptor/-/is-descriptor-3.0.0.tgz"
SRC_URI[md5sum] = "abfd1a93b7cd0426d6571554c84ffdce"
SRC_URI[sha256sum] = "8c08860ed6d266d9dcbdad9429c097cfcbf2ec7fd685cafbee0d0910a01c2d0d"

NPM_PKGNAME = "is-descriptor"

inherit npmhelper
inherit native
