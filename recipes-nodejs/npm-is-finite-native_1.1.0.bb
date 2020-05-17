SUMMARY = "NPM: is-finite"
DESCRIPTION = "ES2015 Number.isFinite() ponyfill"
HOMEPAGE = "https://github.com/sindresorhus/is-finite#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=915042b5df33c31a6db2b37eadaa00e3"

SRC_URI = "https://registry.npmjs.org/is-finite/-/is-finite-1.1.0.tgz"
SRC_URI[md5sum] = "cbed82c1a1b8e837e6b455a85aeaa501"
SRC_URI[sha256sum] = "7e39741935706d92e9ade928fdfd75cd39dab7c1ab3f3188c777fed2f2002c06"

NPM_PKGNAME = "is-finite"

inherit npmhelper
inherit native
