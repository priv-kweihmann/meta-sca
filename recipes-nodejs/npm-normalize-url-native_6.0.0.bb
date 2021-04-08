SUMMARY = "NPM: normalize-url"
DESCRIPTION = "Normalize a URL"
HOMEPAGE = "https://github.com/sindresorhus/normalize-url#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=915042b5df33c31a6db2b37eadaa00e3"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/normalize-url/-/normalize-url-6.0.0.tgz"
SRC_URI[md5sum] = "c347a8c40ed844ed851bf038c8fa505b"
SRC_URI[sha256sum] = "8c63848e85a491bc09fee82633abe95f1e5f88e60ab971c49c1eb70460d4f31e"

NPM_PKGNAME = "normalize-url"

inherit npmhelper
inherit native
