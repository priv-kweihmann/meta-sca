SUMMARY = "NPM: strip-ansi"
DESCRIPTION = "Strip ANSI escape codes from a string"
HOMEPAGE = "https://github.com/chalk/strip-ansi#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = "npm-ansi-regex-native"

SRC_URI = "https://registry.npmjs.org/strip-ansi/-/strip-ansi-7.0.0.tgz"
SRC_URI[md5sum] = "01eb44f1c3a84e2b76b7b221ec720f5c"
SRC_URI[sha256sum] = "a1dec7b9c995770da9db1f4bf1360542b93ebb31ef14e5f2fa354d87bb7ae1fd"

NPM_PKGNAME = "strip-ansi"

inherit npmhelper
inherit native
