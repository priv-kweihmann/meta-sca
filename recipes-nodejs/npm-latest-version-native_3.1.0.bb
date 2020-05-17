SUMMARY = "NPM: latest-version"
DESCRIPTION = "Get the latest version of an npm package"
HOMEPAGE = "https://github.com/sindresorhus/latest-version#readme"

DEPENDS = "npm-package-json-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=a12ebca0510a773644101a99a867d210"

SRC_URI = "https://registry.npmjs.org/latest-version/-/latest-version-3.1.0.tgz"
SRC_URI[md5sum] = "c18ce8803782d5f5f327c2d25e98f691"
SRC_URI[sha256sum] = "238b739bbae7ecebfac0f9d92b7bd6a10a046ea5d92ab54049d47970db672f43"

NPM_PKGNAME = "latest-version"

inherit npmhelper
inherit native
