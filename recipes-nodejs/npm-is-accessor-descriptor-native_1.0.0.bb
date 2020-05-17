SUMMARY = "NPM: is-accessor-descriptor"
DESCRIPTION = "Returns true if a value has the characteristics of a valid JavaScript accessor descriptor."
HOMEPAGE = "https://github.com/jonschlinkert/is-accessor-descriptor"

DEPENDS = "npm-kind-of-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1027d1336ffdd3b96ff1cfd1d3bea3fc"

SRC_URI = "https://registry.npmjs.org/is-accessor-descriptor/-/is-accessor-descriptor-1.0.0.tgz"
SRC_URI[md5sum] = "71d1d01f8028c245544a9a1217fb2bce"
SRC_URI[sha256sum] = "14f7ea5a61dbaf00843ea03e55f20e3daf0db2bf1efe8aee3bde60d080a6cba3"

NPM_PKGNAME = "is-accessor-descriptor"

inherit npmhelper
inherit native
