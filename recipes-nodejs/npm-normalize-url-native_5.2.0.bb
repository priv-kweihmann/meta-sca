SUMMARY = "NPM: normalize-url"
DESCRIPTION = "Normalize a URL"
HOMEPAGE = "https://github.com/sindresorhus/normalize-url#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=915042b5df33c31a6db2b37eadaa00e3"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/normalize-url/-/normalize-url-5.2.0.tgz"
SRC_URI[md5sum] = "a297c51b79b1f82a959709c9eb479fd9"
SRC_URI[sha256sum] = "0231b0f9587ba2cf6051c7f3bfde6196b4d85dff3051d50b4232aa8d8ea68024"

NPM_PKGNAME = "normalize-url"

inherit npmhelper
inherit native
