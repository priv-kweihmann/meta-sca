SUMMARY = "NPM: is-npm"
DESCRIPTION = "Check if your code is running as an npm script"
HOMEPAGE = "https://github.com/sindresorhus/is-npm#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/is-npm/-/is-npm-6.0.0.tgz"
SRC_URI[md5sum] = "74100b80cd762e94d16a2da23d7e3894"
SRC_URI[sha256sum] = "e3056f6b5ba5253b2b6589702ff95253c613319758275bedb91934ac9859c3aa"

NPM_PKGNAME = "is-npm"

inherit npmhelper
inherit native
