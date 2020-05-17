SUMMARY = "NPM: is-descriptor"
DESCRIPTION = "Returns true if a value has the characteristics of a valid JavaScript descriptor. Works for data descriptors and accessor descriptors."
HOMEPAGE = "https://github.com/jonschlinkert/is-descriptor"

DEPENDS = "npm-is-accessor-descriptor-native npm-is-data-descriptor-native npm-kind-of-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=78c705080a639d3bb4085a9d1bb22987"

SRC_URI = "https://registry.npmjs.org/is-descriptor/-/is-descriptor-1.0.2.tgz"
SRC_URI[md5sum] = "7cd33adcb4ca927942b08b261badd3ed"
SRC_URI[sha256sum] = "fe5ee7a359c2ae4ec7c12a075d903150c23365bf55c0c471b8d34fade96c6ead"

NPM_PKGNAME = "is-descriptor"

inherit npmhelper
inherit native
