SUMMARY = "NPM: normalize-url"
DESCRIPTION = "Normalize a URL"
HOMEPAGE = "https://github.com/sindresorhus/normalize-url#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/normalize-url/-/normalize-url-7.0.0.tgz"
SRC_URI[md5sum] = "6ab512cb08e5b7c9615bab5e611ddac0"
SRC_URI[sha256sum] = "0f6af3a00dcb2bc504b069f0fd82afbcb559f7a418187ae3f6b80d4fbfcca163"

NPM_PKGNAME = "normalize-url"

inherit npmhelper
inherit native
